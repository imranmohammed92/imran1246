package com.practice.superkeyword;

public class Student extends Person{
     protected int grade;



    // Constructor for Student using super keyword
    public Student(String name, int age, int grade) {
        super(name, age);

        // Initialize the additional property for Student
        this.grade = grade;

    }
        // Method to display information for Student
        public void displayStudentInfo() {
            // Call the displayInfo() method of the superclass (Person)
            super.displayInfo();

            // Display additional information for Student
            System.out.println("Grade: " + grade);

    }
}
