package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testAdding() {
        //Given
        //When
        calculator.add(6.0, 3.0);
        //Then
        //do nothing
    }

    @Test
    void testSubtracting() {
        //Given
        //When
        calculator.sub(6.0, 3.0);
        //Then
        //do nothing
    }

    @Test
    void testMultiplying() {
        //Given
        //When
        calculator.mul(6.0, 3.0);
        //Then
        //do nothing
    }

    @Test
    void testDividing() {
        //Given
        //When
        calculator.div(6.0, 3.0);
        //Then
        //do nothing
    }
}
