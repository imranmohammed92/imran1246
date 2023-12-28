package com.practice.basicinheritance;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    // Method to make sound
    public void makeSound() {
        System.out.println(getName() + " says Meow!");
    }
}
