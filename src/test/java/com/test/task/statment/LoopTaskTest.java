package com.test.task.statment;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class LoopTaskTest {

    @Test
    public void testSumUpToPositive() {
        // 1+2+3+4+5 = 15
        assertEquals(15, LoopTask.sumUpTo(5));
    }

    @Test
    public void testSumUpToZero() {
        assertEquals(0, LoopTask.sumUpTo(0));
    }

    @Test
    public void testSumUpToNegative() {
        assertEquals(0, LoopTask.sumUpTo(-3));
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, LoopTask.factorial(0));
    }

    @Test
    public void testFactorialPositive() {
        assertEquals(120, LoopTask.factorial(5));
    }

    @Test
    public void testFactorialNegative() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            LoopTask.factorial(-1);
        });
        assertEquals("Factorial is not defined for negative numbers", ex.getMessage());
    }

    @Test
    public void testCountDigitsPositive() {
        assertEquals(3, LoopTask.countDigits(123));
    }

    @Test
    public void testCountDigitsNegative() {
        assertEquals(3, LoopTask.countDigits(-456));
    }

    @Test
    public void testCountDigitsZero() {
        assertEquals(1, LoopTask.countDigits(0));
    }

    @Test
    public void testFibonacciFirst() {
        assertEquals(0, LoopTask.fibonacci(1));
    }

    @Test
    public void testFibonacciSecond() {
        assertEquals(1, LoopTask.fibonacci(2));
    }

    @Test
    public void testFibonacciFifth() {
        // Последовательность: 0, 1, 1, 2, 3, ...
        assertEquals(3, LoopTask.fibonacci(5));
    }

    @Test
    public void testFibonacciInvalid() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            LoopTask.fibonacci(0);
        });
        assertEquals("n must be at least 1", ex.getMessage());
    }

    @Test
    public void testReverseArrayRegular() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, LoopTask.reverseArray(input));
    }

    @Test
    public void testReverseArrayEmpty() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, LoopTask.reverseArray(input));
    }

    @Test
    public void testReverseArrayNull() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            LoopTask.reverseArray(null);
        });
        assertEquals("Input array cannot be null", ex.getMessage());
    }
}
