package com.codecool.prime;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class calculatePrimes {

    static Set getPrimesMemoHeavy(int n) {
        Set<Integer> numbers = IntStream.range(2, n + 1).boxed().collect(Collectors.toSet());
        Set<Integer> notPrimes = new HashSet<>();
        for (int i = 2; i < numbers.size(); i++) {
            int checkPow = i*i;
            if (checkPow > n) {break;}
            for (int num : numbers) {
                notPrimes.add(num*i);
            }
            numbers.removeAll(notPrimes);
            notPrimes.clear();
        }
        return numbers;
    }
    static Set getPrimesProcHeavy(int n) {
        int[] numbers = new int[n-1];
        for (int i = 2; i <= n; i++) {
            numbers[i-2] = i;
        }
        for (int i = 2; i <= numbers.length; i++) {
            if (i*i > n) {break;}
            for (int j = n-2; j > i-2; j--) {
                numbers[j] = (numbers[j] % i == 0) ? 0 : numbers[j];
            }
        }
        Set<Integer> result = Arrays.stream(numbers).boxed().collect(Collectors.toSet());
        result.remove(0);
        return result;
    }
}
