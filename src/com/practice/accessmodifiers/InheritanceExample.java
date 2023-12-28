package com.practice.accessmodifiers;

public class InheritanceExample {
    public static void main(String[] args) {
        Child child= new Child();
        System.out.println("Secret Data: " + child.getSecretData());
    }
}
