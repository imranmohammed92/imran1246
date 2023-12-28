package com.practice.UncheckedExceptions;

public class IllegalArgumentException {
    public static void main(String[] args) {

        int age = 2;


            if (age < 0) {
                throw new IllegalArgumentException("Age must be non-negative");
            }
            // Process the age
        }


}
