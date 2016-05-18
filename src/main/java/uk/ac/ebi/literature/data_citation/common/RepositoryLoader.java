package uk.ac.ebi.literature.data_citation.common;

import uk.ac.ebi.literature.db.dao.DataCitationDAO;
import uk.ac.ebi.literature.db.dao.impl.DataCitationDAOImpl;
import uk.ac.ebi.literature.db.model.DataCitation.CitationsEntity;
import uk.ac.ebi.literature.db.model.DataCitation.DataRecordsEntity;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by graf on 08/10/15.
 */
public class RepositoryLoader {
    protected static void linkData(DataCitationDAO dataCitationDAO, Map<String, Set<String>> accMapping) {
        // get list of data records
        createDataCitations(dataCitationDAO, accMapping);
    }

    private static void createDataCitations(DataCitationDAO dataCitationDAO, Map<String, Set<String>> accMapping) {
        List<DataRecordsEntity> dataRecords;
        for (String accession : accMapping.keySet()) {
            dataRecords = dataCitationDAO.getDataByAccession(accession);
            for (DataRecordsEntity dr : dataRecords) {
                for (String linkedId : accMapping.get(accession)) {
                    System.out.println("PMCid: " + linkedId);
                    List<CitationsEntity> cel = dataCitationDAO.getCitationByExternalId(linkedId, "pmc");
                    for (CitationsEntity ce : cel) {
                        dataCitationDAO.linkDataAndCitation(dr, ce, DataCitationDAOImpl.CitationDirection.CITATION_CITES_DATA);
                    }
                }
            }
        }
    }
}
