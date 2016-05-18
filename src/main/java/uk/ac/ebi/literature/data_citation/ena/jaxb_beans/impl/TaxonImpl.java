//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.09 at 05:04:58 PM BST 
//


package uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.ChildTaxonType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.ParentTaxonType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.Taxon;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxonType", propOrder = {
    "lineage",
    "children",
    "synonyms"
})
@XmlRootElement(name = "taxon")
public class TaxonImpl implements Taxon
{

    @XmlElement(type = TaxonImpl.LineageImpl.class)
    protected TaxonImpl.LineageImpl lineage;
    @XmlElement(type = TaxonImpl.ChildrenImpl.class)
    protected TaxonImpl.ChildrenImpl children;
    @XmlElement(name = "synonym", type = TaxonImpl.SynonymImpl.class)
    protected List<Taxon.Synonym> synonyms;
    @XmlAttribute(name = "scientificName", required = true)
    protected String scientificName;
    @XmlAttribute(name = "commonName")
    protected String commonName;
    @XmlAttribute(name = "taxId", required = true)
    protected BigInteger taxId;
    @XmlAttribute(name = "parentTaxId")
    protected BigInteger parentTaxId;
    @XmlAttribute(name = "rank")
    protected String rank;
    @XmlAttribute(name = "hidden")
    protected Boolean hidden;
    @XmlAttribute(name = "taxonomicDivision", required = true)
    protected String taxonomicDivision;
    @XmlAttribute(name = "geneticCode")
    protected BigInteger geneticCode;
    @XmlAttribute(name = "mitochondrialGeneticCode")
    protected BigInteger mitochondrialGeneticCode;

    public Taxon.Lineage getLineage() {
        return lineage;
    }

    public void setLineage(Taxon.Lineage value) {
        this.lineage = ((TaxonImpl.LineageImpl) value);
    }

    public Taxon.Children getChildren() {
        return children;
    }

    public void setChildren(Taxon.Children value) {
        this.children = ((TaxonImpl.ChildrenImpl) value);
    }

    public List<Taxon.Synonym> getSynonyms() {
        if (synonyms == null) {
            synonyms = new ArrayList<Taxon.Synonym>();
        }
        return this.synonyms;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String value) {
        this.scientificName = value;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String value) {
        this.commonName = value;
    }

    public BigInteger getTaxId() {
        return taxId;
    }

    public void setTaxId(BigInteger value) {
        this.taxId = value;
    }

    public BigInteger getParentTaxId() {
        return parentTaxId;
    }

    public void setParentTaxId(BigInteger value) {
        this.parentTaxId = value;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String value) {
        this.rank = value;
    }

    public boolean isHidden() {
        if (hidden == null) {
            return false;
        } else {
            return hidden;
        }
    }

    public void setHidden(Boolean value) {
        this.hidden = value;
    }

    public String getTaxonomicDivision() {
        return taxonomicDivision;
    }

    public void setTaxonomicDivision(String value) {
        this.taxonomicDivision = value;
    }

    public BigInteger getGeneticCode() {
        return geneticCode;
    }

    public void setGeneticCode(BigInteger value) {
        this.geneticCode = value;
    }

    public BigInteger getMitochondrialGeneticCode() {
        return mitochondrialGeneticCode;
    }

    public void setMitochondrialGeneticCode(BigInteger value) {
        this.mitochondrialGeneticCode = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxons"
    })
    public static class ChildrenImpl
        implements Taxon.Children
    {

        @XmlElement(name = "taxon", required = true, type = ChildTaxonTypeImpl.class)
        protected List<ChildTaxonType> taxons;

        public List<ChildTaxonType> getTaxons() {
            if (taxons == null) {
                taxons = new ArrayList<ChildTaxonType>();
            }
            return this.taxons;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxons"
    })
    public static class LineageImpl
        implements Taxon.Lineage
    {

        @XmlElement(name = "taxon", required = true, type = ParentTaxonTypeImpl.class)
        protected List<ParentTaxonType> taxons;

        public List<ParentTaxonType> getTaxons() {
            if (taxons == null) {
                taxons = new ArrayList<ParentTaxonType>();
            }
            return this.taxons;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SynonymImpl
        implements Taxon.Synonym
    {

        @XmlAttribute(name = "type", required = true)
        protected String type;
        @XmlAttribute(name = "name", required = true)
        protected String name;

        public String getType() {
            return type;
        }

        public void setType(String value) {
            this.type = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String value) {
            this.name = value;
        }

    }

}
