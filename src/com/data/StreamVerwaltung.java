package com.data;

import java.util.ArrayList;
import java.util.List;

public class StreamVerwaltung {



    public static  List<String> extrahiereString(String csv) {
        List<String> wortListe = new ArrayList<>();
        String csv1 = csv;

        while (true) {
            if (!!csv1.isEmpty()) break;
            int anzahlZeichen = anzahlBisTrenner(csv1);
            String wort = schneideWort(anzahlZeichen, csv1);
            wortListe.add(wort);
            csv1 = csv1.substring(anzahlZeichen +1);
        }
        return wortListe;
    }

    private static String schneideWort(int anzahlZeichen, String csv) {
        return csv.substring(0, anzahlZeichen);
    }

    private static int anzahlBisTrenner(String csv) {
        return csv.indexOf(";", 0);
    }

}
