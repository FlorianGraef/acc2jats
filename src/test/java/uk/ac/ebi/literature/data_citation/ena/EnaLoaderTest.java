package uk.ac.ebi.literature.data_citation.ena;

import junit.framework.TestCase;

/**
 * Created by graf on 08/03/16.
 */
public class EnaLoaderTest extends TestCase {

    public void testGetJats() throws Exception {
        EnaLoader enaLoader = new EnaLoader();
        String testOut = enaLoader.getJats("AACH01000026");
        System.out.println(testOut);

    }
}