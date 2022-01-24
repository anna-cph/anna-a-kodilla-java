package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    private Boolean canFlight;
    private Map<Flight, Boolean> listFlights = new HashMap<>();

    public void findFlight(Flight flight) {

        if (flight != null) {
            canFlight = true;
        }

        listFlights.put(flight, canFlight);
    }
}
