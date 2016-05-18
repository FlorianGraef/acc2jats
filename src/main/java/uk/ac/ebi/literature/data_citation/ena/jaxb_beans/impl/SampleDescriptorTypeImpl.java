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
import javax.xml.bind.annotation.XmlType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.IdentifierType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.PoolMemberType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.SampleDescriptorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleDescriptorType", propOrder = {
    "pool",
    "identifiers"
})
public class SampleDescriptorTypeImpl
    implements SampleDescriptorType
{

    @XmlElement(name = "POOL", type = SampleDescriptorTypeImpl.POOLImpl.class)
    protected SampleDescriptorTypeImpl.POOLImpl pool;
    @XmlElement(name = "IDENTIFIERS", type = IdentifierTypeImpl.class)
    protected IdentifierTypeImpl identifiers;
    @XmlAttribute(name = "refname")
    protected String refname;
    @XmlAttribute(name = "refcenter")
    protected String refcenter;
    @XmlAttribute(name = "accession")
    protected String accession;

    public SampleDescriptorType.POOL getPOOL() {
        return pool;
    }

    public void setPOOL(SampleDescriptorType.POOL value) {
        this.pool = ((SampleDescriptorTypeImpl.POOLImpl) value);
    }

    public IdentifierType getIDENTIFIERS() {
        return identifiers;
    }

    public void setIDENTIFIERS(IdentifierType value) {
        this.identifiers = ((IdentifierTypeImpl) value);
    }

    public String getRefname() {
        return refname;
    }

    public void setRefname(String value) {
        this.refname = value;
    }

    public String getRefcenter() {
        return refcenter;
    }

    public void setRefcenter(String value) {
        this.refcenter = value;
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String value) {
        this.accession = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "defaultmember",
        "members"
    })
    public static class POOLImpl
        implements SampleDescriptorType.POOL
    {

        @XmlElement(name = "DEFAULT_MEMBER", type = PoolMemberTypeImpl.class)
        protected PoolMemberTypeImpl defaultmember;
        @XmlElement(name = "MEMBER", required = true, type = PoolMemberTypeImpl.class)
        protected List<PoolMemberType> members;

        public PoolMemberType getDEFAULTMEMBER() {
            return defaultmember;
        }

        public void setDEFAULTMEMBER(PoolMemberType value) {
            this.defaultmember = ((PoolMemberTypeImpl) value);
        }

        public List<PoolMemberType> getMEMBERS() {
            if (members == null) {
                members = new ArrayList<PoolMemberType>();
            }
            return this.members;
        }

    }

}
