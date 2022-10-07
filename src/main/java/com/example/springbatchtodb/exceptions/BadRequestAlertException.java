package com.example.springbatchtodb.exceptions;

public class BadRequestAlertException extends RuntimeException {
    public BadRequestAlertException(String message) {
        super(message);
    }
}
