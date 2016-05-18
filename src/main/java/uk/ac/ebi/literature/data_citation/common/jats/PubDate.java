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
 *       &lt;group ref="{}pub-date-model" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;attribute name="calendar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="date-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="iso-8601-date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pub-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="publication-format" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "daiesAndErasAndMonths"
})
@XmlRootElement(name = "pub-date")
public class PubDate {

    @XmlElements({
        @XmlElement(name = "day", type = Day.class),
        @XmlElement(name = "era", type = Era.class),
        @XmlElement(name = "month", type = Month.class),
        @XmlElement(name = "season", type = Season.class),
        @XmlElement(name = "year", type = Year.class),
        @XmlElement(name = "string-date", type = StringDate.class),
        @XmlElement(name = "x", type = X.class)
    })
    protected List<Object> daiesAndErasAndMonths;
    @XmlAttribute(name = "calendar")
    protected String calendar;
    @XmlAttribute(name = "date-type")
    protected String dateType;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "iso-8601-date")
    protected String iso8601Date;
    @XmlAttribute(name = "pub-type")
    protected String pubType;
    @XmlAttribute(name = "publication-format")
    protected String publicationFormat;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;

    /**
     * Gets the value of the daiesAndErasAndMonths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daiesAndErasAndMonths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaiesAndErasAndMonths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Day }
     * {@link Era }
     * {@link Month }
     * {@link Season }
     * {@link Year }
     * {@link StringDate }
     * {@link X }
     * 
     * 
     */
    public List<Object> getDaiesAndErasAndMonths() {
        if (daiesAndErasAndMonths == null) {
            daiesAndErasAndMonths = new ArrayList<Object>();
        }
        return this.daiesAndErasAndMonths;
    }

    /**
     * Gets the value of the calendar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendar() {
        return calendar;
    }

    /**
     * Sets the value of the calendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendar(String value) {
        this.calendar = value;
    }

    /**
     * Gets the value of the dateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateType() {
        return dateType;
    }

    /**
     * Sets the value of the dateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateType(String value) {
        this.dateType = value;
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
     * Gets the value of the iso8601Date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIso8601Date() {
        return iso8601Date;
    }

    /**
     * Sets the value of the iso8601Date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIso8601Date(String value) {
        this.iso8601Date = value;
    }

    /**
     * Gets the value of the pubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPubType() {
        return pubType;
    }

    /**
     * Sets the value of the pubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPubType(String value) {
        this.pubType = value;
    }

    /**
     * Gets the value of the publicationFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationFormat() {
        return publicationFormat;
    }

    /**
     * Sets the value of the publicationFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationFormat(String value) {
        this.publicationFormat = value;
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
