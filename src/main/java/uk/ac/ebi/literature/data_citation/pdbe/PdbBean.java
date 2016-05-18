package uk.ac.ebi.literature.data_citation.pdbe;

import org.apache.solr.client.solrj.beans.Field;

import java.util.Date;
import java.util.List;

/**
 * Created by graf on 27/05/15.
 */
public class PdbBean {
    @Field("pdb_id")
    public String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PdbBean bean = (PdbBean) o;

        if (version != bean.version) return false;
        if (!id.equals(bean.id)) return false;
        //if (doi != null ? !doi.equals(bean.doi) : bean.doi != null) return false;
        //if (pmid != null ? !pmid.equals(bean.pmid) : bean.pmid != null) return false;
        //if (authors != null ? !authors.equals(bean.authors) : bean.authors != null) return false;
        //if (datasetTitle != null ? !datasetTitle.equals(bean.datasetTitle) : bean.datasetTitle != null) return false;
        //if (depositionDate != null ? !depositionDate.equals(bean.depositionDate) : bean.depositionDate != null)
        //    return false;
        //if (releaseDate != null ? !releaseDate.equals(bean.releaseDate) : bean.releaseDate != null) return false;
        return !(modificationDate != null ? !modificationDate.equals(bean.modificationDate) : bean.modificationDate != null);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
//        result = 31 * result + (doi != null ? doi.hashCode() : 0);
//        result = 31 * result + (pmid != null ? pmid.hashCode() : 0);
//        result = 31 * result + (authors != null ? authors.hashCode() : 0);
//        result = 31 * result + (datasetTitle != null ? datasetTitle.hashCode() : 0);
//        result = 31 * result + (depositionDate != null ? depositionDate.hashCode() : 0);
//        result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
        result = 31 * result + (modificationDate != null ? modificationDate.hashCode() : 0);
        result = 31 * result + version;
        return result;
    }

    @Field("citation_doi")
    public String doi;

    @Field("pubmed_id")
    public String pmid;

    @Field("entry_authors")
    public List<String> authors;

    @Field("title")
    public String datasetTitle;

    @Field("deposition_date")
    public Date depositionDate;

    @Field("release_date")
    public Date releaseDate;

    @Field("revision_date")
    public Date modificationDate;

//    @Field("entity_id")
    public int version;
}
