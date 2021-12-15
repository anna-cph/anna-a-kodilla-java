package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        World theWorld = new World();
        Continent theContinent1 = new Continent("Asia");
        theContinent1.addCountry(new Country("Japan", new BigDecimal("12345678901234567")));
        theContinent1.addCountry(new Country("South Korea", new BigDecimal("4526475891273")));
        Continent theContinent2 = new Continent("Europe");
        theContinent2.addCountry(new Country("Poland", new BigDecimal("38123456789")));
        theContinent2.addCountry(new Country("Denmark", new BigDecimal("5123567812")));
        theWorld.addContinent(theContinent2);
        Continent theContinent3 = new Continent("Africa");
        theContinent3.addCountry(new Country("Nigeria", new BigDecimal("68123456789")));
        theContinent3.addCountry(new Country("Egypt", new BigDecimal("78123567812")));
        theWorld.addContinent(theContinent3);

        //When
        BigDecimal numberOfPeople = theWorld.getPeopleQuantity();

        //Then
        Assertions.assertEquals(new BigDecimal("189494049202"), numberOfPeople);

    }
}
