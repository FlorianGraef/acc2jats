//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.09 at 05:04:58 PM BST 
//


package uk.ac.ebi.literature.data_citation.ena.jaxb_beans;

import java.math.BigInteger;
import java.util.List;


/**
 * <p>Java class for TaxonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lineage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="taxon" type="{}ParentTaxonType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="children" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="taxon" type="{}ChildTaxonType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="synonym" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="type" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="synonym"/>
 *                       &lt;enumeration value="common name"/>
 *                       &lt;enumeration value="acronym"/>
 *                       &lt;enumeration value="anamorph"/>
 *                       &lt;enumeration value="teleomorph"/>
 *                       &lt;enumeration value="equivalent name"/>
 *                       &lt;enumeration value="includes"/>
 *                       &lt;enumeration value="is-part"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="scientificName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="commonName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="taxId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="parentTaxId" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="rank" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="taxonomicDivision" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="geneticCode" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="mitochondrialGeneticCode" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface Taxon {


    /**
     * Gets the value of the lineage property.
     * 
     * @return
     *     possible object is
     *     {@link Taxon.Lineage }
     *     
     */
    Taxon.Lineage getLineage();

    /**
     * Sets the value of the lineage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxon.Lineage }
     *     
     */
    void setLineage(Taxon.Lineage value);

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link Taxon.Children }
     *     
     */
    Taxon.Children getChildren();

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link Taxon.Children }
     *     
     */
    void setChildren(Taxon.Children value);

    /**
     * Gets the value of the synonyms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synonyms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynonyms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Taxon.Synonym }
     * 
     * 
     */
    List<Taxon.Synonym> getSynonyms();

    /**
     * Gets the value of the scientificName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getScientificName();

    /**
     * Sets the value of the scientificName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setScientificName(String value);

    /**
     * Gets the value of the commonName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getCommonName();

    /**
     * Sets the value of the commonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setCommonName(String value);

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    BigInteger getTaxId();

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    void setTaxId(BigInteger value);

    /**
     * Gets the value of the parentTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    BigInteger getParentTaxId();

    /**
     * Sets the value of the parentTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    void setParentTaxId(BigInteger value);

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getRank();

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setRank(String value);

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    boolean isHidden();

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setHidden(Boolean value);

    /**
     * Gets the value of the taxonomicDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTaxonomicDivision();

    /**
     * Sets the value of the taxonomicDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTaxonomicDivision(String value);

    /**
     * Gets the value of the geneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    BigInteger getGeneticCode();

    /**
     * Sets the value of the geneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    void setGeneticCode(BigInteger value);

    /**
     * Gets the value of the mitochondrialGeneticCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    BigInteger getMitochondrialGeneticCode();

    /**
     * Sets the value of the mitochondrialGeneticCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    void setMitochondrialGeneticCode(BigInteger value);


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
     *         &lt;element name="taxon" type="{}ChildTaxonType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface Children {


        /**
         * Gets the value of the taxons property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxons property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxons().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChildTaxonType }
         * 
         * 
         */
        List<ChildTaxonType> getTaxons();

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
     *         &lt;element name="taxon" type="{}ParentTaxonType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface Lineage {


        /**
         * Gets the value of the taxons property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxons property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxons().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParentTaxonType }
         * 
         * 
         */
        List<ParentTaxonType> getTaxons();

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
     *       &lt;attribute name="type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="synonym"/>
     *             &lt;enumeration value="common name"/>
     *             &lt;enumeration value="acronym"/>
     *             &lt;enumeration value="anamorph"/>
     *             &lt;enumeration value="teleomorph"/>
     *             &lt;enumeration value="equivalent name"/>
     *             &lt;enumeration value="includes"/>
     *             &lt;enumeration value="is-part"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface Synonym {


        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getType();

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setType(String value);

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getName();

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setName(String value);

    }

}