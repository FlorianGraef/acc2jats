//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.09 at 05:04:58 PM BST 
//


package uk.ac.ebi.literature.data_citation.ena.jaxb_beans;

import java.math.BigInteger;


/**
 * 
 *                 Reusable external links type to encode URL links, Entrez links, and db_xref links.
 *             
 * 
 * <p>Java class for LinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="URL_LINK">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="XREF_LINK" type="{SRA.common}XRefType"/>
 *         &lt;element name="ENTREZ_LINK">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DB" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;choice>
 *                     &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                     &lt;element name="QUERY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/choice>
 *                   &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface LinkType {


    /**
     * Gets the value of the entrezlink property.
     * 
     * @return
     *     possible object is
     *     {@link LinkType.ENTREZLINK }
     *     
     */
    LinkType.ENTREZLINK getENTREZLINK();

    /**
     * Sets the value of the entrezlink property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkType.ENTREZLINK }
     *     
     */
    void setENTREZLINK(LinkType.ENTREZLINK value);

    /**
     * Gets the value of the xreflink property.
     * 
     * @return
     *     possible object is
     *     {@link XRefType }
     *     
     */
    XRefType getXREFLINK();

    /**
     * Sets the value of the xreflink property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRefType }
     *     
     */
    void setXREFLINK(XRefType value);

    /**
     * Gets the value of the urllink property.
     * 
     * @return
     *     possible object is
     *     {@link LinkType.URLLINK }
     *     
     */
    LinkType.URLLINK getURLLINK();

    /**
     * Sets the value of the urllink property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkType.URLLINK }
     *     
     */
    void setURLLINK(LinkType.URLLINK value);


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
     *         &lt;element name="DB" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;choice>
     *           &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *           &lt;element name="QUERY" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;/choice>
     *         &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface ENTREZLINK {


        /**
         * Gets the value of the db property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getDB();

        /**
         * Sets the value of the db property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setDB(String value);

        /**
         * Gets the value of the query property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getQUERY();

        /**
         * Sets the value of the query property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setQUERY(String value);

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        BigInteger getID();

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        void setID(BigInteger value);

        /**
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getLABEL();

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setLABEL(String value);

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
     *         &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface URLLINK {


        /**
         * Gets the value of the label property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getLABEL();

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setLABEL(String value);

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getURL();

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setURL(String value);

    }

}
