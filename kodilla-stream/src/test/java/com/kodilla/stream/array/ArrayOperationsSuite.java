package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsSuite {
    @Test
    void testGetAverageListNotEmpty() {
        //Given
        int numbers[] = {22, 444, 785, 99, 345, 234};

        //When
        double trueAverage = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(321.5, trueAverage, 0.01);
    }

    @Test
    void testGetAverageListEmpty() {
        //Given
        int numbers[] = {};

        //When
        double trueAverage = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(0.0, trueAverage, 0.01);
    }
}
