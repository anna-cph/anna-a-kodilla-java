package com.kodilla.stream.world;

import java.util.*;

public class Continent {
    private final List<Country> theCountryList = new ArrayList<>();
    private final String name;

    public Continent(String name) {
        this.name = name;
    }

    public void addCountry(Country country) {
        theCountryList.add(country);
    }

    public List<Country> getList() {
        return new ArrayList<>(theCountryList);
    }

    /*
    public void addCountry(Country country) {
        Country theCountry= new Country("Poland", new BigDecimal("12345678901234567890"));
        theCountryList.add(theCountry);
    }


    public List<Country> getTheCountryList() {
        return theCountryList;
    }

   /*
    public Continent () {
        addCountry(Country poland);
    }
    */
}
