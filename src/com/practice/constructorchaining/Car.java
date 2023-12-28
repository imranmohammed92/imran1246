package com.practice.constructorchaining;

public class Car extends Vehicle{
    private String model;
    public Car(String make, int year, String model) {
        super(make, year);
        // Initialize the additional property for Car
        this.model = model;
    }

        // Method to display information for Car
        public void displayCarInfo() {
            // Call the displayInfo() method of the superclass (Vehicle)
            super.displayInfo();

            // Display additional information for Car
            System.out.println("Model: " + model);

    }
}
