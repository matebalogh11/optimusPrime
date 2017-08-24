package com.codecool.prime;

public class Main {

    public static void main(String[] args) {
        int n = UserInput.getNumber();
        long startTime = System.currentTimeMillis();
        System.out.println(calculatePrimes.getPrimes(n));
        long endTime = System.currentTimeMillis();
        System.out.println("That took: " + (endTime - startTime) + "ms");
    }
}
