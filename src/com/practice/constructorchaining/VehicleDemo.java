package com.practice.constructorchaining;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car= new Car("Toyota", 2022, "Camry");


        // Call the displayCarInfo() method for Car
        System.out.println("Car Information:");
        car.displayCarInfo();

    }
}
