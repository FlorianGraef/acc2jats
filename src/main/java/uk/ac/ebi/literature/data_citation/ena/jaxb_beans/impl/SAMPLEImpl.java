//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.09 at 05:04:58 PM BST 
//


package uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.AttributeType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.IdentifierType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.LinkType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.SAMPLE;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleType", propOrder = {
    "identifiers",
    "title",
    "samplename",
    "description",
    "samplelinks",
    "sampleattributes"
})
@XmlRootElement(name = "SAMPLE")
public class SAMPLEImpl implements SAMPLE
{

    @XmlElement(name = "IDENTIFIERS", type = IdentifierTypeImpl.class)
    protected IdentifierTypeImpl identifiers;
    @XmlElement(name = "TITLE")
    protected String title;
    @XmlElement(name = "SAMPLE_NAME", required = true, type = SAMPLEImpl.SAMPLENAMEImpl.class)
    protected SAMPLEImpl.SAMPLENAMEImpl samplename;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "SAMPLE_LINKS", type = SAMPLEImpl.SAMPLELINKSImpl.class)
    protected SAMPLEImpl.SAMPLELINKSImpl samplelinks;
    @XmlElement(name = "SAMPLE_ATTRIBUTES", type = SAMPLEImpl.SAMPLEATTRIBUTESImpl.class)
    protected SAMPLEImpl.SAMPLEATTRIBUTESImpl sampleattributes;
    @XmlAttribute(name = "alias")
    protected String alias;
    @XmlAttribute(name = "center_name")
    protected String centerName;
    @XmlAttribute(name = "broker_name")
    protected String brokerName;
    @XmlAttribute(name = "accession")
    protected String accession;

    public IdentifierType getIDENTIFIERS() {
        return identifiers;
    }

    public void setIDENTIFIERS(IdentifierType value) {
        this.identifiers = ((IdentifierTypeImpl) value);
    }

    public String getTITLE() {
        return title;
    }

    public void setTITLE(String value) {
        this.title = value;
    }

    public SAMPLE.SAMPLENAME getSAMPLENAME() {
        return samplename;
    }

    public void setSAMPLENAME(SAMPLE.SAMPLENAME value) {
        this.samplename = ((SAMPLEImpl.SAMPLENAMEImpl) value);
    }

    public String getDESCRIPTION() {
        return description;
    }

    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    public SAMPLE.SAMPLELINKS getSAMPLELINKS() {
        return samplelinks;
    }

    public void setSAMPLELINKS(SAMPLE.SAMPLELINKS value) {
        this.samplelinks = ((SAMPLEImpl.SAMPLELINKSImpl) value);
    }

    public SAMPLE.SAMPLEATTRIBUTES getSAMPLEATTRIBUTES() {
        return sampleattributes;
    }

    public void setSAMPLEATTRIBUTES(SAMPLE.SAMPLEATTRIBUTES value) {
        this.sampleattributes = ((SAMPLEImpl.SAMPLEATTRIBUTESImpl) value);
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String value) {
        this.alias = value;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String value) {
        this.centerName = value;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String value) {
        this.brokerName = value;
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String value) {
        this.accession = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sampleattributes"
    })
    public static class SAMPLEATTRIBUTESImpl
        implements SAMPLE.SAMPLEATTRIBUTES
    {

        @XmlElement(name = "SAMPLE_ATTRIBUTE", required = true, type = AttributeTypeImpl.class)
        protected List<AttributeType> sampleattributes;

        public List<AttributeType> getSAMPLEATTRIBUTES() {
            if (sampleattributes == null) {
                sampleattributes = new ArrayList<AttributeType>();
            }
            return this.sampleattributes;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "samplelinks"
    })
    public static class SAMPLELINKSImpl
        implements SAMPLE.SAMPLELINKS
    {

        @XmlElement(name = "SAMPLE_LINK", required = true, type = LinkTypeImpl.class)
        protected List<LinkType> samplelinks;

        public List<LinkType> getSAMPLELINKS() {
            if (samplelinks == null) {
                samplelinks = new ArrayList<LinkType>();
            }
            return this.samplelinks;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class SAMPLENAMEImpl
        implements SAMPLE.SAMPLENAME
    {

        @XmlElement(name = "TAXON_ID")
        protected int taxonid;
        @XmlElement(name = "SCIENTIFIC_NAME")
        protected String scientificname;
        @XmlElement(name = "COMMON_NAME")
        protected String commonname;
        @XmlElement(name = "ANONYMIZED_NAME")
        protected String anonymizedname;
        @XmlElement(name = "INDIVIDUAL_NAME")
        protected String individualname;

        public int getTAXONID() {
            return taxonid;
        }

        public void setTAXONID(int value) {
            this.taxonid = value;
        }

        public String getSCIENTIFICNAME() {
            return scientificname;
        }

        public void setSCIENTIFICNAME(String value) {
            this.scientificname = value;
        }

        public String getCOMMONNAME() {
            return commonname;
        }

        public void setCOMMONNAME(String value) {
            this.commonname = value;
        }

        public String getANONYMIZEDNAME() {
            return anonymizedname;
        }

        public void setANONYMIZEDNAME(String value) {
            this.anonymizedname = value;
        }

        public String getINDIVIDUALNAME() {
            return individualname;
        }

        public void setINDIVIDUALNAME(String value) {
            this.individualname = value;
        }

    }

}