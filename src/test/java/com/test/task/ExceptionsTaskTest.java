package com.test.task;

import static org.junit.jupiter.api.Assertions.*;

import com.test.task.exceptions.InvalidAgeException;
import org.junit.jupiter.api.Test;

class ExceptionsTaskTest {

    @Test
    void testDividePositive() {
        double result = ExceptionsTask.divide(10, 2);
        assertEquals(5.0, result);
    }

    @Test
    void testDivideNegativeNumbers() {
        double result = ExceptionsTask.divide(-9, -3);
        assertEquals(3.0, result);
    }

    @Test
    void testDivideWithNegativeResult() {
        double result = ExceptionsTask.divide(10, -2);
        assertEquals(-5.0, result);
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            ExceptionsTask.divide(10, 0);
        });
        assertEquals("Division by zero not allowed", exception.getMessage());
    }

    @Test
    void testParseIntPositive() {
        assertEquals(123, ExceptionsTask.parseInt("123"));
    }

    @Test
    void testParseIntNegative() {
        assertEquals(-456, ExceptionsTask.parseInt("-456"));
    }

    @Test
    void testParseIntInvalidFormat() {
        Exception exception = assertThrows(NumberFormatException.class, () ->
            ExceptionsTask.parseInt("abc")
        );
        assertEquals("Invalid number format: abc", exception.getMessage());
    }

    @Test
    void testValidateAgeValid() {
        assertTrue(ExceptionsTask.validateAge(25));
        assertTrue(ExceptionsTask.validateAge(0));
        assertTrue(ExceptionsTask.validateAge(120));
    }

    @Test
    void testValidateAgeInvalidLow() {
        Exception exception = assertThrows(InvalidAgeException.class, () ->
            ExceptionsTask.validateAge(-1)
        );
        assertEquals("Age must be between 0 and 120", exception.getMessage());
    }

    @Test
    void testValidateAgeInvalidHigh() {
        Exception exception = assertThrows(InvalidAgeException.class, () ->
            ExceptionsTask.validateAge(121)
        );
        assertEquals("Age must be between 0 and 120", exception.getMessage());
    }

    @Test
    void testFactorialZero() {
        assertEquals(1, ExceptionsTask.factorial(0));
    }

    @Test
    void testFactorialPositive() {
        assertEquals(120, ExceptionsTask.factorial(5));
        assertEquals(3628800, ExceptionsTask.factorial(10));
    }

    @Test
    void testFactorialNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
            ExceptionsTask.factorial(-3)
        );
        assertEquals("Factorial is not defined for negative numbers", exception.getMessage());
    }
}
