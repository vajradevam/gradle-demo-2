package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({"1, 2, 3", "-1, 1, 0", "0, 0, 0", "100, 200, 300"})
    @DisplayName("add returns expected sums")
    void addReturnsExpectedSums(int a, int b, int expected) {
        assertEquals(expected, calculator.add(a, b));
    }

    @Test
    @DisplayName("subtract and multiply behave as expected")
    void subtractAndMultiply() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    @DisplayName("divide returns fractional result")
    void divideReturnsFraction() {
        assertEquals(2.5, calculator.divide(5, 2), 0.0001);
    }

    @Test
    @DisplayName("divide by zero throws IllegalArgumentException")
    void divideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }
}
