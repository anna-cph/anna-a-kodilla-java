package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals("Driving to: London with a car: Ford Fiesta", driving.executeTask());
        assertEquals("Driving a car", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //Then
        assertEquals("Color to paint in: pink, painting: door", painting.executeTask());
        assertEquals("Painting an item", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("Buying: apples in amount: 22.0pieces", shopping.executeTask());
        assertEquals("Shopping an item", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }

}
