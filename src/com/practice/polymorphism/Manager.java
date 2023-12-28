package com.practice.polymorphism;

public class Manager extends Employee {
    @Override
    public void calculateSalary() {
        super.calculateSalary();
        System.out.println("Manager Bonus: $10000");
    }
}
