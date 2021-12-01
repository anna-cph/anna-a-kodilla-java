package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    //Test1
    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
        }

    //Test2
    public double calculateAverageForecast() {
        double average = 0.0;
        //Zwraca kolekcje temperatur
        temperatures.getTemperatures().values();

        for (double temperature:
                temperatures.getTemperatures().values()) {
            average = average + temperature;
        }
        return average / temperatures.getTemperatures().values().size();

    }

    //Test2
    public double calculateMedianForecast() {
        double median = 0.0;
        //Zwraca kolekcje temperatur
        List<Double> temps = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(temps);

        if (temps.size()%2 == 0) {
            median = (temps.get(temps.size()/2-1)+temps.get(temps.size()/2))/2;
        } else {
            median = temps.get(temps.size()/2);
        }
        return median;
    }
}