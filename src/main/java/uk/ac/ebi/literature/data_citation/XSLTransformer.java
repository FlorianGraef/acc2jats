package uk.ac.ebi.literature.data_citation;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;

/**
 * Created by graf on 15/03/16.
 */
public class XSLTransformer {
    TransformerFactory factory;
    Source xslt;
    Transformer transformer;

    public XSLTransformer() throws TransformerConfigurationException {
        factory = new net.sf.saxon.TransformerFactoryImpl();
        xslt = new StreamSource(getClass().getClassLoader().getResourceAsStream("jatsdatacitation.xsl"));
        transformer = factory.newTransformer(xslt);
    }

    public String transform(String xml) throws TransformerException {
        Source source = new StreamSource(new ByteArrayInputStream(xml.getBytes()));
        StringWriter stringWriter = new StringWriter();
        transformer.transform(source, new StreamResult(stringWriter));

        return stringWriter.toString();
    }
}
