package challenges.flightengine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {
    List<Flight> flights = new ArrayList<>();

    public FlightService() {
        flights.add(new Flight("Warsaw", "Tokyo"));
        flights.add(new Flight("Warsaw", "Bangkok"));
        flights.add(new Flight("Gdansk", "Warsaw"));
        flights.add(new Flight("Copenhagen", "Rom"));
        flights.add(new Flight("Rom", "Los Angeles"));
        flights.add(new Flight("Copenhagen", "Bangkok"));
        flights.add(new Flight("Bangkok", "Phuket"));
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public List<Flight> findDeparture (String cityFrom) {
        return flights.stream()
                .filter(s-> s.getDepartureAirport().equals(cityFrom))
                .collect(Collectors.toList());
    }

    public List<Flight> findArrival (String cityTo) {
        return flights.stream()
                .filter(s-> s.getArrivalAirport().equals(cityTo))
                .collect(Collectors.toList());
    }

    public List<Flight> findConnectingFlights (String cityFrom, String cityTo) {
        List<Flight> departure = findDeparture(cityFrom);
        List<Flight> arrival = findArrival(cityTo);
        List<Flight> connectingFlights = new ArrayList<>();
        for (Flight start:departure) {
            for (Flight end:arrival) {
                if (start.getArrivalAirport().equals(end.getDepartureAirport())) {
                    connectingFlights.add(start);
                    connectingFlights.add(end);
                }
            }
        }
        return connectingFlights;
    }
}
