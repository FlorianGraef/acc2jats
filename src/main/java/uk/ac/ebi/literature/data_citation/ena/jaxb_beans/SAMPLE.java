//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.09 at 05:04:58 PM BST 
//


package uk.ac.ebi.literature.data_citation.ena.jaxb_beans;

import java.util.List;


/**
 * 
 *         A Sample defines an isolate of sequenceable material upon which
 *         sequencing experiments can be based.  The Sample object may be a surrogate for taxonomy
 *         accession or an anonymized individual identifier.  Or, it may fully specify
 *         provenance and isolation method of the starting material.
 *       
 * 
 * <p>Java class for SampleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SampleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDENTIFIERS" type="{SRA.common}IdentifierType" minOccurs="0"/>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAMPLE_NAME">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="TAXON_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="SCIENTIFIC_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="COMMON_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ANONYMIZED_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INDIVIDUAL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAMPLE_LINKS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="SAMPLE_LINK" type="{SRA.common}LinkType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SAMPLE_ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="SAMPLE_ATTRIBUTE" type="{SRA.common}AttributeType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{SRA.common}NameGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface SAMPLE {


    /**
     * Gets the value of the identifiers property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierType }
     *     
     */
    IdentifierType getIDENTIFIERS();

    /**
     * Sets the value of the identifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierType }
     *     
     */
    void setIDENTIFIERS(IdentifierType value);

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTITLE();

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTITLE(String value);

    /**
     * Gets the value of the samplename property.
     * 
     * @return
     *     possible object is
     *     {@link SAMPLE.SAMPLENAME }
     *     
     */
    SAMPLE.SAMPLENAME getSAMPLENAME();

    /**
     * Sets the value of the samplename property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAMPLE.SAMPLENAME }
     *     
     */
    void setSAMPLENAME(SAMPLE.SAMPLENAME value);

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDESCRIPTION();

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDESCRIPTION(String value);

    /**
     * Gets the value of the samplelinks property.
     * 
     * @return
     *     possible object is
     *     {@link SAMPLE.SAMPLELINKS }
     *     
     */
    SAMPLE.SAMPLELINKS getSAMPLELINKS();

    /**
     * Sets the value of the samplelinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAMPLE.SAMPLELINKS }
     *     
     */
    void setSAMPLELINKS(SAMPLE.SAMPLELINKS value);

    /**
     * Gets the value of the sampleattributes property.
     * 
     * @return
     *     possible object is
     *     {@link SAMPLE.SAMPLEATTRIBUTES }
     *     
     */
    SAMPLE.SAMPLEATTRIBUTES getSAMPLEATTRIBUTES();

    /**
     * Sets the value of the sampleattributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAMPLE.SAMPLEATTRIBUTES }
     *     
     */
    void setSAMPLEATTRIBUTES(SAMPLE.SAMPLEATTRIBUTES value);

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getAlias();

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setAlias(String value);

    /**
     * Gets the value of the centerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCenterName();

    /**
     * Sets the value of the centerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCenterName(String value);

    /**
     * Gets the value of the brokerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getBrokerName();

    /**
     * Sets the value of the brokerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setBrokerName(String value);

    /**
     * Gets the value of the accession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getAccession();

    /**
     * Sets the value of the accession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setAccession(String value);


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="SAMPLE_ATTRIBUTE" type="{SRA.common}AttributeType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface SAMPLEATTRIBUTES {


        /**
         * Gets the value of the sampleattributes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sampleattributes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSAMPLEATTRIBUTES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        List<AttributeType> getSAMPLEATTRIBUTES();

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="SAMPLE_LINK" type="{SRA.common}LinkType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface SAMPLELINKS {


        /**
         * Gets the value of the samplelinks property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the samplelinks property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSAMPLELINKS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkType }
         * 
         * 
         */
        List<LinkType> getSAMPLELINKS();

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="TAXON_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="SCIENTIFIC_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="COMMON_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ANONYMIZED_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INDIVIDUAL_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface SAMPLENAME {


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
         * Gets the value of the anonymizedname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getANONYMIZEDNAME();

        /**
         * Sets the value of the anonymizedname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setANONYMIZEDNAME(String value);

        /**
         * Gets the value of the individualname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getINDIVIDUALNAME();

        /**
         * Sets the value of the individualname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setINDIVIDUALNAME(String value);

    }

}
