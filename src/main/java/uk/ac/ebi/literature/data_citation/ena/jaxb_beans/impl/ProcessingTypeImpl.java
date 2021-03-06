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
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.PipelineType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.ProcessingType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.SequencingDirectivesType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingType", namespace = "SRA.common", propOrder = {
    "pipeline",
    "directives"
})
public class ProcessingTypeImpl
    implements ProcessingType
{

    @XmlElement(name = "PIPELINE", type = PipelineTypeImpl.class)
    protected PipelineTypeImpl pipeline;
    @XmlElement(name = "DIRECTIVES", type = SequencingDirectivesTypeImpl.class)
    protected SequencingDirectivesTypeImpl directives;

    public PipelineType getPIPELINE() {
        return pipeline;
    }

    public void setPIPELINE(PipelineType value) {
        this.pipeline = ((PipelineTypeImpl) value);
    }

    public SequencingDirectivesType getDIRECTIVES() {
        return directives;
    }

    public void setDIRECTIVES(SequencingDirectivesType value) {
        this.directives = ((SequencingDirectivesTypeImpl) value);
    }

}
