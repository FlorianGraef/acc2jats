//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.09 at 05:04:58 PM BST 
//


package uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.AttributeType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType", namespace = "SRA.common", propOrder = {

})
public class AttributeTypeImpl
    implements AttributeType
{

    @XmlElement(name = "TAG", required = true)
    protected String tag;
    @XmlElement(name = "VALUE")
    protected String value;
    @XmlElement(name = "UNITS")
    protected String units;

    public String getTAG() {
        return tag;
    }

    public void setTAG(String value) {
        this.tag = value;
    }

    public String getVALUE() {
        return value;
    }

    public void setVALUE(String value) {
        this.value = value;
    }

    public String getUNITS() {
        return units;
    }

    public void setUNITS(String value) {
        this.units = value;
    }

}
