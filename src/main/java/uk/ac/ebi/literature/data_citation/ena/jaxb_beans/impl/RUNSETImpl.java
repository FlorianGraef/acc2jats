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
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.RUN;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.RUNSET;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunSetType", propOrder = {
    "runs"
})
@XmlRootElement(name = "RUN_SET")
public class RUNSETImpl implements RUNSET
{

    @XmlElement(name = "RUN", required = true, type = RUNImpl.class)
    protected List<RUN> runs;

    public List<RUN> getRUNS() {
        if (runs == null) {
            runs = new ArrayList<RUN>();
        }
        return this.runs;
    }

}
