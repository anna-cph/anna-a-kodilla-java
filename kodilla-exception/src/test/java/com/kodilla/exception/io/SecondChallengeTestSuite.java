package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {
    @Test
    void probablyIWillNotThrowException() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when&then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(2.0, 2.0));
    }

   /* @Test
    void probablyIWillThrowException() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when&then
        assertThrows(SecondChallenge.class, () -> secondChallenge.probablyIWillThrowException(2.0, 2.0));
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.9, 2.0));
    }

    */

}
