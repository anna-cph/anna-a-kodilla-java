package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {
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


    @Nested
    @DisplayName("Tests for playing with figures")
    class TestTestingFigures {
    //Test1
    @Test
    //Sprawdzajacy czy po dodaniu nowej figury liczba figur wynosi 1;
    void testAddFigure() {
        //Given
        Shape circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(circle);

        //Then
        Assertions.assertEquals(1, shapeCollector.getFigureQuantity());
    }

    //Test2
    @Test
    //Sprawdzajacy czy uda sie usunac istniejaca figure z listy
    void testRemoveFigureExisting() {

        //Given
        Shape triangle = new Triangle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);

        //When
        boolean result = shapeCollector.removeFigure(triangle);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, shapeCollector.getFigureQuantity());


    }

    //Test3
    @Test
    //Sprawdzajacy czy uda sie usunac nieistniejaca figure z listy
    void testRemoveFigureNonExisting() {

        //Given
        Shape triangle = new Triangle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);

        //When
        boolean result = shapeCollector.removeFigure(new Circle());

        //Then
        Assertions.assertFalse(result);
        Assertions.assertEquals(1, shapeCollector.getFigureQuantity());

    }

    //Test4
    @Test
    //Sprawdzajacy pobieranie sie figur istniejacych
    void testGetFigureExisting() {

        //Given
        Shape square = new Square();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        //shapeCollector.addFigure(new Circle());


        //When
        Shape retrievedFigure = shapeCollector.getFigure(0);

        //Then
        Assertions.assertEquals(square, retrievedFigure);

    }

    //Test5
    @Test
    //Sprawdzajacy pobieranie sie figur z negatywnym indeksem
    void testGetFigureNegativeIndex() {

        //Given
        Shape triangle = new Triangle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);
        //shapeCollector.addFigure(new Circle());


        //When
        Shape retrievedFigure = shapeCollector.getFigure(-1);

        //Then
        Assertions.assertNull(retrievedFigure);
    }

    //Test6
    @Test
    //Sprawdzajacy pobieranie sie figur z za duzym indeksem
    void testGetFigureTooBigIndex() {

        //Given
        Shape triangle = new Triangle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);
        //shapeCollector.addFigure(new Circle());


        //When
        Shape retrievedFigure = shapeCollector.getFigure(1);

        //Then
        Assertions.assertNull(retrievedFigure);
    }
    }

}


