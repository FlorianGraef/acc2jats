package uk.ac.ebi.literature.data_citation.pdbe;

import junit.framework.TestCase;


/**
 * Created by graf on 18/02/16.
 */
public class PdbLoaderTest extends TestCase {
    public void testGetJats(){
        PdbLoader pdbLoader = new PdbLoader();
        String testOut = pdbLoader.getJats("2ing");
        System.out.println(testOut);
    }
}
