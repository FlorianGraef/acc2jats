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
 *                   An Experiment specifies of what will be sequenced and how the sequencing will be performed.  
 *                   It does not contain results.  
 *                   An Experiment is composed of a design, a platform selection, and processing parameters.
 *                 
 * 
 * <p>Java class for ExperimentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExperimentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDENTIFIERS" type="{SRA.common}IdentifierType" minOccurs="0"/>
 *         &lt;element name="TITLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STUDY_REF">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IDENTIFIERS" type="{SRA.common}IdentifierType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{SRA.common}RefNameGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DESIGN" type="{}LibraryType"/>
 *         &lt;element name="PLATFORM" type="{SRA.common}PlatformType"/>
 *         &lt;element name="PROCESSING" type="{SRA.common}ProcessingType" minOccurs="0"/>
 *         &lt;element name="EXPERIMENT_LINKS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="EXPERIMENT_LINK" type="{SRA.common}LinkType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EXPERIMENT_ATTRIBUTES" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="EXPERIMENT_ATTRIBUTE" type="{SRA.common}AttributeType"/>
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
public interface EXPERIMENT {


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
     * Gets the value of the studyref property.
     * 
     * @return
     *     possible object is
     *     {@link EXPERIMENT.STUDYREF }
     *     
     */
    EXPERIMENT.STUDYREF getSTUDYREF();

    /**
     * Sets the value of the studyref property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXPERIMENT.STUDYREF }
     *     
     */
    void setSTUDYREF(EXPERIMENT.STUDYREF value);

    /**
     * Gets the value of the design property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryType }
     *     
     */
    LibraryType getDESIGN();

    /**
     * Sets the value of the design property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryType }
     *     
     */
    void setDESIGN(LibraryType value);

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link PlatformType }
     *     
     */
    PlatformType getPLATFORM();

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformType }
     *     
     */
    void setPLATFORM(PlatformType value);

    /**
     * Gets the value of the processing property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingType }
     *     
     */
    ProcessingType getPROCESSING();

    /**
     * Sets the value of the processing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingType }
     *     
     */
    void setPROCESSING(ProcessingType value);

    /**
     * Gets the value of the experimentlinks property.
     * 
     * @return
     *     possible object is
     *     {@link EXPERIMENT.EXPERIMENTLINKS }
     *     
     */
    EXPERIMENT.EXPERIMENTLINKS getEXPERIMENTLINKS();

    /**
     * Sets the value of the experimentlinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXPERIMENT.EXPERIMENTLINKS }
     *     
     */
    void setEXPERIMENTLINKS(EXPERIMENT.EXPERIMENTLINKS value);

    /**
     * Gets the value of the experimentattributes property.
     * 
     * @return
     *     possible object is
     *     {@link EXPERIMENT.EXPERIMENTATTRIBUTES }
     *     
     */
    EXPERIMENT.EXPERIMENTATTRIBUTES getEXPERIMENTATTRIBUTES();

    /**
     * Sets the value of the experimentattributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXPERIMENT.EXPERIMENTATTRIBUTES }
     *     
     */
    void setEXPERIMENTATTRIBUTES(EXPERIMENT.EXPERIMENTATTRIBUTES value);

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
     *         &lt;element name="EXPERIMENT_ATTRIBUTE" type="{SRA.common}AttributeType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface EXPERIMENTATTRIBUTES {


        /**
         * Gets the value of the experimentattributes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the experimentattributes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXPERIMENTATTRIBUTES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeType }
         * 
         * 
         */
        List<AttributeType> getEXPERIMENTATTRIBUTES();

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
     *         &lt;element name="EXPERIMENT_LINK" type="{SRA.common}LinkType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface EXPERIMENTLINKS {


        /**
         * Gets the value of the experimentlinks property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the experimentlinks property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEXPERIMENTLINKS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkType }
         * 
         * 
         */
        List<LinkType> getEXPERIMENTLINKS();

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
     *       &lt;sequence>
     *         &lt;element name="IDENTIFIERS" type="{SRA.common}IdentifierType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{SRA.common}RefNameGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface STUDYREF {


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
         * Gets the value of the refname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getRefname();

        /**
         * Sets the value of the refname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setRefname(String value);

        /**
         * Gets the value of the refcenter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getRefcenter();

        /**
         * Sets the value of the refcenter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setRefcenter(String value);

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

    }

}
