package com.presentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ausgabe {

    private List<String> names = new ArrayList<>();
    private List<String> streets = new ArrayList<>();
    private List<String> towns = new ArrayList<>();
    private List<String> ages = new ArrayList<>();
    private int maxName;
    private int maxStreet;
    private int maxTown;
    private int maxAge;

    public void createNameList(List<String> wortListe) {
        this.names = collectColData(wortListe, 0, 3, 4);
    }

    public void createStreetList(List<String> wortListe) {
        this.streets=collectColData(wortListe, 1, 3, 4);
    }
    public void createTownList(List<String> wortListe) {
        this.towns= collectColData(wortListe, 2, 3, 4);
    }
    public void createAgeList(List<String> wortListe) {
        this.ages = collectColData(wortListe, 3, 3, 4);
    }

    private static List<String> collectColData(List<String> wortListe, int start, int count, int offset) {
        return IntStream.range(0,count)
                .mapToObj(i -> i*offset + start)
                .map(i -> wortListe.get(i))
                .collect(Collectors.toList());
    }
    public void placeHolderNames() {

        this.maxName = calcMaxLenth(names, "Name");
    }
    public void placeHolderStreets() {
        this.maxStreet = calcMaxLenth(streets, "Street");
    }

    public void placeHolderTowns() {

        this.maxTown = calcMaxLenth(towns, "Town");
    }
    public void placeHolderAges() {
        this.maxAge = calcMaxLenth(ages, "Age");
    }

    public String placeHolderLength(int laenge1, int laenge2) {
        int anzahlLeerzeichen = laenge1 - laenge2;
        return getLeerzeichen(anzahlLeerzeichen);
    }
    private String getLeerzeichen(int anzahlLeerzeichen) {

        return IntStream.range(0,anzahlLeerzeichen)
                .mapToObj(i -> " " )
                .collect(Collectors.joining("")) + "|";
    }

    public String showTable() {
        return showHeader() +
                showRow(0) +
                showRow(1) +
                showRow(2);


    }

    private String showHeader() {
        List<String> headernames = Arrays.asList("Name", "Street", "Town", "Age");

        return
                showCell(0, headernames, this.maxName) +
                showCell(1, headernames, this.maxStreet) +
                showCell(2, headernames, this.maxTown) +
                showCell(3, headernames, this.maxAge) +
                        "\n" +
                "------------------------------------------------\n";
    }

    private String showRow(int rowNr) {
        return
                showCell(rowNr, this.names, this.maxName) +
                showCell(rowNr, this.streets, this.maxStreet) +
                showCell(rowNr, this.towns, this.maxTown) +
                showCell(rowNr, this.ages, this.maxAge) + "\n";
    }

    private String showCell(int rowNr, List<String> colData, int colLength) {
        return colData.get(rowNr) + placeHolderLength(colLength, colData.get(rowNr).length());
    }

    private static int calcMaxLenth(List<String> woerter2, String wort) {
        ArrayList<String> woerter = new ArrayList<>(woerter2);
        woerter.add(wort);
        return woerter.stream()
                .map(String::length)
                .max(Integer::compareTo)
                .orElse(0);
    }
}
