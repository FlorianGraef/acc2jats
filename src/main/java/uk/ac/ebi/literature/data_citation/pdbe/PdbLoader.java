package uk.ac.ebi.literature.data_citation.pdbe;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang.StringUtils;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import uk.ac.ebi.literature.data_citation.common.ElementCitationBuilder;
import uk.ac.ebi.literature.data_citation.common.RepositoryLoader;
import uk.ac.ebi.literature.data_citation.common.jats.*;
import uk.ac.ebi.literature.data_citation.common.jats.Date;
import uk.ac.ebi.literature.db.dao.DataCitationDAO;
import uk.ac.ebi.literature.db.dao.impl.DataCitationDAOImpl;
import uk.ac.ebi.literature.db.model.DataCitation.CitationsEntity;
import uk.ac.ebi.literature.db.model.DataCitation.DataRecordsEntity;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.*;
import java.util.List;

public class PdbLoader extends RepositoryLoader {
    private static final int pageSize = 1000;
    private static Integer start = 0;
    private static final String pdbSolrUrl = "http://www.ebi.ac.uk/pdbe/search/pdb/";

    public String getJats(String accession){
        StringWriter stringWriter = new StringWriter();
        ElementCitation elementCitation;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ElementCitation.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            for (PdbBean pdbBean : getSingleRecord(accession)){
                ElementCitationBuilder ecb = new ElementCitationBuilder(accession);

                if (pdbBean.authors != null && pdbBean.authors.isEmpty() == false){
                    for (String auth : pdbBean.authors){
                        String[] author = auth.split(", ");
                        ecb.addSubmitter(author[1], author[0]);
                    }
                }

                ecb.dataTitle(pdbBean.datasetTitle);

                // add received date
                ecb.addDate("received", pdbBean.depositionDate);

                // add publication date
                ecb.addDate("pub", pdbBean.releaseDate);

                // add corrected date
                ecb.addDate("corrected", pdbBean.modificationDate);

                // add source
                ecb.addSource("PDB");;

                ecb.addPubId(pdbBean.id, "accession", "http://www.ebi.ac.uk/pdbe/entry/pdb/", "protein data bank");

                // no version in pdb. could be added later
//                Version version = new Version();
//                version.getContent().add(pdbBean.version);
                jaxbMarshaller.marshal(ecb.build(), stringWriter);
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return stringWriter.toString();
    }

    public Set<PdbBean> getSingleRecord(String accession){
        SolrClient pdbSolrClient = new HttpSolrClient(pdbSolrUrl);
        SolrQuery query = new SolrQuery();
        query.set("fl", "pdb_id,entity_id,citation_doi,title,pubmed_id,entry_authors,revision_date,deposition_date,release_date");
        query.addSort("deposition_date", SolrQuery.ORDER.asc);
        query.setRows(pageSize);
        query.setStart(start);
        Set<PdbBean> pdbBeanSet = new HashSet<PdbBean>();
        query.set("q", "pdb_id:" + accession);

        try {
            QueryResponse response = pdbSolrClient.query(query);
            SolrDocumentList rs = response.getResults();
            long numFound = rs.getNumFound();
            int currentProcessed = 0;
            DataRecordsEntity dre;
            while (currentProcessed < numFound) {
                List<PdbBean> pdbBeanList = response.getBeans(PdbBean.class);
                currentProcessed += pdbBeanList.size();

                // consume/persist one page of records
                for (PdbBean bean : pdbBeanList) {
                    if (!pdbBeanSet.contains(bean) && bean.id != null){
                        pdbBeanSet.add(bean);
                    }
                }
                query.setStart(currentProcessed);
                response = pdbSolrClient.query(query);
                rs = response.getResults();
                numFound = rs.getNumFound();
            }
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pdbBeanSet;
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
                key = record.get("pdb").toLowerCase();
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