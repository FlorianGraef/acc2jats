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
 *         &lt;group ref="{}textual-form-elements"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
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
    "content"
})
@XmlRootElement(name = "textual-form")
public class TextualForm {

    @XmlElementRefs({
        @XmlElementRef(name = "overline-start", type = OverlineStart.class, required = false),
        @XmlElementRef(name = "named-content", type = NamedContent.class, required = false),
        @XmlElementRef(name = "sub", type = Sub.class, required = false),
        @XmlElementRef(name = "sup", type = Sup.class, required = false),
        @XmlElementRef(name = "roman", type = Roman.class, required = false),
        @XmlElementRef(name = "sc", type = Sc.class, required = false),
        @XmlElementRef(name = "monospace", type = Monospace.class, required = false),
        @XmlElementRef(name = "overline", type = Overline.class, required = false),
        @XmlElementRef(name = "bold", type = Bold.class, required = false),
        @XmlElementRef(name = "fixed-case", type = FixedCase.class, required = false),
        @XmlElementRef(name = "strike", type = Strike.class, required = false),
        @XmlElementRef(name = "underline-end", type = UnderlineEnd.class, required = false),
        @XmlElementRef(name = "sans-serif", type = SansSerif.class, required = false),
        @XmlElementRef(name = "overline-end", type = OverlineEnd.class, required = false),
        @XmlElementRef(name = "styled-content", type = StyledContent.class, required = false),
        @XmlElementRef(name = "ruby", type = Ruby.class, required = false),
        @XmlElementRef(name = "label", type = Label.class, required = false),
        @XmlElementRef(name = "private-char", type = PrivateChar.class, required = false),
        @XmlElementRef(name = "underline-start", type = UnderlineStart.class, required = false),
        @XmlElementRef(name = "italic", type = Italic.class, required = false),
        @XmlElementRef(name = "underline", type = Underline.class, required = false),
        @XmlElementRef(name = "tex-math", type = TexMath.class, required = false),
        @XmlElementRef(name = "inline-graphic", type = InlineGraphic.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
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
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;

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
     * {@link Sub }
     * {@link Sup }
     * {@link String }
     * {@link Roman }
     * {@link Sc }
     * {@link Monospace }
     * {@link Overline }
     * {@link Bold }
     * {@link FixedCase }
     * {@link Strike }
     * {@link UnderlineEnd }
     * {@link SansSerif }
     * {@link OverlineEnd }
     * {@link StyledContent }
     * {@link Ruby }
     * {@link Label }
     * {@link PrivateChar }
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
