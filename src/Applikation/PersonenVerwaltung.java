package Applikation;

import Data.CsvString;
import Data.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonenVerwaltung {


    private List<Person> personen;
    private SequenzFilter filter;
    private CsvString langerString;

    public PersonenVerwaltung() {
        
    }

    public List<Person> getPersonen() {
        return personen;
    }

    public void verwalte() {
        setPersonenData1();
        setPersonenData2();
        setPersonenData3();
    }

    private void setPersonenData1() {
        filter.sequenz(langerString);
        String name = (filter.getNeuerString());
        personen.get(0).setName(name);
        filter.sequenz(filter.getNeuerCsvString());
        String straße = (filter.getNeuerString());
        personen.get(0).setStraße(straße);
        filter.sequenz(filter.getNeuerCsvString());
        String wohnort = (filter.getNeuerString());
        personen.get(0).setWohnort(wohnort);
        filter.sequenz(filter.getNeuerCsvString());
        String alter = (filter.getNeuerString());
        personen.get(0).setAlter(alter);
    }

    private void setPersonenData2() {
        filter.sequenz(filter.getNeuerCsvString());
        String name = (filter.getNeuerString());
        personen.get(1).setName(name);
        filter.sequenz(filter.getNeuerCsvString());
        String straße = (filter.getNeuerString());
        personen.get(1).setStraße(straße);
        filter.sequenz(filter.getNeuerCsvString());
        String wohnort = (filter.getNeuerString());
        personen.get(1).setWohnort(wohnort);
        filter.sequenz(filter.getNeuerCsvString());
        String alter = (filter.getNeuerString());
        personen.get(1).setAlter(alter);
    }

    private void setPersonenData3() {
        filter.sequenz(filter.getNeuerCsvString());
        String name = (filter.getNeuerString());
        personen.get(2).setName(name);
        filter.sequenz(filter.getNeuerCsvString());
        String straße = (filter.getNeuerString());
        personen.get(2).setStraße(straße);
        filter.sequenz(filter.getNeuerCsvString());
        String wohnort = (filter.getNeuerString());
        personen.get(2).setWohnort(wohnort);
        filter.sequenz(filter.getNeuerCsvString2());
        String alter = (filter.getNeuerString());
        personen.get(2).setAlter(alter);
    }

    public void setPersonen(Person person) {
        personen.add(person);
    }

    public PersonenVerwaltung(SequenzFilter filter, CsvString langerString) {
        this.personen = new ArrayList<>();
        this.filter = filter;
        this.langerString = langerString;
    }

    @Override
    public String toString() {
        return personen.get(0) + "\n" +
               personen.get(1) + "\n" +
               personen.get(2);
    }
}
