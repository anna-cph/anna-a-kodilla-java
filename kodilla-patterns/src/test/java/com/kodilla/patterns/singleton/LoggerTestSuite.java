package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void testAddLog() {
        //Given
        Logger logger = Logger.INSTANCE;

        //When
        logger.log("xxx");

        //Then
        //do nothing
    }

    @Test
    void testGetLastLog() {
        //Given
        Logger logger = Logger.INSTANCE;

        //When
        logger.log("xxx");
        String lastLog = logger.getLastLog();

        //Then
        assertEquals("xxx", lastLog);
    }
}
