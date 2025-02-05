package com.test.task;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

import java.util.Map;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;

class CollectionsTaskTest {

    @Test
    void testUniqueSortedPositive() {
        List<Integer> input = Arrays.asList(5, 3, 1, 3, 2, 5, 4);
        Collection<Integer> result = CollectionsTask.getUniqueSorted(input);
        // Ожидаем результат: [1, 2, 3, 4, 5]
        List<Integer> expected = List.of(1, 2, 3, 4, 5);
        assertEquals(expected, new ArrayList<>(result));
    }

    @Test
    void testUniqueSortedEmptyInput() {
        List<Integer> input = List.of();
        Collection<Integer> result = CollectionsTask.getUniqueSorted(input);
        // Ожидаем пустую коллекцию
        assertTrue(result.isEmpty());
    }

    @Test
    void testUniqueSortedNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CollectionsTask.getUniqueSorted(null);
        });
        assertEquals("Input collection cannot be null", exception.getMessage());
    }

    @Test
    void testMergeSortedUniquePositive() {
        Collection<Integer> first = new TreeSet<>(Arrays.asList(1, 3, 5));
        Collection<Integer> second = new TreeSet<>(Arrays.asList(2, 3, 4));
        Collection<Integer> result = CollectionsTask.mergeSortedUnique(first, second);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, result.stream().toList());
    }

    @Test
    void testMergeSortedUniqueEmptyCollection() {
        Collection<Integer> first = new TreeSet<>();
        Collection<Integer> second = new TreeSet<>(Arrays.asList(2, 3, 4));
        Collection<Integer> result = CollectionsTask.mergeSortedUnique(first, second);
        List<Integer> expected = Arrays.asList(2, 3, 4);
        assertEquals(expected, result.stream().toList());
    }

    @Test
    void testMergeSortedUniqueNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
            CollectionsTask.mergeSortedUnique(null, new TreeSet<>(Arrays.asList(1, 2)))
        );
        assertEquals("Input collections cannot be null", exception.getMessage());
    }


    @Test
    void testReverseListPositive() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        List<Integer> result = CollectionsTask.reverseList(input);
        List<Integer> expected = Arrays.asList(4, 3, 2, 1);
        assertEquals(expected, result);
    }

    @Test
    void testReverseListEmpty() {
        List<Integer> input = List.of();
        List<Integer> result = CollectionsTask.reverseList(input);
        assertTrue(result.isEmpty());
    }

    @Test
    void testReverseListNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
            CollectionsTask.reverseList(null)
        );
        assertEquals("Input list cannot be null", exception.getMessage());
    }

    @Test
    void testCountFrequencyPositive() {
        List<Integer> input = Arrays.asList(1, 2, 2, 3, 3, 3);
        Map<Integer, Integer> result = CollectionsTask.countFrequency(input);
        assertEquals(1, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(3, result.get(3));
    }

    @Test
    void testCountFrequencyEmptyList() {
        List<Integer> input = List.of();
        Map<Integer, Integer> result = CollectionsTask.countFrequency(input);
        assertTrue(result.isEmpty());
    }

    @Test
    void testCountFrequencyNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
            CollectionsTask.countFrequency(null)
        );
        assertEquals("Input list cannot be null", exception.getMessage());
    }
}
