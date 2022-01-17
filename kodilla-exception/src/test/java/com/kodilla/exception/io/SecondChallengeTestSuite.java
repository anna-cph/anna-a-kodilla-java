package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {
    @Test
    void willNotThrowException() throws Exception {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when&then
        //assertEquals("Done!", secondChallenge.probablyIWillThrowException(1.8, 1.0));
        //assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.8, 1.0));
        assertAll(
                () -> assertEquals("Done!", secondChallenge.probablyIWillThrowException(1.8, 1.0)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.8, 1.0)));
    }

   @Test
    void willThrowException() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when&then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 2.0));
    }

}
