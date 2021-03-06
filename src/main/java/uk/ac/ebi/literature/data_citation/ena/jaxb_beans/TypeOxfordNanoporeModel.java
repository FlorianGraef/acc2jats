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
 * <p>Java class for typeOxfordNanoporeModel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOxfordNanoporeModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MinION"/>
 *     &lt;enumeration value="GridION"/>
 *     &lt;enumeration value="unspecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeOxfordNanoporeModel", namespace = "SRA.common")
@XmlEnum
public enum TypeOxfordNanoporeModel {

    @XmlEnumValue("MinION")
    MIN_ION("MinION"),
    @XmlEnumValue("GridION")
    GRID_ION("GridION"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final String value;

    TypeOxfordNanoporeModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOxfordNanoporeModel fromValue(String v) {
        for (TypeOxfordNanoporeModel c: TypeOxfordNanoporeModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
