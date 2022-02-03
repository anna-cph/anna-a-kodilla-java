package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    private Map<String, Boolean> listFlights = new HashMap<>();

    public FindFlight() {
        listFlights.put("Copenhagen", true);
        listFlights.put("Tokyo", false);
    }

    public boolean findFlight (Flight flight) throws RouteNotFoundException {
        if (listFlights.containsKey(flight.getArrivalAirport()) && listFlights.get(flight.getArrivalAirport())) {
            return true;
        } throw new RouteNotFoundException();
    }
}

// Map<String, Shop> shops = new HashMap<>();
//shop.put(computer, New ComputerShop());
//klucz (produkt) sie nie moze powtarzac, dlatego String, na allegro wiem co chce kupic a nie wiem skad dlatego shop