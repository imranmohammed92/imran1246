package com.practice.polymorphism;

public class SalaryCalculationDemo {
    public static void main(String[] args) {
        // Create instances of Manager and Developer
        Manager manager = new Manager();
        Developer developer = new Developer();

        // Calculate and print salaries for Manager and Developer
        System.out.println("Manager's Salary Details:");
        manager.calculateSalary();

        System.out.println("\nDeveloper's Salary Details:");
        developer.calculateSalary();
    }
}
