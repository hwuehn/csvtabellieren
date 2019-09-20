public class PersonenVerwaltung {

    private Person person;
    private SequenzFilter filter;
    private CsvString langerString;

    public void verwalte() {
        filter.sequenz(langerString);
        CharSequence name = (filter.getNeuerString());
        person.setName(name);
        filter.sequenz(filter.getNeuerCsvString());
        CharSequence straße = (filter.getNeuerString());
        person.setStraße(straße);
        filter.sequenz(filter.getNeuerCsvString());
        CharSequence wohnort = (filter.getNeuerString());
        person.setWohnort(wohnort);
        filter.sequenz(filter.getNeuerCsvString());
        CharSequence alter = (filter.getNeuerString());
        person.setAlter(alter);
    }

    public PersonenVerwaltung(Person person, SequenzFilter filter, CsvString langerString ) {
        this.person = person;
        this.filter = filter;
        this.langerString = langerString;
    }
}
