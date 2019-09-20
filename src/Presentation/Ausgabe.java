package Presentation;

import Applikation.PersonenVerwaltung;
import Data.Person;
import Applikation.Testlauf;

import java.util.ArrayList;
import java.util.List;


public class Ausgabe {

    private PersonenVerwaltung pv;

    public List<Person> getPv() {
        return (List<Person>) pv;
    }




    public Ausgabe(PersonenVerwaltung pv) {
        this.pv = new PersonenVerwaltung();
        this.pv = pv;
    }

    public void show(){
        System.out.println("Name          | Straße          | Wohnort          | Alter \n");
        System.out.println(getPv().get(0).getName());

    }
}
