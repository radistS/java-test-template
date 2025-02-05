package com.test.task.language.concept;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LanguageConceptTest {

    @Test
    void testSumMultipleNumbers() {
        assertEquals(15, LanguageConceptTask.sum(1, 2, 3, 4, 5));
    }

    @Test
    void testSumWithNegativeNumbers() {
        assertEquals(0, LanguageConceptTask.sum(-1, 1, -2, 2));
    }

    @Test
    void testSumNoArguments() {
        assertEquals(0, LanguageConceptTask.sum());
    }

    @Test
    public void testEvenNumber() {
        assertEquals("Even", LanguageConceptTask.evenOrOdd(4));
    }

    @Test
    public void testOddNumber() {
        assertEquals("Odd", LanguageConceptTask.evenOrOdd(7));
    }

    @Test
    public void testZero() {
        assertEquals("Even", LanguageConceptTask.evenOrOdd(0));
    }

    @Test
    public void testWinterMonths() {
        assertEquals("Winter", LanguageConceptTask.getSeason(12));
        assertEquals("Winter", LanguageConceptTask.getSeason(1));
        assertEquals("Winter", LanguageConceptTask.getSeason(2));
    }

    @Test
    public void testSpringMonths() {
        assertEquals("Spring", LanguageConceptTask.getSeason(3));
        assertEquals("Spring", LanguageConceptTask.getSeason(4));
        assertEquals("Spring", LanguageConceptTask.getSeason(5));
    }

    @Test
    public void testSummerMonths() {
        assertEquals("Summer", LanguageConceptTask.getSeason(6));
        assertEquals("Summer", LanguageConceptTask.getSeason(7));
        assertEquals("Summer", LanguageConceptTask.getSeason(8));
    }

    @Test
    public void testAutumnMonths() {
        assertEquals("Autumn", LanguageConceptTask.getSeason(9));
        assertEquals("Autumn", LanguageConceptTask.getSeason(10));
        assertEquals("Autumn", LanguageConceptTask.getSeason(11));
    }

    @Test
    public void testInvalidMonth() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
            LanguageConceptTask.getSeason(13)
        );
        assertEquals("Invalid month: 13", exception.getMessage());
    }

}
