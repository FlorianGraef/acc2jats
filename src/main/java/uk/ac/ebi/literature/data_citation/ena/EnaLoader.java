package uk.ac.ebi.literature.data_citation.ena;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import uk.ac.ebi.literature.data_citation.common.ElementCitationBuilder;
import uk.ac.ebi.literature.data_citation.common.RepositoryLoader;
import uk.ac.ebi.literature.data_citation.common.jats.ElementCitation;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.Entry;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.EntryImpl;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl.ROOTImpl;
import uk.ac.ebi.literature.db.dao.DataCitationDAO;
import uk.ac.ebi.literature.db.model.DataCitation.DataRecordsEntity;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.*;
/**
 * Created by graf on 19/08/15.
 */
public class EnaLoader extends RepositoryLoader {
    public void load(DataCitationDAO dataCitationDAO) {
        Map<String, Set<String>> accMapping = getAccessionMappings(dataCitationDAO, "/home/graf/Downloads/ENA_PMC(2).csv");

        loadFromRepositoryApi(dataCitationDAO, accMapping);

        // create all the links!
//        linkData(dataCitationDAO, accMapping);
    }

    private void loadFromRepositoryApi(DataCitationDAO dataCitationDAO, Map<String, Set<String>> accMapping) {
        String query;// = new String("http://www.ebi.ac.uk/ena/data/view/AACH01000026%26display%3Dxml");
        JAXBContext jc;
        Unmarshaller unmarshaller = null;
        try {
            jc = JAXBContext.newInstance(ROOTImpl.class);
            unmarshaller = jc.createUnmarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        try {
            for (String enaId : accMapping.keySet()){
                query = "http://www.ebi.ac.uk/ena/data/view/" + enaId + "%26display%3Dxml";
                List<DataRecordsEntity> dataRecordsEntityList = processAccession(query, unmarshaller);
                for (DataRecordsEntity dr : dataRecordsEntityList){
                    if (dataCitationDAO.insertEntry(dr)
                            && (dr.getPrimaryPublicationDoi() != null || dr.getPrimaryPublicationPmid() != null)) {
                        dataCitationDAO.linkToPrimaryCitation(dr);
                    }
                }
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private List<DataRecordsEntity> processAccession(String query, Unmarshaller unmarshaller) throws IOException, JAXBException {
        DataRecordsEntity dre;
        URL queryUrl = new URL(query);
        HttpURLConnection conn = (HttpURLConnection) queryUrl.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/xml");
        InputStream enaRestXMLResponse = conn.getInputStream();
        List<DataRecordsEntity> dataRecordsEntityList = null;

        if (unmarshaller != null){
            dataRecordsEntityList = new LinkedList<DataRecordsEntity>();
            Object o = unmarshaller.unmarshal(enaRestXMLResponse);
            if (o instanceof ROOTImpl){
                ROOTImpl root = (ROOTImpl) o;
                List<Object> olist = root.getANALYSISSETSAndANALYSISESAndEXPERIMENTSETS();
                if (olist != null){
                    for (Object o1:olist){
                        if (o1 instanceof EntryImpl){
                            // got the entry point now start getting:
                            // Accession
                            // submitters
                            // dataset title
                            // deposition date
                            // release date
                            // modification date
                            // version
                            // reference to primary publication

                            Entry entry = (EntryImpl) o1;
                            dre = new DataRecordsEntity();

                            // accession
                            if (entry.getAccession() != null){
                                dre.setIdentifier(entry.getAccession());
                                System.out.println("Accession: " + entry.getAccession());
                            }

                            // type
                            if (entry.getMoleculeType() != null){
                                System.out.println("Data Type: " + entry.getMoleculeType());
                                dre.setType(entry.getMoleculeType());
                            }

                            dre.setSource("ENA");

                            // title
                            if (entry.getDescription() != null){
                                dre.setDatasetTitle(entry.getDescription());
                                System.out.println("Title: " + entry.getDescription());
                            }

                            // first public
                            if (entry.getFirstPublic() != null){
                                dre.setReleaseDate(new Timestamp(entry.getFirstPublic().toGregorianCalendar().getTimeInMillis()));
                                System.out.println("First Public Date: " + entry.getFirstPublic());
                            }

                            // modification date
                            if (entry.getLastUpdated() != null){
                                System.out.println("Modifaction date: " + entry.getLastUpdated());
                                dre.setModificationDate(new Timestamp(entry.getLastUpdated().toGregorianCalendar().getTimeInMillis()));
                            }

                            // Version. what does it mean?
                            if (entry.getVersion() != null){
                                dre.setVersion(entry.getVersion().toString());
                                System.out.println("Version: " + entry.getVersion());
                            }

                            if (entry.getReferences() != null){
                                handleReferences(entry.getReferences(), dre);
                            }

                            // put into list
                            dataRecordsEntityList.add(dre);

                        }
                    }
                }
            }
        }
        return dataRecordsEntityList;
    }

    public String getJats(String accession) throws JAXBException, IOException {
        System.out.println("initialized the JATS getter");
        //initializing jaxb
        String query;// = new String("http://www.ebi.ac.uk/ena/data/view/AACH01000026%26display%3Dxml");
        JAXBContext jc;
        Unmarshaller unmarshaller = null;

        JAXBContext dataCitationContext = JAXBContext.newInstance(ElementCitation.class);
        Marshaller dcMarshaller = dataCitationContext.createMarshaller();
        dcMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        StringWriter stringWriter = new StringWriter();

        jc = JAXBContext.newInstance(ROOTImpl.class);
        unmarshaller = jc.createUnmarshaller();


        query = "http://www.ebi.ac.uk/ena/data/view/" + accession + "%26display%3Dxml";

        DataRecordsEntity dre;
        URL queryUrl = new URL(query);
        HttpURLConnection conn = (HttpURLConnection) queryUrl.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/xml");
        InputStream enaRestXMLResponse = conn.getInputStream();
        List<ElementCitation> elementCitationList = null;


        ElementCitationBuilder ecb;

        if (unmarshaller != null){
            elementCitationList = new LinkedList<ElementCitation>();
            Object o = unmarshaller.unmarshal(enaRestXMLResponse);
            if (o instanceof ROOTImpl){
                ROOTImpl root = (ROOTImpl) o;
                List<Object> olist = root.getANALYSISSETSAndANALYSISESAndEXPERIMENTSETS();
                if (olist != null){
                    for (Object o1:olist){
                        if (o1 instanceof EntryImpl){
                            // got the entry point now start getting:
                            // Accession
                            // submitters
                            // dataset title
                            // deposition date
                            // release date
                            // modification date
                            // version
                            // reference to primary publication

                            Entry entry = (EntryImpl) o1;

                            // accession
                            if (entry.getAccession() != null){
                                ecb = new ElementCitationBuilder(entry.getAccession());
                                System.out.println("Accession: " + entry.getAccession());

                                // type
                                if (entry.getMoleculeType() != null){
                                    System.out.println("Data Type: " + entry.getMoleculeType());
                                    //dre.setType(entry.getMoleculeType());
                                }

                                ecb = ecb.addSource("ENA");
                                //dre.setSource("ENA");

                                // title
                                if (entry.getDescription() != null){
                                    ecb = ecb.dataTitle(entry.getDescription());
                                    System.out.println("Title: " + entry.getDescription());
                                }

                                // first public
                                if (entry.getFirstPublic() != null){
                                    ecb = ecb.addDate("pub", new Timestamp(entry.getFirstPublic().toGregorianCalendar().getTimeInMillis()));
                                    //dre.setReleaseDate(new Timestamp(entry.getFirstPublic().toGregorianCalendar().getTimeInMillis()));
                                    System.out.println("First Public Date: " + entry.getFirstPublic());
                                }

                                // modification date
                                if (entry.getLastUpdated() != null){
                                    System.out.println("Modifaction date: " + entry.getLastUpdated());
                                    ecb=ecb.addDate("corrected", new Timestamp(entry.getLastUpdated().toGregorianCalendar().getTimeInMillis()));
                                }

                                // Version
                                if (entry.getVersion() != null){
                                    //dre.setVersion(entry.getVersion().toString());
                                    ecb.Version(entry.getVersion().toString());
                                    System.out.println("Version: " + entry.getVersion());
                                }

                                if (entry.getReferences() != null){
                                    ecb = handleReferences(entry.getReferences(), ecb);
                                }

                                ecb = ecb.addPubId(entry.getAccession(), "accession", "http://www.ebi.ac.uk/ena/data/view/", "INSDC" );
                                // marshal
                                ElementCitation elementCitation = ecb.build();
                                dcMarshaller.marshal(elementCitation, System.out);
                                dcMarshaller.marshal(elementCitation, stringWriter);
                                //elementCitationList.add(ecb.build());
                            }
                        }
                    }
                }
            }
        }
        return stringWriter.toString();
    }

    private void handleReferences(List<Entry.Reference> references, DataRecordsEntity dataRecordsEntity) {
        for (Entry.Reference ref : references){
            if (ref.getType().equals("article")){
                System.out.println("belongs to Article: " + ref.getTitle());
                System.out.println("Of authors: "+ref.getAuthors());
                // check identifier and create link
            } else if (ref.getType().equals("submission")&&ref.getReferenceLocation().contains("INSDC")){
                if (ref.getAuthors() != null) {
                    System.out.println("Submitter:"+ref.getAuthors());
                    dataRecordsEntity.setSubmitter(String.join(", ", ref.getAuthors()));
                }
                if (ref.getSubmissionDate() != null) {
                    System.out.println("Submission Date: " + ref.getSubmissionDate().toString());
                    dataRecordsEntity.setSubmissionDate(new Timestamp(ref.getSubmissionDate().toGregorianCalendar().getTimeInMillis()));
                }
            }
        }
    }

    private ElementCitationBuilder handleReferences(List<Entry.Reference> references, ElementCitationBuilder ecb) {
        for (Entry.Reference ref : references){
            if (ref.getType().equals("article")){
                System.out.println("belongs to Article: " + ref.getTitle());
                System.out.println("Of authors: "+ref.getAuthors());
                // check identifier and create link
            } else if (ref.getType().equals("submission")&&ref.getReferenceLocation().contains("INSDC")){
                if (ref.getAuthors() != null) {
                    System.out.println("Submitter:"+ref.getAuthors());
                    for (String sub : ref.getAuthors()){

                        ecb = ecb.addSubmitter(sub);
                    }
//                    dataRecordsEntity.setSubmitter(String.join(", ", ref.getAuthors()));
                }
                if (ref.getSubmissionDate() != null) {
                    System.out.println("Submission Date: " + ref.getSubmissionDate().toString());
                    ecb = ecb.addDate("received", new Timestamp(ref.getSubmissionDate().toGregorianCalendar().getTimeInMillis()));
                }
            }
        }
        return ecb;
    }

    private static Map<String, Set<String>> getAccessionMappings(DataCitationDAO dataCitationDAO, String fileName) {
        Set<String> oaPmcIds = dataCitationDAO.getOAPmcIds();
        Set<String> pmcIds = new HashSet<String>();

        Map<String, Set<String>> accMapping = new HashMap<String, Set<String>>();
        //read csv file
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            Iterable<CSVRecord> pdbRecords = CSVFormat.EXCEL.withHeader().parse(in);
            String key;
            for (CSVRecord record : pdbRecords) {
                key = record.get("ENA").toLowerCase();
                if (record.get("PMCID") != null) {
                    pmcIds.add(record.get("PMCID"));
                }
                if (oaPmcIds.contains(record.get("PMCID"))) {
                    if (accMapping.containsKey(key)) {
                        accMapping.get(key).add(record.get("PMCID"));
                    } else {
                        Set valueSet = new HashSet<String>();
                        valueSet.add(record.get("PMCID"));
                        accMapping.put(key, valueSet);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return accMapping;
    }
}
