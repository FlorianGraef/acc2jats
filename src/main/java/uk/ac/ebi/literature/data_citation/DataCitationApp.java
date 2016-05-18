package uk.ac.ebi.literature.data_citation;

import org.apache.wicket.protocol.http.WebApplication;

/**
 * Created by graf on 30/11/15.
 */
public class DataCitationApp extends WebApplication {

    public DataCitationApp() {
    }
    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    @Override
    public Class getHomePage() {
        return MainPage.class;
    }
}
