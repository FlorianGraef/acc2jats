package uk.ac.ebi.literature.data_citation.common;

import junit.framework.TestCase;
import uk.ac.ebi.literature.data_citation.data_citation.XSLTransformer;

/**
 * Created by graf on 08/03/16.
 */
public class RequestDispatcherTest extends TestCase {

    public void testDispatchRequest() throws Exception {
        String jatsXml = new RequestDispatcher().dispatchRequest("PDB", "5c0w");
        System.out.println( jatsXml);
        XSLTransformer trans = new XSLTransformer();

        String ref = trans.transform(jatsXml);
        System.out.println(ref);
    }
}