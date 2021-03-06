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
 *  The LIBRARY_DESCRIPTOR specifies the origin of the material being
 *                 sequenced and any treatments that the material might have undergone that affect the
 *                 sequencing result. This specification is needed even if the platform does not
 *                 require a library construction step per se. 
 * 
 * <p>Java class for LibraryDescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LibraryDescriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LIBRARY_NAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIBRARY_STRATEGY" type="{}typeLibraryStrategy"/>
 *         &lt;element name="LIBRARY_SOURCE" type="{}typeLibrarySource"/>
 *         &lt;element name="LIBRARY_SELECTION" type="{}typeLibrarySelection"/>
 *         &lt;element name="LIBRARY_LAYOUT">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="SINGLE">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PAIRED">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="NOMINAL_LENGTH" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="NOMINAL_SDEV" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TARGETED_LOCI" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LOCUS" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PROBE_SET" type="{SRA.common}XRefType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="locus_name">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="16S rRNA"/>
 *                                 &lt;enumeration value="18S rRNA"/>
 *                                 &lt;enumeration value="RBCL"/>
 *                                 &lt;enumeration value="matK"/>
 *                                 &lt;enumeration value="COX1"/>
 *                                 &lt;enumeration value="ITS1-5.8S-ITS2"/>
 *                                 &lt;enumeration value="exome"/>
 *                                 &lt;enumeration value="other"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="POOLING_STRATEGY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LIBRARY_CONSTRUCTION_PROTOCOL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface LibraryDescriptorType {


    /**
     * Gets the value of the libraryname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLIBRARYNAME();

    /**
     * Sets the value of the libraryname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLIBRARYNAME(String value);

    /**
     * Gets the value of the librarystrategy property.
     * 
     * @return
     *     possible object is
     *     {@link TypeLibraryStrategy }
     *     
     */
    TypeLibraryStrategy getLIBRARYSTRATEGY();

    /**
     * Sets the value of the librarystrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLibraryStrategy }
     *     
     */
    void setLIBRARYSTRATEGY(TypeLibraryStrategy value);

    /**
     * Gets the value of the librarysource property.
     * 
     * @return
     *     possible object is
     *     {@link TypeLibrarySource }
     *     
     */
    TypeLibrarySource getLIBRARYSOURCE();

    /**
     * Sets the value of the librarysource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLibrarySource }
     *     
     */
    void setLIBRARYSOURCE(TypeLibrarySource value);

    /**
     * Gets the value of the libraryselection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLIBRARYSELECTION();

    /**
     * Sets the value of the libraryselection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLIBRARYSELECTION(String value);

    /**
     * Gets the value of the librarylayout property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryDescriptorType.LIBRARYLAYOUT }
     *     
     */
    LibraryDescriptorType.LIBRARYLAYOUT getLIBRARYLAYOUT();

    /**
     * Sets the value of the librarylayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryDescriptorType.LIBRARYLAYOUT }
     *     
     */
    void setLIBRARYLAYOUT(LibraryDescriptorType.LIBRARYLAYOUT value);

    /**
     * Gets the value of the targetedloci property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryDescriptorType.TARGETEDLOCI }
     *     
     */
    LibraryDescriptorType.TARGETEDLOCI getTARGETEDLOCI();

    /**
     * Sets the value of the targetedloci property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryDescriptorType.TARGETEDLOCI }
     *     
     */
    void setTARGETEDLOCI(LibraryDescriptorType.TARGETEDLOCI value);

    /**
     * Gets the value of the poolingstrategy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPOOLINGSTRATEGY();

    /**
     * Sets the value of the poolingstrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPOOLINGSTRATEGY(String value);

    /**
     * Gets the value of the libraryconstructionprotocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getLIBRARYCONSTRUCTIONPROTOCOL();

    /**
     * Sets the value of the libraryconstructionprotocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setLIBRARYCONSTRUCTIONPROTOCOL(String value);


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="SINGLE">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PAIRED">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="NOMINAL_LENGTH" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="NOMINAL_SDEV" type="{http://www.w3.org/2001/XMLSchema}double" />
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
    public interface LIBRARYLAYOUT {


        /**
         * Gets the value of the paired property.
         * 
         * @return
         *     possible object is
         *     {@link LibraryDescriptorType.LIBRARYLAYOUT.PAIRED }
         *     
         */
        LibraryDescriptorType.LIBRARYLAYOUT.PAIRED getPAIRED();

        /**
         * Sets the value of the paired property.
         * 
         * @param value
         *     allowed object is
         *     {@link LibraryDescriptorType.LIBRARYLAYOUT.PAIRED }
         *     
         */
        void setPAIRED(LibraryDescriptorType.LIBRARYLAYOUT.PAIRED value);

        /**
         * Gets the value of the single property.
         * 
         * @return
         *     possible object is
         *     {@link LibraryDescriptorType.LIBRARYLAYOUT.SINGLE }
         *     
         */
        LibraryDescriptorType.LIBRARYLAYOUT.SINGLE getSINGLE();

        /**
         * Sets the value of the single property.
         * 
         * @param value
         *     allowed object is
         *     {@link LibraryDescriptorType.LIBRARYLAYOUT.SINGLE }
         *     
         */
        void setSINGLE(LibraryDescriptorType.LIBRARYLAYOUT.SINGLE value);


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="NOMINAL_LENGTH" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="NOMINAL_SDEV" type="{http://www.w3.org/2001/XMLSchema}double" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface PAIRED {


            /**
             * Gets the value of the nominallength property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            BigInteger getNOMINALLENGTH();

            /**
             * Sets the value of the nominallength property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            void setNOMINALLENGTH(BigInteger value);

            /**
             * Gets the value of the nominalsdev property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            Double getNOMINALSDEV();

            /**
             * Sets the value of the nominalsdev property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            void setNOMINALSDEV(Double value);

        }


        /**
         * 
         *                             Reads are unpaired (usual case).
         *                           
         * 
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface SINGLE {


        }

    }


    /**
     * 
     *                           Names the gene(s) or locus(loci) or other genomic feature(s) targeted by the sequence.
     *                       
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LOCUS" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PROBE_SET" type="{SRA.common}XRefType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="locus_name">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="16S rRNA"/>
     *                       &lt;enumeration value="18S rRNA"/>
     *                       &lt;enumeration value="RBCL"/>
     *                       &lt;enumeration value="matK"/>
     *                       &lt;enumeration value="COX1"/>
     *                       &lt;enumeration value="ITS1-5.8S-ITS2"/>
     *                       &lt;enumeration value="exome"/>
     *                       &lt;enumeration value="other"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public interface TARGETEDLOCI {


        /**
         * Gets the value of the locuses property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the locuses property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLOCUSES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LibraryDescriptorType.TARGETEDLOCI.LOCUS }
         * 
         * 
         */
        List<LibraryDescriptorType.TARGETEDLOCI.LOCUS> getLOCUSES();


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
         *         &lt;element name="PROBE_SET" type="{SRA.common}XRefType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="locus_name">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="16S rRNA"/>
         *             &lt;enumeration value="18S rRNA"/>
         *             &lt;enumeration value="RBCL"/>
         *             &lt;enumeration value="matK"/>
         *             &lt;enumeration value="COX1"/>
         *             &lt;enumeration value="ITS1-5.8S-ITS2"/>
         *             &lt;enumeration value="exome"/>
         *             &lt;enumeration value="other"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        public interface LOCUS {


            /**
             * Gets the value of the probeset property.
             * 
             * @return
             *     possible object is
             *     {@link XRefType }
             *     
             */
            XRefType getPROBESET();

            /**
             * Sets the value of the probeset property.
             * 
             * @param value
             *     allowed object is
             *     {@link XRefType }
             *     
             */
            void setPROBESET(XRefType value);

            /**
             * Gets the value of the locusName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            String getLocusName();

            /**
             * Sets the value of the locusName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            void setLocusName(String value);

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            String getDescription();

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            void setDescription(String value);

        }

    }

}
