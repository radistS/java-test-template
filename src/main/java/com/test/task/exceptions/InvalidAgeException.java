package com.test.task.exceptions;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String message) {
        super(message);
    }
}
