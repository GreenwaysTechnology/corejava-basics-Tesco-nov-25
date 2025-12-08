package com.tesco.exception.custom.checked;

public class InvalidAgeException extends Exception {
    //constructor
    public InvalidAgeException() {
        //calling no arg base class constructor
        super();
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
