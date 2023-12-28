package com.practice.HackerRank.Task01;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



/*
HACKER RANK TEST TASK01
In this challenge, we test your knowledge of using if-else conditional statements
to automate decision-making processes. An if-else statement has the following logical flow:
 */

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        if (n % 2 == 1 || (n % 2 == 0 && n >= 6 && n <= 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

    }
}

