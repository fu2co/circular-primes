package nl.ensignprojects.katas.prime;

import java.util.ArrayList;

public class CirclePrimeCounter {
    public int count(int number) {
        if (number == 0 || number == 1) {
            return 0;
        }

        var primes = PrimeHelper.findAllPrimesBelow(number);
        var circlePrimes = new ArrayList<Integer>();

        for (int i = 0; i < number; i++) {
            if (primes.contains(i) && primes.contains(getReverse(i))) {
                circlePrimes.add(i);
            }
        }

        return circlePrimes.size();
    }

    private int getReverse(Integer number) {
        StringBuilder builder = new StringBuilder(String.valueOf(number));
        String reverseIntString = builder.reverse().toString();
        return Integer.parseInt(reverseIntString);
    }
}
