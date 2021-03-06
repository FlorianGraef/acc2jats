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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.ROOT;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RootType", propOrder = {
    "analysissetsAndANALYSISESAndEXPERIMENTSETS"
})
@XmlRootElement(name = "ROOT")
public class ROOTImpl
    implements ROOT
{

    @XmlElements({
        @XmlElement(name = "ANALYSIS_SET", type = ANALYSISSETImpl.class),
        @XmlElement(name = "ANALYSIS", type = ANALYSISImpl.class),
        @XmlElement(name = "EXPERIMENT_SET", type = EXPERIMENTSETImpl.class),
        @XmlElement(name = "EXPERIMENT", type = EXPERIMENTImpl.class),
        @XmlElement(name = "RUN_SET", type = RUNSETImpl.class),
        @XmlElement(name = "RUN", type = RUNImpl.class),
        @XmlElement(name = "STUDY_SET", type = STUDYSETImpl.class),
        @XmlElement(name = "STUDY", type = STUDYImpl.class),
        @XmlElement(name = "SAMPLE_SET", type = SAMPLESETImpl.class),
        @XmlElement(name = "SAMPLE", type = SAMPLEImpl.class),
        @XmlElement(name = "SUBMISSION_SET", type = SUBMISSIONSETImpl.class),
        @XmlElement(name = "SUBMISSION", type = SUBMISSIONImpl.class),
        @XmlElement(name = "entrySet", type = EntrySetTypeImpl.class),
        @XmlElement(name = "entry", type = EntryImpl.class),
        @XmlElement(name = "taxonSet", type = TaxonSetTypeImpl.class),
        @XmlElement(name = "taxon", type = TaxonImpl.class),
        @XmlElement(name = "PROJECT_SET", type = PROJECTSETImpl.class),
        @XmlElement(name = "PROJECT", type = PROJECTImpl.class)
    })
    protected List<Object> analysissetsAndANALYSISESAndEXPERIMENTSETS;
    @XmlAttribute(name = "request")
    protected String request;

    public List<Object> getANALYSISSETSAndANALYSISESAndEXPERIMENTSETS() {
        if (analysissetsAndANALYSISESAndEXPERIMENTSETS == null) {
            analysissetsAndANALYSISESAndEXPERIMENTSETS = new ArrayList<Object>();
        }
        return this.analysissetsAndANALYSISESAndEXPERIMENTSETS;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String value) {
        this.request = value;
    }

}
