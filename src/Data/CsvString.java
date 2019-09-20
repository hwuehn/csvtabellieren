package Data;

public class CsvString {
    private String csvString = "Peter Pan;Am Hang 5;12345 Einsam;42;" +
                               "Maria Schmitz;Kölner Straße 45;50123 Köln;43;" +
                               "Paul Meier;Münchener Weg 1;87654 München;65";

    public CsvString() {
        this.csvString = csvString;
    }

    public String getCsvString() {
        return csvString;
    }
}
