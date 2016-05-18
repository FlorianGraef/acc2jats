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
        <xsl:for-each select="//element-citation|//mixed-citation">
            <xsl:apply-templates select="."/>
        </xsl:for-each>
    </xsl:template>
    
    <xsl:template match="element-citation|mixed-citation">
        <xsl:if test="@publication-type='data'">
            <xsl:apply-templates/>
            <xsl:if test="following::node()[self::element-citiation or self::mixed-citation][@publication-type='data']">
                <xsl:text>&#x0A;&#x0A;</xsl:text>
            </xsl:if>            
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
                <xsl:choose>
                    <xsl:when test="@date-type='received'"/>
                    <xsl:when test="@iso-8601-date">
                        <date><xsl:value-of select="@iso-8601-date"/></date>
                    </xsl:when>
                    <xsl:otherwise>
                        <date>
                            <xsl:value-of select="concat(year, '-')"/>
                            <xsl:value-of select="if(number(month) = number(month)) then format-number(month, '00')
                                else format-number(string-length(substring-before('JanFebMarAprMayJunJulAugSepOctNovDec', substring(month,1,3))) div 3 + 1,'00')"/>
                            <xsl:value-of select="concat('-', format-number(day,'00'))"/>
                        </date>
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:for-each>               
        </xsl:variable>
        <xsl:variable name="pubdates">
            <xsl:for-each select="$dates/date">
                <xsl:sort order="descending"/>
                <date><xsl:value-of select="."/></date>
            </xsl:for-each>
        </xsl:variable>
        <xsl:text>(</xsl:text>
        <xsl:value-of select="format-date($pubdates/date[1], '[D] [MNn, *-3] [Y]')"/>
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