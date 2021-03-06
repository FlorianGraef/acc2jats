//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.18 at 11:50:41 AM GMT 
//


package uk.ac.ebi.literature.data_citation.common.jats;

import java.util.ArrayList;
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
 *       &lt;group ref="{}boxed-text-model"/>
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="orientation" default="portrait">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="landscape"/>
 *             &lt;enumeration value="portrait"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="position" default="float">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="anchor"/>
 *             &lt;enumeration value="background"/>
 *             &lt;enumeration value="float"/>
 *             &lt;enumeration value="margin"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}base"/>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "objectIds",
    "secMeta",
    "label",
    "caption",
    "addressesAndAlternativesAndArraies",
    "secs",
    "notesAndFnGroupsAndGlossaries",
    "attribsAndPermissions"
})
@XmlRootElement(name = "boxed-text")
public class BoxedText {

    @XmlElement(name = "object-id")
    protected java.util.List<ObjectId> objectIds;
    @XmlElement(name = "sec-meta")
    protected SecMeta secMeta;
    protected Label label;
    protected Caption caption;
    @XmlElements({
        @XmlElement(name = "address", type = Address.class),
        @XmlElement(name = "alternatives", type = Alternatives.class),
        @XmlElement(name = "array", type = Array.class),
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
        @XmlElement(name = "table-wrap-group", type = TableWrapGroup.class),
        @XmlElement(name = "disp-formula", type = DispFormula.class),
        @XmlElement(name = "disp-formula-group", type = DispFormulaGroup.class),
        @XmlElement(name = "def-list", type = DefList.class),
        @XmlElement(name = "list", type = List.class),
        @XmlElement(name = "tex-math", type = TexMath.class),
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "related-article", type = RelatedArticle.class),
        @XmlElement(name = "related-object", type = RelatedObject.class),
        @XmlElement(name = "ack", type = Ack.class),
        @XmlElement(name = "disp-quote", type = DispQuote.class),
        @XmlElement(name = "speech", type = Speech.class),
        @XmlElement(name = "statement", type = Statement.class),
        @XmlElement(name = "verse-group", type = VerseGroup.class),
        @XmlElement(name = "x", type = X.class)
    })
    protected java.util.List<Object> addressesAndAlternativesAndArraies;
    @XmlElement(name = "sec")
    protected java.util.List<Sec> secs;
    @XmlElements({
        @XmlElement(name = "notes", type = Notes.class),
        @XmlElement(name = "fn-group", type = FnGroup.class),
        @XmlElement(name = "glossary", type = Glossary.class),
        @XmlElement(name = "ref-list", type = RefList.class)
    })
    protected java.util.List<Object> notesAndFnGroupsAndGlossaries;
    @XmlElements({
        @XmlElement(name = "attrib", type = Attrib.class),
        @XmlElement(name = "permissions", type = Permissions.class)
    })
    protected java.util.List<Object> attribsAndPermissions;
    @XmlAttribute(name = "content-type")
    protected String contentType;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "orientation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orientation;
    @XmlAttribute(name = "position")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String position;
    @XmlAttribute(name = "specific-use")
    protected String specificUse;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;

    /**
     * Gets the value of the objectIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectId }
     * 
     * 
     */
    public java.util.List<ObjectId> getObjectIds() {
        if (objectIds == null) {
            objectIds = new ArrayList<ObjectId>();
        }
        return this.objectIds;
    }

    /**
     * Gets the value of the secMeta property.
     * 
     * @return
     *     possible object is
     *     {@link SecMeta }
     *     
     */
    public SecMeta getSecMeta() {
        return secMeta;
    }

    /**
     * Sets the value of the secMeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecMeta }
     *     
     */
    public void setSecMeta(SecMeta value) {
        this.secMeta = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link Caption }
     *     
     */
    public Caption getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caption }
     *     
     */
    public void setCaption(Caption value) {
        this.caption = value;
    }

    /**
     * Gets the value of the addressesAndAlternativesAndArraies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressesAndAlternativesAndArraies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressesAndAlternativesAndArraies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * {@link Alternatives }
     * {@link Array }
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
     * {@link DispFormula }
     * {@link DispFormulaGroup }
     * {@link DefList }
     * {@link List }
     * {@link TexMath }
     * {@link P }
     * {@link RelatedArticle }
     * {@link RelatedObject }
     * {@link Ack }
     * {@link DispQuote }
     * {@link Speech }
     * {@link Statement }
     * {@link VerseGroup }
     * {@link X }
     * 
     * 
     */
    public java.util.List<Object> getAddressesAndAlternativesAndArraies() {
        if (addressesAndAlternativesAndArraies == null) {
            addressesAndAlternativesAndArraies = new ArrayList<Object>();
        }
        return this.addressesAndAlternativesAndArraies;
    }

    /**
     * Gets the value of the secs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sec }
     * 
     * 
     */
    public java.util.List<Sec> getSecs() {
        if (secs == null) {
            secs = new ArrayList<Sec>();
        }
        return this.secs;
    }

    /**
     * Gets the value of the notesAndFnGroupsAndGlossaries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notesAndFnGroupsAndGlossaries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotesAndFnGroupsAndGlossaries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notes }
     * {@link FnGroup }
     * {@link Glossary }
     * {@link RefList }
     * 
     * 
     */
    public java.util.List<Object> getNotesAndFnGroupsAndGlossaries() {
        if (notesAndFnGroupsAndGlossaries == null) {
            notesAndFnGroupsAndGlossaries = new ArrayList<Object>();
        }
        return this.notesAndFnGroupsAndGlossaries;
    }

    /**
     * Gets the value of the attribsAndPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribsAndPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribsAndPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attrib }
     * {@link Permissions }
     * 
     * 
     */
    public java.util.List<Object> getAttribsAndPermissions() {
        if (attribsAndPermissions == null) {
            attribsAndPermissions = new ArrayList<Object>();
        }
        return this.attribsAndPermissions;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
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
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientation() {
        if (orientation == null) {
            return "portrait";
        } else {
            return orientation;
        }
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientation(String value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        if (position == null) {
            return "float";
        } else {
            return position;
        }
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the specificUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificUse() {
        return specificUse;
    }

    /**
     * Sets the value of the specificUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificUse(String value) {
        this.specificUse = value;
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

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
