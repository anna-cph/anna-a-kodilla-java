package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.*;

public class WeatherForecastTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    //Test1
    @Test
    void testCalculateForecastWithStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub(); // TODO produkty
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    //Test2
    @Test
    void testCalculateAverageForecast() {
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        double average = weatherForecast.calculateAverageForecast();

        //Then
        Assertions.assertEquals(25.56, average);
    }

    //Test3
    @Test
    void testCalculateMedianForecast() {
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        double median = weatherForecast.calculateMedianForecast();

        //Then
        Assertions.assertEquals(25.5, median);
    }
}
