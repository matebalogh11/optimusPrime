package com.codecool.prime;

public class Main {

    public static void main(String[] args) {
        int n = UserInput.getNumber();

        long startTime = System.currentTimeMillis();
        calculatePrimes.getPrimesMemoHeavy(n);
        long endTime = System.currentTimeMillis();
        System.out.println("getPrimesMemoHeavy took: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        calculatePrimes.getPrimesProcHeavy(n);
        endTime = System.currentTimeMillis();
        System.out.println("getPrimesProcHeavy took: " + (endTime - startTime) + "ms");
    }
}
