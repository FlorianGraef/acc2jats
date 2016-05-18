package uk.ac.ebi.literature.data_citation.common;

import org.apache.commons.lang.StringUtils;
import uk.ac.ebi.literature.data_citation.common.jats.*;
import uk.ac.ebi.literature.data_citation.common.jats.Date;

import java.util.*;
import java.util.List;

/**
 * Created by graf on 03/03/16.
 */
public class ElementCitationBuilder {
    ElementCitation elementCitation;
    List<Object> mixed;
    PersonGroup personGroup;
    DataTitle dataTitle;
    List <Date> dates;
    List<Source> sources;
    List<PubId> pubIds;
    Version version;


    public ElementCitationBuilder(String accession){
        elementCitation = new ElementCitation();
        elementCitation.setPublicationType("data");
        mixed = elementCitation.getInlineSupplementaryMaterialsAndRelatedArticlesAndRelatedObjects();

    }

    public ElementCitationBuilder addSubmitter(String givenNames, String surname){
        if (givenNames != null || surname != null){
            if (personGroup == null){
                personGroup = new PersonGroup();
                personGroup.setPersonGroupType("submitter");
            }
            Name subName = new Name();
            if (surname != null && !surname.isEmpty()){
                subName.setSurname( new Surname());
                subName.getSurname().getContent().add(surname);
            }

            if (givenNames != null && !givenNames.isEmpty()){
                subName.setGivenNames(new GivenNames());
                subName.getGivenNames().getContent().add(givenNames);
            }
            personGroup.getContent().add(subName);
        }

        return this;
    }

    public ElementCitationBuilder addSubmitter(String name){
        if (name != null){
            if (personGroup == null){
                personGroup = new PersonGroup();
                personGroup.setPersonGroupType("submitter");
            }
            Name name1 = new Name();
            name1.setSurname(new Surname());
            name1.getSurname().getContent().add(name);

            personGroup.getContent().add(name1);
        }

        return this;
    }

    public ElementCitationBuilder dataTitle(String dataTitle){
        if (dataTitle != null) {
            if (this.dataTitle == null){
                this.dataTitle = new DataTitle();
            }
            this.dataTitle.getContent().add(dataTitle);
        }
        return this;
    }

    public ElementCitationBuilder addDate(String dateType, java.util.Date date){
        if (dateType != null && date != null){
            if (dates == null){
                dates = new LinkedList<Date>();
            }
            dates.add(createDate(dateType, date));
        }
        return this;
    }

    private static Date createDate(String dateType, java.util.Date inDate){
        Calendar cal = Calendar.getInstance();
        cal.setTime(inDate);

        Date date = new Date();
        date.setIso8601Date(StringUtils.join(new String[]{String.valueOf(cal.get(Calendar.YEAR)), String.format("%02d", cal.get(Calendar.MONTH)), String.format("%02d", cal.get(Calendar.DAY_OF_MONTH))}, "-"));
        date.setDateType(dateType);

        Year year1 = new Year();
        year1.getContent().add(String.valueOf(cal.get(Calendar.YEAR)));
        date.setYear(year1);

        Month month = new Month();
        month.getContent().add(String.valueOf(cal.get(Calendar.MONTH)));
        date.setMonth(month);

        Day day = new Day();
        day.getContent().add(String.valueOf( cal.get(Calendar.DAY_OF_MONTH)));
        date.setDay(day);

        return date;
    }

    public ElementCitationBuilder addSource(String source){

        if (source != null) {
            if (sources == null) {
                sources = new LinkedList<Source>();
            }
            Source dataSource = new Source();
            dataSource.getContent().add(source);
            sources.add(dataSource);
        }
        return this;
    }

    public ElementCitationBuilder addPubId(String accession, String idType, String url, String assigningAuthority){
        if (accession != null && idType != null && url != null && assigningAuthority != null ) {
            if (pubIds == null){
                pubIds = new LinkedList<PubId>();
            }
            PubId pubId = new PubId();
            pubId.setPubIdType(idType);
            pubId.setHref(url + accession );
            pubId.setAssigningAuthority(assigningAuthority);
            pubId.getContent().add(accession);
            pubIds.add(pubId);
        }
        return this;
    }

    public ElementCitationBuilder Version(String version){
        if (version != null ){
            if (this.version == null){
                this.version = new Version();
            }

            this.version.getContent().add(version);
        }

        return this;
    }

    public ElementCitation build(){
        if (personGroup != null) {
            mixed.add(personGroup);
        }
        if (dataTitle != null){
            mixed.add(dataTitle);
        }
        if (dates != null && !dates.isEmpty()){
            for (Date date : dates){
                mixed.add(date);
            }
        }
        if (sources != null && !sources.isEmpty()){
            for (Source src : sources){
                mixed.add(src);
            }
        }
        if (pubIds != null && !pubIds.isEmpty()){
            mixed.addAll(pubIds);
        }
        if (version != null){
            mixed.add(version);
        }


        return elementCitation;
    }
}
