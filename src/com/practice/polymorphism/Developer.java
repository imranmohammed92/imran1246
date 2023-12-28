package com.practice.polymorphism;

public class Developer extends Employee {
    @Override
    public void calculateSalary() {
        super.calculateSalary();
        System.out.println("Developer Incentive: $5000");

    }
}
