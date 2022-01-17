package com.kodilla.exception.nullpointer;

import com.kodilla.exception.test.ExceptionHandling;

public class MessageNotSentException extends Exception {
    public MessageNotSentException(final String message) {
        super(message);
    }
}
