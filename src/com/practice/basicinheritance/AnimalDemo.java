package com.practice.basicinheritance;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3);
        Cat myCat = new Cat("Whiskers", 2);

        // Call the makeSound() method for each animal
        myDog.makeSound();
        myCat.makeSound();
    }
    }

