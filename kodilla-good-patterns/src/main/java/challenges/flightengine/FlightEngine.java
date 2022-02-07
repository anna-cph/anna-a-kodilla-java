package challenges.flightengine;

import java.util.ArrayList;
import java.util.List;

public class FlightEngine {
    public static void main(String[] args) {
        FlightService flightService = new FlightService();
        System.out.println("Flights from Warsaw: " + flightService.findDeparture("Warsaw"));
        System.out.println("Flights to Bangkok: " + flightService.findArrival("Bangkok"));
        System.out.println("Connecting flight: " +flightService.findConnectingFlights("Gdansk", "Bangkok"));
    }
}
