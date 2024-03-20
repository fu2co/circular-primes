package nl.ensignprojects.katas.prime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static nl.ensignprojects.katas.prime.PrimeHelper.isPrime;
import static org.assertj.core.api.Assertions.assertThat;

class PrimeHelperTest {

    @ParameterizedTest
    @DisplayName("Is not a prime")
    @ValueSource(ints = {0, 1, 4, 6, 10})
    void testIsNotAPrime(int prime) {
        assertThat(isPrime(prime)).isFalse();
    }

    @ParameterizedTest
    @DisplayName("Is a prime")
    @ValueSource(ints = {2, 3, 7, 5})
    void testIsAPrime(int prime) {
        assertThat(isPrime(prime)).isTrue();
    }

    @Test
    @DisplayName("Find all primes below 10")
    void testFindAllPrimesBelow10() {
        var primes = PrimeHelper.findAllPrimesBelow(10);

        assertThat(primes).hasSize(4);
        assertThat(primes).contains(2, 3, 5, 7);
    }

}