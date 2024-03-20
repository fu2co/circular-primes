package nl.ensignprojects.katas.prime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CirclePrimeCounterTest {

    private CirclePrimeCounter counter;

    @BeforeEach
    void setUp() {
        counter = new CirclePrimeCounter();
    }

    @Test
    @DisplayName("There are 0 circular primes below 1.")
    void testCounterFor0() {
        assertThat(counter.count(0)).isEqualTo(0);
    }

    @Test
    @DisplayName("There are 0 circular primes below 1.")
    void testCounterFor1() {
        assertThat(counter.count(1)).isEqualTo(0);
    }

    @Test
    @DisplayName("There are 4 circular primes below 10.")
    void testCounterFor10() {
        assertThat(counter.count(10)).isEqualTo(4);
    }

    @Test
    @DisplayName("There are 13 circular primes below 100.")
    void testCounterFor100() {
        assertThat(counter.count(100)).isEqualTo(13);
    }

    @Test
    @DisplayName("There are 25 circular primes below 1000.")
    void testCounterFor1000() {
        assertThat(counter.count(1000)).isEqualTo(25);
    }

    @Test
    @DisplayName("There are 33 circular primes below 10000.")
    void testCounterFor10000() {
        assertThat(counter.count(10000)).isEqualTo(33);
    }

    @Test
    @DisplayName("There are 43 circular primes below 100000.")
    void testCounterFor100000() {
        assertThat(counter.count(100000)).isEqualTo(43);
    }

    @Test
    @Disabled // This test is disabled, because it takes 7 minutes on an XPS13
    @DisplayName("There are 55 circular primes below 1000000.")
    void testCounterFor1000000() {
        assertThat(counter.count(1000000)).isEqualTo(55);
    }
}
