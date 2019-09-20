package Applikation;

import Applikation.PersonenVerwaltung;
import Applikation.SequenzFilter;
import Data.CsvString;
import Data.Person;
import Presentation.Ausgabe;

public class Testlauf {

    public static void main(String... args) {
        CsvString langerString = new CsvString();
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        SequenzFilter filter = new SequenzFilter();
        PersonenVerwaltung pv1 = new PersonenVerwaltung(filter, langerString);
        pv1.setPersonen(person1);
        pv1.setPersonen(person2);
        pv1.setPersonen(person3);

        pv1.verwalte();
        Ausgabe presentation = new Ausgabe(pv1);

        System.out.println(pv1.toString());
        System.out.println();

        presentation.show();














    }
}
