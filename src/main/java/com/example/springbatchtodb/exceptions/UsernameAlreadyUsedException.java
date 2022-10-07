package com.example.springbatchtodb.exceptions;

public class UsernameAlreadyUsedException extends RuntimeException {
    public UsernameAlreadyUsedException() {
        super("Username Already Used");
    }

}
