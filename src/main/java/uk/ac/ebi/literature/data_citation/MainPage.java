package uk.ac.ebi.literature.data_citation;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import uk.ac.ebi.literature.data_citation.common.RequestDispatcher;
import uk.ac.ebi.literature.data_citation.model.DCModel;

import javax.xml.transform.TransformerException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by graf on 30/11/15.
 */
public class MainPage extends WebPage {

    private List<String> repoChoices = new ArrayList<String>();
    public MainPage() {
        repoChoices.add("ENA");
        repoChoices.add("PDB");
        final DCModel dcModel = new DCModel();

        Form<?> form = new Form("form");

        final TextField<String> accTextField = new TextField<String>("accession",new PropertyModel<String>(dcModel, "accession"));
        final DropDownChoice<String> repository = new DropDownChoice<String>("repo",
                new PropertyModel<String>(dcModel, "repository"), repoChoices);
        final Model<String> strMdl = Model.of("The Query info will appear here.");
        final Model<String> refMdl = Model.of("Human readable reference list item.");
        final Label queryLabel = new Label("qryinf", strMdl);
        final Label refItemText = new Label("ref", refMdl);
        queryLabel.setOutputMarkupId(true);
        refItemText.setOutputMarkupId(true);

        Button button = new Button("submit"){
            @Override
            public void onSubmit(){
                super.onSubmit();

                strMdl.setObject("");
                refMdl.setObject("");

                // generate xml
                System.out.println(dcModel.getRepository() + ":" + dcModel.getAccession());
                RequestDispatcher rq = new RequestDispatcher();

                strMdl.setObject(rq.dispatchRequest(dcModel.getRepository(), dcModel.getAccession()));

                try {
                    XSLTransformer transformer = new XSLTransformer();
                    refMdl.setObject(transformer.transform(strMdl.getObject()));
                } catch (TransformerException e) {
                    e.printStackTrace();
                }

            }
        };

        add(form);
        form.add(repository);
        form.add(accTextField);
        form.add(button);
        add(queryLabel);
        add(refItemText);
    }
}