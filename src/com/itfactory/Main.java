package com.itfactory;

import java.util.Scanner;
/*
---
Problem 6.
Write a program in which, using a loop (you decide which one) you will read integers from the keyboard until a number divisible by 7 is encountered.
 */

import java.util.Scanner;

public class Main {

       public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        int number_divisible_by_7 = 1;
        // initialize counter for how many times the loop runs, initially 0
        int i = 0;

        while (number_divisible_by_7 % 7 != 0) {
             {
                // input numbers from the keyboard
                System.out.println("Enter numbers until one is divisible by 7=  ");

                number_divisible_by_7 = Integer.parseInt(scanner.nextLine());
                // counter i increases by 1 with each loop iteration
                i = i + 1;
                // show the message below only from the second loop iteration and not on the last iteration
                if (i > 0 && number_divisible_by_7 % 7 != 0)
                    System.out.println("You have not entered a number divisible by 7!");

                if (number_divisible_by_7 % 7 == 0)
                    System.out.println("You have chosen a number divisible by 7!");

            }
        }
    }

}
