package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightChecker {
    public static void main(String[] args) {
        Flight newFlight = new Flight("Copenhagen", "Bangkok");
        FindFlight find = new FindFlight();
        find.findFlight(newFlight);
        Boolean xx = true;
        Map<Flight, Boolean> listOFFlights = new HashMap<>();
        listOFFlights.put(newFlight, xx);
    }
}
