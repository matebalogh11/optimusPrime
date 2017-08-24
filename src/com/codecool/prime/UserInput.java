package com.codecool.prime;

import java.util.InputMismatchException;
import java.util.Scanner;

class UserInput {

    static int getNumber() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please add a number: ");
        int n;
        while (true) {
            try {
                n = reader.nextInt();
                if (n <= 0) {
                    System.out.println("Please give me a non-negative number!");
                }
                else { break; }
            } catch (InputMismatchException e) {
                System.out.println("Please add a valid number! " + "Error: " + e.toString());
                reader.next();
            }
        }
        return n;
    }
}
