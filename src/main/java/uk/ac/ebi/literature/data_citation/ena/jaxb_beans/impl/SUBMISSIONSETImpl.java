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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.SUBMISSION;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.SUBMISSIONSET;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmissionSetType", propOrder = {
    "submissions"
})
@XmlRootElement(name = "SUBMISSION_SET")
public class SUBMISSIONSETImpl implements SUBMISSIONSET
{

    @XmlElement(name = "SUBMISSION", required = true, type = SUBMISSIONImpl.class)
    protected List<SUBMISSION> submissions;

    public List<SUBMISSION> getSUBMISSIONS() {
        if (submissions == null) {
            submissions = new ArrayList<SUBMISSION>();
        }
        return this.submissions;
    }

}
