//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.09 at 05:04:58 PM BST 
//


package uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.XrefType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XrefType")
public class XrefTypeImpl
    implements XrefType
{

    @XmlAttribute(name = "db", required = true)
    protected String db;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "secondaryId")
    protected String secondaryId;

    public String getDb() {
        return db;
    }

    public void setDb(String value) {
        this.db = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getSecondaryId() {
        return secondaryId;
    }

    public void setSecondaryId(String value) {
        this.secondaryId = value;
    }

}
