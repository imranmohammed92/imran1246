package com.practice.CustomExceptions;

public class InvalidUserException extends Exception {
    InvalidUserException(String message){
        super(message);
    }

}
