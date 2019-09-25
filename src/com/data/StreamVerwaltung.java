package com.data;

import java.util.ArrayList;
import java.util.List;

public class StreamVerwaltung {

    private String csv = "Peter Pan;Am Hang 5;12345 Einsam;42;" +
            "Maria Schmitz;Kölner Straße 45;50123 Köln;43;" +
            "Paul Meier;Münchener Weg 1;87654 München;65;";
    private int anzahlZeichenBisSimmicolon = 0;
    private List<String> wortListe = new ArrayList<>();
    private String wort;

    public void setAnzahlZeichenBisSimmicolon() {
        anzahlZeichenBisSimmicolon = csv.indexOf(";", 0);
    }
    public void setWort() {
        wort = csv.substring(0, anzahlZeichenBisSimmicolon);
    }
    public void setWortListe() {
        wortListe.add(wort);
    }
    public void setCsv() {
        csv = csv.substring(anzahlZeichenBisSimmicolon +1, csv.length());
    }

    public void extrahiereString() {
        while ( !csv.isEmpty()) {
            setAnzahlZeichenBisSimmicolon();
            setWort();
            setWortListe();
            setCsv();
        }
    }

    public List<String> getWortListe() {
        return wortListe;
    }
}
