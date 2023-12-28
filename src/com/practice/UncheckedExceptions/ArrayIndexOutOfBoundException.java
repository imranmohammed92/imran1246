package com.practice.UncheckedExceptions;

public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        int[] variable = new int[3];
        variable[0] = 1;
        variable[1] = 2;
        variable[3] = 3;
        variable[4] = 4;

        System.out.println(variable);

    }
}
