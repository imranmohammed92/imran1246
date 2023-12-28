package com.practice.CustomExceptions;

public class DemoException {
    public static void main(String[] args) {
        try{
            throw new InvalidUserException("Not Eligible for this Course");
        }
        catch (InvalidUserException invalidUserException){
            System.out.println(invalidUserException.getMessage());
        }
    }
}
