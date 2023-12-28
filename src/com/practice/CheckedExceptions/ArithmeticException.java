package com.practice.CheckedExceptions;

public class ArithmeticException extends Throwable {
    public static void main(String[] args) throws ArithmeticException {
        int a = 10;
        int b = 0;
        int c = a / b;
        System.out.println(c);

    }
}
