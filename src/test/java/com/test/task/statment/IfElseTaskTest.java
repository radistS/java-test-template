package com.test.task.statment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class IfElseTaskTest {

    @Test
    public void testMaxFirstGreater() {
        assertEquals(10, IfElseTask.max(10, 5));
    }

    @Test
    public void testMaxSecondGreater() {
        assertEquals(20, IfElseTask.max(15, 20));
    }

    @Test
    public void testMaxEqual() {
        assertEquals(7, IfElseTask.max(7, 7));
    }

    @Test
    public void testGradeA() {
        assertEquals("A", IfElseTask.evaluateGrade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", IfElseTask.evaluateGrade(85));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", IfElseTask.evaluateGrade(75));
    }

    @Test
    public void testGradeD() {
        assertEquals("D", IfElseTask.evaluateGrade(65));
    }

    @Test
    public void testGradeF() {
        assertEquals("F", IfElseTask.evaluateGrade(50));
    }

    @Test
    public void testLeapYearDivisibleBy400() {
        assertTrue(IfElseTask.isLeapYear(2000));
    }

    @Test
    public void testNonLeapYearDivisibleBy100() {
        assertFalse(IfElseTask.isLeapYear(1900));
    }

    @Test
    public void testLeapYearDivisibleBy4() {
        assertTrue(IfElseTask.isLeapYear(2024));
    }

    @Test
    public void testNonLeapYear() {
        assertFalse(IfElseTask.isLeapYear(2019));
    }

    @Test
    public void testPositiveNumber() {
        assertEquals("Positive", IfElseTask.getSign(5));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals("Negative", IfElseTask.getSign(-3));
    }

    @Test
    public void testZero() {
        assertEquals("Zero", IfElseTask.getSign(0));
    }

    @Test
    public void testFizzBuzzFizzBuzz() {
        assertEquals("FizzBuzz", IfElseTask.fizzBuzz(15));
    }

    @Test
    public void testFizzBuzzFizz() {
        assertEquals("Fizz", IfElseTask.fizzBuzz(9));
    }

    @Test
    public void testFizzBuzzBuzz() {
        assertEquals("Buzz", IfElseTask.fizzBuzz(10));
    }

    @Test
    public void testFizzBuzzNumber() {
        assertEquals("7", IfElseTask.fizzBuzz(7));
    }

}
