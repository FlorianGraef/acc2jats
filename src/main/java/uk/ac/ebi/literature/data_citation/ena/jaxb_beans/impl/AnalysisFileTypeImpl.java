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
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.AnalysisFileType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalysisFileType")
public class AnalysisFileTypeImpl
    implements AnalysisFileType
{

    @XmlAttribute(name = "filename", required = true)
    protected String filename;
    @XmlAttribute(name = "filetype", required = true)
    protected String filetype;
    @XmlAttribute(name = "checksum_method", required = true)
    protected String checksumMethod;
    @XmlAttribute(name = "checksum", required = true)
    protected String checksum;
    @XmlAttribute(name = "unencrypted_checksum")
    protected String unencryptedChecksum;
    @XmlAttribute(name = "checklist")
    protected String checklist;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String value) {
        this.filename = value;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String value) {
        this.filetype = value;
    }

    public String getChecksumMethod() {
        return checksumMethod;
    }

    public void setChecksumMethod(String value) {
        this.checksumMethod = value;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String value) {
        this.checksum = value;
    }

    public String getUnencryptedChecksum() {
        return unencryptedChecksum;
    }

    public void setUnencryptedChecksum(String value) {
        this.unencryptedChecksum = value;
    }

    public String getChecklist() {
        return checklist;
    }

    public void setChecklist(String value) {
        this.checklist = value;
    }

}
