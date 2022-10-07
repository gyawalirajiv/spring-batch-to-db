package com.example.springbatchtodb.exceptions;

public class EmailAlreadyUsedException extends RuntimeException {
    public EmailAlreadyUsedException() {
        super("Email Already Used");
    }
}
