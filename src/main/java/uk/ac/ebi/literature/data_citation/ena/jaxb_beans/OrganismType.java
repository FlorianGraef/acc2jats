//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.09 at 05:04:58 PM BST 
//


package uk.ac.ebi.literature.data_citation.ena.jaxb_beans;



/**
 * <p>Java class for OrganismType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganismType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="TAXON_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SCIENTIFIC_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COMMON_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STRAIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BREED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CULTIVAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISOLATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface OrganismType {


    /**
     * Gets the value of the taxonid property.
     * 
     */
    int getTAXONID();

    /**
     * Sets the value of the taxonid property.
     * 
     */
    void setTAXONID(int value);

    /**
     * Gets the value of the scientificname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSCIENTIFICNAME();

    /**
     * Sets the value of the scientificname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSCIENTIFICNAME(String value);

    /**
     * Gets the value of the commonname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCOMMONNAME();

    /**
     * Sets the value of the commonname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCOMMONNAME(String value);

    /**
     * Gets the value of the strain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getSTRAIN();

    /**
     * Sets the value of the strain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setSTRAIN(String value);

    /**
     * Gets the value of the breed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBREED();

    /**
     * Sets the value of the breed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBREED(String value);

    /**
     * Gets the value of the cultivar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCULTIVAR();

    /**
     * Sets the value of the cultivar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCULTIVAR(String value);

    /**
     * Gets the value of the isolate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getISOLATE();

    /**
     * Sets the value of the isolate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setISOLATE(String value);

}
