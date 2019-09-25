package com.application;

import com.data.StreamVerwaltung;
import com.presentation.Ausgabe;

public class Main {

    public static void main(String[] args) {

        StreamVerwaltung sv = new StreamVerwaltung();
        sv.extrahiereString();

        Ausgabe show = new Ausgabe();
        show.createNameList(sv.getWortListe());
        show.createStreetList(sv.getWortListe());
        show.createTownList(sv.getWortListe());
        show.createAgeList(sv.getWortListe());
        show.placeHolderNames();
        show.placeHolderStreets();
        show.placeHolderTowns();
        show.placeHolderAges();

        System.out.println(show.showTable());
    }
}
