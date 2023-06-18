package org.example;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class SumCalculatorTest {
    private SumCalculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    void testSumOfOne() {
        assertEquals(1, calculator.sum(1));
    }

    @Test
    void testSumOfThree() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    void testSumOfZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}