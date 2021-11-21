package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.*;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("when create OddNumbersExterminator with empty list, " +
            "then exterminate should return empty list"
    )


    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        List<Integer> expectedResult = new ArrayList<>();
        OddNumbersExterminator list = new OddNumbersExterminator();
        //When
        List<Integer> result = list.exterminate(numbers);
        System.out.println("Testing Empty List, the list contains " + result);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }


    @DisplayName("when create OddNumbersExterminator with list of even and uneven numbers, " +
            "then exterminate should return list with only even numbers"
    )

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(12);
        numbers1.add(3);
        numbers1.add(134);
        numbers1.add(25);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(12);
        expectedResult.add(134);
        OddNumbersExterminator list1 = new OddNumbersExterminator();
        //When
        List<Integer> result = list1.exterminate(numbers1);
        System.out.println("Testing for even numbers- even numbers in the list " + result);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }


}


