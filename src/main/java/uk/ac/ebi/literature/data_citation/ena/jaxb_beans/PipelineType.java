//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.09 at 05:04:58 PM BST 
//


package uk.ac.ebi.literature.data_citation.ena.jaxb_beans;

import java.util.List;


/**
 *  The PipelineType identifies the sequence or tree of actions to
 *                 process the sequencing data. 
 * 
 * <p>Java class for PipelineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PipelineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PIPE_SECTION" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="STEP_INDEX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PREV_STEP_INDEX" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="PROGRAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VERSION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NOTES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="section_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface PipelineType {


    /**
     * Gets the value of the pipesections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pipesections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIPESECTIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PipelineType.PIPESECTION }
     * 
     * 
     */
    List<PipelineType.PIPESECTION> getPIPESECTIONS();


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
     *         &lt;element name="STEP_INDEX" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PREV_STEP_INDEX" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *         &lt;element name="PROGRAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="VERSION" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NOTES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="section_name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    public interface PIPESECTION {


        /**
         * Gets the value of the stepindex property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getSTEPINDEX();

        /**
         * Sets the value of the stepindex property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setSTEPINDEX(String value);

        /**
         * Gets the value of the prevstepindices property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the prevstepindices property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPREVSTEPINDICES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        List<String> getPREVSTEPINDICES();

        /**
         * Gets the value of the program property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getPROGRAM();

        /**
         * Sets the value of the program property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setPROGRAM(String value);

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getVERSION();

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setVERSION(String value);

        /**
         * Gets the value of the notes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getNOTES();

        /**
         * Sets the value of the notes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setNOTES(String value);

        /**
         * Gets the value of the sectionName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        String getSectionName();

        /**
         * Sets the value of the sectionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        void setSectionName(String value);

    }

}