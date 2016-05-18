package uk.ac.ebi.literature.data_citation.model;

import java.io.Serializable;

/**
 * Created by graf on 02/12/15.
 */
public class DCModel implements Serializable {
    private String repository;

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    private String accession;
}
