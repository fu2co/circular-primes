package nl.ensignprojects.katas.prime;

import java.util.HashSet;

public class CirclePrimeCounter {
    public int count(int number) {
        if (number == 0 || number == 1) {
            return 0;
        }

        var primes = new HashSet<Integer>();

        for (int i = 0; i < number; i++) {
            if (PrimeHelper.isPrime(i)) {
                primes.add(i);
            }
        }

        return primes.size();
    }
}
