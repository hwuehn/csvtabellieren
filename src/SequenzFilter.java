public class SequenzFilter {

    private int langerStringLaenge;
    private int anzahlChars;
    private CharSequence neuerString;
    private CharSequence neuerCsvString;

    public int getLangerStringLaenge() {
        return langerStringLaenge;
    }
    public int getAnzahlChars() {
        return anzahlChars;
    }
    public CharSequence getNeuerString() {
        return neuerString;
    }
    public String getNeuerCsvString() {
        return (String) neuerCsvString;
    }

    public SequenzFilter() {

    }

    public void sequenz(CsvString langerString) {
        langerStringLaenge = langerString.getCsvString().length();
        anzahlChars = langerString.getCsvString().indexOf(";");
        neuerString = langerString.getCsvString().subSequence(0, anzahlChars);
        neuerCsvString = langerString.getCsvString().subSequence(anzahlChars + 1, langerStringLaenge);
    }

    public CharSequence sequenz(String langerString) {
        langerStringLaenge = langerString.length();
        anzahlChars = langerString.indexOf(";");
        neuerString = langerString.subSequence(0, anzahlChars);
        neuerCsvString = langerString.subSequence(anzahlChars + 1, langerStringLaenge);
        return null;
    }
}
