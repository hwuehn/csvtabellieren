package com.application;

import com.data.StreamVerwaltung;
import com.presentation.Ausgabe;

import java.util.List;

import static com.data.StreamVerwaltung.extrahiereString;

public class Main {
    public final static String csv = "Peter Pan;Am Hang 5;12345 Einsam;42;" +
            "Maria Schmitz;Kölner Straße 45;50123 Köln;43;" +
            "Paul Meier;Münchener Weg 1;87654 München;65;";
    public static void main(String[] args) {

        List<String> woerter = extrahiereString(csv);

        Ausgabe show = new Ausgabe();
        show.createNameList(woerter);
        show.createStreetList(woerter);
        show.createTownList(woerter);
        show.createAgeList(woerter);
        show.placeHolderNames();
        show.placeHolderStreets();
        show.placeHolderTowns();
        show.placeHolderAges();

        System.out.println(show.showTable());
    }
}
