package com.presentation;

import java.util.ArrayList;
import java.util.List;

public class Ausgabe {

    private List<String> names = new ArrayList<>();
    private List<String> streets = new ArrayList<>();
    private List<String> towns = new ArrayList<>();
    private List<String> ages = new ArrayList<>();
    private String maxName;
    private String maxStreet;
    private String maxTown;
    private String maxAgeLength;

    public List<String> getNames() {
        return names;
    }
    public List<String> getStreets() {
        return streets;
    }
    public List<String> getTowns() {
        return towns;
    }
    public List<String> getAges() {
        return ages;
    }
    public String getMaxName() {
        return maxName;
    }
    public String getMaxStreet() {
        return maxStreet;
    }
    public String getMaxTown() {
        return maxTown;
    }
    public String getMaxAgeLength() {
        return maxAgeLength;
    }

    public List<String> createNameList(List<String> wortListe) {
        names.add(wortListe.get(0));
        names.add(wortListe.get(4));
        names.add(wortListe.get(8));
        return names;
    }
    public List<String> createStreetList(List<String> wortListe) {
        streets.add(wortListe.get(1));
        streets.add(wortListe.get(5));
        streets.add(wortListe.get(9));
        return streets;
    }
    public List<String> createTownList(List<String> wortListe) {
        towns.add(wortListe.get(2));
        towns.add(wortListe.get(6));
        towns.add(wortListe.get(10));
        return towns;
    }
    public List<String> createAgeList(List<String> wortListe) {
        ages.add(wortListe.get(3));
        ages.add(wortListe.get(7));
        ages.add(wortListe.get(11));
        return ages;
    }

    public void placeHolderNames() {
        this.maxName = "Name".length() > getNames().get(0).length() ? "Name" : getNames().get(0);
        this.maxName = getNames().get(0).length() > getNames().get(1).length() ? getNames().get(0) : getNames().get(1);
        this.maxName = getNames().get(1).length() > getNames().get(2).length() ? getNames().get(1) : getNames().get(2);
    }
    public void placeHolderStreets() {
        this.maxStreet = "Street".length() > getStreets().get(0).length() ? "Street" : getStreets().get(0);
        this.maxStreet = getStreets().get(0).length() > getStreets().get(1).length() ? getStreets().get(0) : getStreets().get(1);
        this.maxStreet = getStreets().get(1).length() > getStreets().get(2).length() ? getStreets().get(1) : getStreets().get(2);
    }
    public void placeHolderTowns() {
        this.maxTown = "Town".length() > getStreets().get(0).length() ? "Town" : getStreets().get(0);
        this.maxTown = getTowns().get(0).length() > getTowns().get(1).length() ? getTowns().get(0) : getTowns().get(1);
        this.maxTown = getTowns().get(1).length() > getTowns().get(2).length() ? getTowns().get(1) : getTowns().get(2);
    }
    public void placeHolderAges() {
        this.maxAgeLength = "getAges".length() > getAges().get(0).length() ? "Age" : getAges().get(0);
        this.maxAgeLength = getAges().get(0).length() > getAges().get(1).length() ? getAges().get(0) : getAges().get(1);
        this.maxAgeLength = getAges().get(1).length() > getAges().get(2).length() ? getAges().get(1) : getAges().get(2);
    }

    public String placeHolderLength(int laenge1, int laenge2) {
        int anzahlLeerzeichen = laenge1 - laenge2;
        return getLeerzeichen(anzahlLeerzeichen);
    }
    private String getLeerzeichen(int anzahlLeerzeichen) {
        String set = "";
        for (int i = 0; i < anzahlLeerzeichen; i++) {
            set += " ";
        }
        return set + "|";
    }

    public String showTable() {
        return "Name"+placeHolderLength(getMaxName().length(),"Name".length())+
               "Street" +placeHolderLength(getMaxStreet().length(),"Street".length())+
               "Town" +placeHolderLength(getMaxTown().length(),"Town".length())+
               "Age"  + "\n" +
               "------------------------------------------------\n" +
               getNames().get(0) +placeHolderLength(getMaxName().length(),getNames().get(0).length())+
               getStreets().get(0) +placeHolderLength(getMaxStreet().length(),getStreets().get(0).length())+
               getTowns().get(0) +placeHolderLength(getMaxTown().length(),getTowns().get(0).length())+
               getAges().get(0) +placeHolderLength(getMaxAgeLength().length(),getAges().get(0).length())+"\n" +

               getNames().get(1) +placeHolderLength(getMaxName().length(),getNames().get(1).length())+
               getStreets().get(1) +placeHolderLength(getMaxStreet().length(),getStreets().get(1).length())+
               getTowns().get(1) +placeHolderLength(getMaxTown().length(),getTowns().get(1).length())+
               getAges().get(1) +placeHolderLength(getMaxAgeLength().length(),getAges().get(1).length())+"\n" +

               getNames().get(2) +placeHolderLength(getMaxName().length(),getNames().get(2).length())+
               getStreets().get(2) +placeHolderLength(getMaxStreet().length(),getStreets().get(2).length())+
               getTowns().get(2) +placeHolderLength(getMaxTown().length(),getTowns().get(2).length())+
               getAges().get(2) +placeHolderLength(getMaxAgeLength().length(),getAges().get(2).length());
    }




}
