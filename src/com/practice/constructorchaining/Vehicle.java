package com.practice.constructorchaining;

public class Vehicle {
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }
    // Method to display information for Vehicle
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
    }

}
