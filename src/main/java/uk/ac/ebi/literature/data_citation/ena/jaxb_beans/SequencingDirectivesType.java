//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.09 at 05:04:58 PM BST 
//


package uk.ac.ebi.literature.data_citation.ena.jaxb_beans;



/**
 * <p>Java class for SequencingDirectivesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequencingDirectivesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SAMPLE_DEMUX_DIRECTIVE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="leave_as_pool"/>
 *               &lt;enumeration value="submitter_demultiplexed"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface SequencingDirectivesType {


    /**
     * Gets the value of the sampledemuxdirective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSAMPLEDEMUXDIRECTIVE();

    /**
     * Sets the value of the sampledemuxdirective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSAMPLEDEMUXDIRECTIVE(String value);

}
