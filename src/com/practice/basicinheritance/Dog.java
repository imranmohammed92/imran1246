package com.practice.basicinheritance;
public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    // Method to make sound
    public void makeSound() {
        System.out.println(getName() + " says Woof!");
    }
}
