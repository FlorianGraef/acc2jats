package uk.ac.ebi.literature.data_citation.common;

import uk.ac.ebi.literature.data_citation.ena.EnaLoader;
import uk.ac.ebi.literature.data_citation.pdbe.PdbLoader;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by graf on 02/03/16.
 */
public class RequestDispatcher {
    private final static Logger LOGGER = Logger.getAnonymousLogger();
    public String dispatchRequest(String repo, String accession){
        System.out.println("Request dispatcher started with parameters:");
        if (repo != null && accession != null){
            if (repo.equalsIgnoreCase("ENA")) {
                System.out.println("repo is ENA. trying to get XML");
                EnaLoader enaLoader = new EnaLoader(); // start ena loader
                try {
                    return enaLoader.getJats(accession);
                } catch (JAXBException e) {
                    LOGGER.warning(e.getMessage());
                    System.out.println(e.getMessage());

                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else if (repo.equalsIgnoreCase("PDB")) {
                PdbLoader pdbLoader = new PdbLoader(); // start pdb loader

                return pdbLoader.getJats(accession);

            }
        }

        return "Something went wrong. Investigate!";
    }
}
