package uk.ac.ebi.literature.data_citation;

//import junit.framework.TestCase;

import uk.ac.ebi.literature.data_citation.DataCitationApp;
import org.apache.wicket.util.tester.FormTester;
import org.apache.wicket.util.tester.WicketTester;
import uk.ac.ebi.literature.data_citation.MainPage;


/**
 * Created by graf on 08/03/16.
 */
public class DataCitaitonAppTest {
    private WicketTester tester;

    public void setUp(){
        tester = new WicketTester(new DataCitationApp());
    }


    public void buttonTest(){
       tester.startPage(MainPage.class);

        FormTester formTester = tester.newFormTester("form", false);
        //formTester.setValue("repo", "PDB");
        formTester.select("repo", 0);
        formTester.setValue("accession", "AACH01000026");
        formTester.submit("submit");


    }

}