package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public final class Country {
    private final BigDecimal peopleQuantity;
    private final String countryName;

    public Country(final String countryName, final BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    /*
     public void addCountry(Country country) {
      countries.add(country);
   }
   */


    @Override
    public String toString() {
        return "{Country: " + countryName +
                "has a number of inhabitants of " + peopleQuantity +
                '}';
    }
}
