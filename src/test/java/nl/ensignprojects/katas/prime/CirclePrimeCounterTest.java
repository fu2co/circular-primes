package nl.ensignprojects.katas.prime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CirclePrimeCounterTest {

    private static final Logger LOGGER = LogManager.getLogger(CirclePrimeCounterTest.class);

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
}
