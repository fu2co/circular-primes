package nl.ensignprojects.katas.prime;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CirclePrimeCounter {

    public int count(int number) {
        if (number == 0 || number == 1) {
            return 0;
        }

        var primes = PrimeHelper.findAllPrimesBelow(number);
        var circularPrimes = new ArrayList<Integer>();

        for (int i = 0; i < primes.size(); i++) {
            Integer foundPrime = primes.get(i);

            if (new HashSet<>(primes).containsAll(findAllRotations(foundPrime))) {
                circularPrimes.add(foundPrime);
            }
        }

        return circularPrimes.size();
    }

    private List<Integer> findAllRotations(int number) {
        String numberString = String.valueOf(number);
        List<Integer> rotations = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder(numberString);
        for (int i = 0; i < numberString.length(); i++) {
            String firstNumber = stringBuilder.substring(0, 1);
            stringBuilder.deleteCharAt(0);
            stringBuilder.append(firstNumber);
            rotations.add(Integer.valueOf(stringBuilder.toString()));
        }
        return rotations;
    }
}
