package com.codecool.prime;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class calculatePrimes {

    static Set getPrimes(int n) {
        Set<Integer> numbers = IntStream.range(2, n + 1).boxed().collect(Collectors.toSet());
        Set<Integer> notPrimes = new HashSet<>();
        for (int i = 2; i < numbers.size(); i++) {
            if (i*i > n) {break;}
            for (int num : numbers) {
                notPrimes.add(num*i);
            }
            numbers.removeAll(notPrimes);
            notPrimes.clear();
        }
        return numbers;
    }
}
