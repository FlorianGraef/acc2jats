//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.09 at 05:04:58 PM BST 
//


package uk.ac.ebi.literature.data_citation.ena.jaxb_beans;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeLibrarySource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeLibrarySource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GENOMIC"/>
 *     &lt;enumeration value="GENOMIC SINGLE CELL"/>
 *     &lt;enumeration value="TRANSCRIPTOMIC"/>
 *     &lt;enumeration value="TRANSCRIPTOMIC SINGLE CELL"/>
 *     &lt;enumeration value="METAGENOMIC"/>
 *     &lt;enumeration value="METATRANSCRIPTOMIC"/>
 *     &lt;enumeration value="SYNTHETIC"/>
 *     &lt;enumeration value="VIRAL RNA"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeLibrarySource")
@XmlEnum
public enum TypeLibrarySource {


    /**
     *  Genomic DNA (includes PCR products from genomic DNA). 
     * 
     */
    GENOMIC("GENOMIC"),

    /**
     *  genomic content of a single cell is amplified (generally using the processive DNA polymerase, like the one from
     *             the phi29 phage). This can then be used either for WGS or amplicon studies 
     * 
     */
    @XmlEnumValue("GENOMIC SINGLE CELL")
    GENOMIC_SINGLE_CELL("GENOMIC SINGLE CELL"),

    /**
     *  Transcription products or non genomic DNA (EST, cDNA, RT-PCR, screened libraries). 
     * 
     */
    TRANSCRIPTOMIC("TRANSCRIPTOMIC"),

    /**
     *  RNA-seq of coding RNA from single cells or RNA-seq of non coding RNA from single cells 
     * 
     */
    @XmlEnumValue("TRANSCRIPTOMIC SINGLE CELL")
    TRANSCRIPTOMIC_SINGLE_CELL("TRANSCRIPTOMIC SINGLE CELL"),

    /**
     *  Mixed material from metagenome. 
     * 
     */
    METAGENOMIC("METAGENOMIC"),

    /**
     *  Transcription products from community targets 
     * 
     */
    METATRANSCRIPTOMIC("METATRANSCRIPTOMIC"),

    /**
     *  Synthetic DNA. 
     * 
     */
    SYNTHETIC("SYNTHETIC"),

    /**
     *  Viral RNA. 
     * 
     */
    @XmlEnumValue("VIRAL RNA")
    VIRAL_RNA("VIRAL RNA"),

    /**
     *  Other, unspecified, or unknown library source material. 
     * 
     */
    OTHER("OTHER");
    private final String value;

    TypeLibrarySource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeLibrarySource fromValue(String v) {
        for (TypeLibrarySource c: TypeLibrarySource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}