package Applikation;

import Data.CsvString;

public class SequenzFilter {

    private int langerStringLaenge;
    private int anzahlChars;
    private String neuerString;
    private String neuerCsvString;
    private String neuerCsvString2;


    public String getNeuerString() {
        return neuerString;
    }
    public String getNeuerCsvString() {
        return neuerCsvString;
    }

    public SequenzFilter() {

    }

    public void sequenz(CsvString langerString) {
        langerStringLaenge = langerString.getCsvString().length();
        anzahlChars = langerString.getCsvString().indexOf(";");
        neuerString = langerString.getCsvString().substring(0, anzahlChars);
        neuerCsvString = langerString.getCsvString().substring(anzahlChars + 1, langerStringLaenge);
    }

    public String sequenz(String langerString) {
        langerStringLaenge = langerString.length();
        anzahlChars = langerString.indexOf(";");
        neuerString = langerString.substring(0, anzahlChars);
        neuerCsvString = langerString.substring(anzahlChars + 1, langerStringLaenge);
        neuerCsvString2 = langerString;
        return null;
    }

    public String getNeuerCsvString2() {
        return neuerCsvString2;
    }
}
