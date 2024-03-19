package nl.ensignprojects.katas.prime;

import java.util.stream.IntStream;

public interface PrimeHelper {
    static boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }

        return IntStream.range(2, number)
                .noneMatch(i -> number % i == 0);
    }
}
