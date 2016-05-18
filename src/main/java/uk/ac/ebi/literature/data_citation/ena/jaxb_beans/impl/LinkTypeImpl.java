//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.09 at 05:04:58 PM BST 
//


package uk.ac.ebi.literature.data_citation.ena.jaxb_beans.impl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.LinkType;
import uk.ac.ebi.literature.data_citation.ena.jaxb_beans.XRefType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkType", namespace = "SRA.common", propOrder = {
    "entrezlink",
    "xreflink",
    "urllink"
})
public class LinkTypeImpl
    implements LinkType
{

    @XmlElement(name = "ENTREZ_LINK", type = LinkTypeImpl.ENTREZLINKImpl.class)
    protected LinkTypeImpl.ENTREZLINKImpl entrezlink;
    @XmlElement(name = "XREF_LINK", type = XRefTypeImpl.class)
    protected XRefTypeImpl xreflink;
    @XmlElement(name = "URL_LINK", type = LinkTypeImpl.URLLINKImpl.class)
    protected LinkTypeImpl.URLLINKImpl urllink;

    public LinkType.ENTREZLINK getENTREZLINK() {
        return entrezlink;
    }

    public void setENTREZLINK(LinkType.ENTREZLINK value) {
        this.entrezlink = ((LinkTypeImpl.ENTREZLINKImpl) value);
    }

    public XRefType getXREFLINK() {
        return xreflink;
    }

    public void setXREFLINK(XRefType value) {
        this.xreflink = ((XRefTypeImpl) value);
    }

    public LinkType.URLLINK getURLLINK() {
        return urllink;
    }

    public void setURLLINK(LinkType.URLLINK value) {
        this.urllink = ((LinkTypeImpl.URLLINKImpl) value);
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "db",
        "query",
        "id",
        "label"
    })
    public static class ENTREZLINKImpl
        implements LinkType.ENTREZLINK
    {

        @XmlElement(name = "DB", required = true)
        protected String db;
        @XmlElement(name = "QUERY")
        protected String query;
        @XmlElement(name = "ID")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger id;
        @XmlElement(name = "LABEL")
        protected String label;

        public String getDB() {
            return db;
        }

        public void setDB(String value) {
            this.db = value;
        }

        public String getQUERY() {
            return query;
        }

        public void setQUERY(String value) {
            this.query = value;
        }

        public BigInteger getID() {
            return id;
        }

        public void setID(BigInteger value) {
            this.id = value;
        }

        public String getLABEL() {
            return label;
        }

        public void setLABEL(String value) {
            this.label = value;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class URLLINKImpl
        implements LinkType.URLLINK
    {

        @XmlElement(name = "LABEL", required = true)
        protected String label;
        @XmlElement(name = "URL", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String url;

        public String getLABEL() {
            return label;
        }

        public void setLABEL(String value) {
            this.label = value;
        }

        public String getURL() {
            return url;
        }

        public void setURL(String value) {
            this.url = value;
        }

    }

}
