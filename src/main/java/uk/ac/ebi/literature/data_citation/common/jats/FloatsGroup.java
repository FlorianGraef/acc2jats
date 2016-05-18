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
 *       &lt;group ref="{}floats-group-model" maxOccurs="unbounded" minOccurs="0"/>
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
    "alternativesAndBoxedTextsAndChemStructWraps"
})
@XmlRootElement(name = "floats-group")
public class FloatsGroup {

    @XmlElements({
        @XmlElement(name = "alternatives", type = Alternatives.class),
        @XmlElement(name = "boxed-text", type = BoxedText.class),
        @XmlElement(name = "chem-struct-wrap", type = ChemStructWrap.class),
        @XmlElement(name = "code", type = Code.class),
        @XmlElement(name = "fig", type = Fig.class),
        @XmlElement(name = "fig-group", type = FigGroup.class),
        @XmlElement(name = "graphic", type = Graphic.class),
        @XmlElement(name = "media", type = Media.class),
        @XmlElement(name = "preformat", type = Preformat.class),
        @XmlElement(name = "supplementary-material", type = SupplementaryMaterial.class),
        @XmlElement(name = "table-wrap", type = TableWrap.class),
        @XmlElement(name = "table-wrap-group", type = TableWrapGroup.class)
    })
    protected List<Object> alternativesAndBoxedTextsAndChemStructWraps;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;

    /**
     * Gets the value of the alternativesAndBoxedTextsAndChemStructWraps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativesAndBoxedTextsAndChemStructWraps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativesAndBoxedTextsAndChemStructWraps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Alternatives }
     * {@link BoxedText }
     * {@link ChemStructWrap }
     * {@link Code }
     * {@link Fig }
     * {@link FigGroup }
     * {@link Graphic }
     * {@link Media }
     * {@link Preformat }
     * {@link SupplementaryMaterial }
     * {@link TableWrap }
     * {@link TableWrapGroup }
     * 
     * 
     */
    public List<Object> getAlternativesAndBoxedTextsAndChemStructWraps() {
        if (alternativesAndBoxedTextsAndChemStructWraps == null) {
            alternativesAndBoxedTextsAndChemStructWraps = new ArrayList<Object>();
        }
        return this.alternativesAndBoxedTextsAndChemStructWraps;
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