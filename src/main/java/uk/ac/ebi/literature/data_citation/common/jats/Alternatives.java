//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.18 at 11:50:41 AM GMT 
//


package uk.ac.ebi.literature.data_citation.common.jats;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{}alternatives-model" maxOccurs="unbounded"/>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}base"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arraiesAndChemStructsAndCodes"
})
@XmlRootElement(name = "alternatives")
public class Alternatives {

    @XmlElements({
        @XmlElement(name = "array", type = Array.class),
        @XmlElement(name = "chem-struct", type = ChemStruct.class),
        @XmlElement(name = "code", type = Code.class),
        @XmlElement(name = "graphic", type = Graphic.class),
        @XmlElement(name = "inline-graphic", type = InlineGraphic.class),
        @XmlElement(name = "inline-supplementary-material", type = InlineSupplementaryMaterial.class),
        @XmlElement(name = "media", type = Media.class),
        @XmlElement(name = "preformat", type = Preformat.class),
        @XmlElement(name = "private-char", type = PrivateChar.class),
        @XmlElement(name = "supplementary-material", type = SupplementaryMaterial.class),
        @XmlElement(name = "table", type = Table.class),
        @XmlElement(name = "textual-form", type = TextualForm.class),
        @XmlElement(name = "tex-math", type = TexMath.class)
    })
    protected List<Object> arraiesAndChemStructsAndCodes;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;

    /**
     * Gets the value of the arraiesAndChemStructsAndCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arraiesAndChemStructsAndCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArraiesAndChemStructsAndCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Array }
     * {@link ChemStruct }
     * {@link Code }
     * {@link Graphic }
     * {@link InlineGraphic }
     * {@link InlineSupplementaryMaterial }
     * {@link Media }
     * {@link Preformat }
     * {@link PrivateChar }
     * {@link SupplementaryMaterial }
     * {@link Table }
     * {@link TextualForm }
     * {@link TexMath }
     * 
     * 
     */
    public List<Object> getArraiesAndChemStructsAndCodes() {
        if (arraiesAndChemStructsAndCodes == null) {
            arraiesAndChemStructsAndCodes = new ArrayList<Object>();
        }
        return this.arraiesAndChemStructsAndCodes;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

}
