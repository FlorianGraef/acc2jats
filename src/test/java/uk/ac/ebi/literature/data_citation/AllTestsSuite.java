package uk.ac.ebi.literature.data_citation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import uk.ac.ebi.literature.data_citation.ena.EnaLoaderTest;
import uk.ac.ebi.literature.data_citation.pdbe.PdbLoaderTest;

/**
 * Created by graf on 18/05/16.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        PdbLoaderTest.class,
        EnaLoaderTest.class,

})
public class AllTestsSuite {


}
