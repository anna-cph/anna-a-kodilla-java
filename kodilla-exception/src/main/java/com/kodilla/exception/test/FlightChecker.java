package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightChecker {
    public static void main(String[] args) {
        FindFlight flightFinder = new FindFlight();

        try {
            flightFinder.findFlight(new Flight("Tokyo", "Copenhagen"));
            System.out.println("You can fly there.");
        } catch (RouteNotFoundException e) {
            System.out.println("The route is not found. Change your search.");
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}
