<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:xlink="http://www.w3.org/1999/xlink"
    exclude-result-prefixes="xs xlink"
    version="2.0">
    
    <xsl:output encoding="UTF-8" method="text" omit-xml-declaration="yes"/>
    
    <xsl:strip-space elements="*"/>
    
    <xsl:template match="/">
        <xsl:apply-templates/>
    </xsl:template>
    
    <xsl:template match="article">
        <xsl:apply-templates select="//element-citation|//mixed-citation"/>
    </xsl:template>
    
    <xsl:template match="element-citation|mixed-citation">
        <xsl:if test="@publication-type='data'">
            <xsl:apply-templates/>
            <xsl:text>&#x0A;&#x0A;</xsl:text>
        </xsl:if>
    </xsl:template>
    
    <xsl:template match="name[not(position()=last())]">
        <xsl:apply-templates/>
        <xsl:text>, </xsl:text>
    </xsl:template>
    
    <xsl:template match="surname|name[position()=last()]|source">
        <xsl:apply-templates/>
        <xsl:text> </xsl:text>
    </xsl:template>
    
    <xsl:template match="date[position()=1]">
        <xsl:variable name="dates">
            <xsl:for-each select=".|following-sibling::date">
                <xsl:sort select="@iso-8601-date"/>
                <date><xsl:value-of select="@iso-8601-date"/></date>
            </xsl:for-each>
        </xsl:variable>
        <xsl:text>(</xsl:text>
        <xsl:value-of select="format-date($dates/date[last()], '[D] [MNn, *-3] [Y]')"/>
        <xsl:text>). </xsl:text>
    </xsl:template>
    
    <xsl:template match="date[position()!=1]|version"/>
    
    <xsl:template match="data-title">
        <xsl:apply-templates/>
        <xsl:if test="not(ends-with(., '.'))">
            <xsl:text>.</xsl:text>
        </xsl:if>
        <xsl:text> </xsl:text>
    </xsl:template>
    
    <xsl:template match="pub-id[@xlink:href]">
        <xsl:apply-templates/>
        <xsl:text> [</xsl:text>
        <xsl:value-of select="@xlink:href"/>
        <xsl:text>]. </xsl:text>
    </xsl:template>
    
    <xsl:template match="*">
        <xsl:apply-templates/>
    </xsl:template>
    
    <xsl:template match="text()">
        <xsl:value-of select="."/>
    </xsl:template>
    
</xsl:stylesheet>