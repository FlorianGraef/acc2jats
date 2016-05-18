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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{}fax-elements"/>
 *       &lt;/choice>
 *       &lt;attribute name="content-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="specific-use" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "content"
})
@XmlRootElement(name = "fax")
public class Fax {

    @XmlElementRefs({
        @XmlElementRef(name = "overline-start", type = OverlineStart.class, required = false),
        @XmlElementRef(name = "named-content", type = NamedContent.class, required = false),
        @XmlElementRef(name = "email", type = Email.class, required = false),
        @XmlElementRef(name = "roman", type = Roman.class, required = false),
        @XmlElementRef(name = "sc", type = Sc.class, required = false),
        @XmlElementRef(name = "bold", type = Bold.class, required = false),
        @XmlElementRef(name = "alternatives", type = Alternatives.class, required = false),
        @XmlElementRef(name = "fn", type = Fn.class, required = false),
        @XmlElementRef(name = "milestone-end", type = MilestoneEnd.class, required = false),
        @XmlElementRef(name = "hr", type = Hr.class, required = false),
        @XmlElementRef(name = "underline-end", type = UnderlineEnd.class, required = false),
        @XmlElementRef(name = "x", type = X.class, required = false),
        @XmlElementRef(name = "related-object", type = RelatedObject.class, required = false),
        @XmlElementRef(name = "abbrev", type = Abbrev.class, required = false),
        @XmlElementRef(name = "overline-end", type = OverlineEnd.class, required = false),
        @XmlElementRef(name = "inline-supplementary-material", type = InlineSupplementaryMaterial.class, required = false),
        @XmlElementRef(name = "milestone-start", type = MilestoneStart.class, required = false),
        @XmlElementRef(name = "private-char", type = PrivateChar.class, required = false),
        @XmlElementRef(name = "ext-link", type = ExtLink.class, required = false),
        @XmlElementRef(name = "chem-struct", type = ChemStruct.class, required = false),
        @XmlElementRef(name = "target", type = Target.class, required = false),
        @XmlElementRef(name = "sub", type = Sub.class, required = false),
        @XmlElementRef(name = "sup", type = Sup.class, required = false),
        @XmlElementRef(name = "monospace", type = Monospace.class, required = false),
        @XmlElementRef(name = "overline", type = Overline.class, required = false),
        @XmlElementRef(name = "fixed-case", type = FixedCase.class, required = false),
        @XmlElementRef(name = "inline-formula", type = InlineFormula.class, required = false),
        @XmlElementRef(name = "strike", type = Strike.class, required = false),
        @XmlElementRef(name = "related-article", type = RelatedArticle.class, required = false),
        @XmlElementRef(name = "sans-serif", type = SansSerif.class, required = false),
        @XmlElementRef(name = "xref", type = Xref.class, required = false),
        @XmlElementRef(name = "uri", type = Uri.class, required = false),
        @XmlElementRef(name = "styled-content", type = StyledContent.class, required = false),
        @XmlElementRef(name = "ruby", type = Ruby.class, required = false),
        @XmlElementRef(name = "underline-start", type = UnderlineStart.class, required = false),
        @XmlElementRef(name = "italic", type = Italic.class, required = false),
        @XmlElementRef(name = "underline", type = Underline.class, required = false),
        @XmlElementRef(name = "tex-math", type = TexMath.class, required = false),
        @XmlElementRef(name = "inline-graphic", type = InlineGraphic.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "content-type")
    protected String contentType;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "specific-use")
    protected String specificUse;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OverlineStart }
     * {@link NamedContent }
     * {@link Email }
     * {@link Roman }
     * {@link Sc }
     * {@link Bold }
     * {@link Alternatives }
     * {@link Fn }
     * {@link MilestoneEnd }
     * {@link Hr }
     * {@link UnderlineEnd }
     * {@link X }
     * {@link RelatedObject }
     * {@link Abbrev }
     * {@link OverlineEnd }
     * {@link InlineSupplementaryMaterial }
     * {@link MilestoneStart }
     * {@link PrivateChar }
     * {@link ExtLink }
     * {@link ChemStruct }
     * {@link Target }
     * {@link Sub }
     * {@link Sup }
     * {@link String }
     * {@link Monospace }
     * {@link Overline }
     * {@link FixedCase }
     * {@link InlineFormula }
     * {@link Strike }
     * {@link RelatedArticle }
     * {@link SansSerif }
     * {@link Xref }
     * {@link Uri }
     * {@link StyledContent }
     * {@link Ruby }
     * {@link UnderlineStart }
     * {@link Italic }
     * {@link Underline }
     * {@link TexMath }
     * {@link InlineGraphic }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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

}
