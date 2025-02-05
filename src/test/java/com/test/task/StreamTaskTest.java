package com.test.task;

import static org.junit.jupiter.api.Assertions.*;

import com.test.task.stream.StreamTask;
import java.util.Arrays;
import java.util.List;

import java.util.Map;
import org.junit.jupiter.api.Test;

class StreamTaskTest {

    @Test
    void testFilterAndUppercasePositive() {
        List<String> input = Arrays.asList("hello", "World", "java8", "Test!", "Stream");
        List<String> result = StreamTask.filterAndUppercase(input);
        // Ожидаем, что только строки, состоящие из букв: "hello", "World", "Stream"
        List<String> expected = Arrays.asList("HELLO", "WORLD", "STREAM");
        assertEquals(expected, result);
    }

    @Test
    void testFilterAndUppercaseAllInvalid() {
        List<String> input = Arrays.asList("123", "test1", "!@#", "java!");
        List<String> result = StreamTask.filterAndUppercase(input);
        // Все строки не удовлетворяют условию, ожидаем пустой список.
        assertTrue(result.isEmpty());
    }

    @Test
    void testFilterAndUppercaseEmptyInput() {
        List<String> input = List.of();
        List<String> result = StreamTask.filterAndUppercase(input);
        assertTrue(result.isEmpty());
    }

    @Test
    void testFilterAndUppercaseNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StreamTask.filterAndUppercase(null);
        });
        assertEquals("Input list cannot be null", exception.getMessage());
    }

    @Test
    void testFilterAndSquarePositive() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = StreamTask.filterAndSquare(input);
        // Ожидаем квадраты чётных чисел: 2*2=4, 4*4=16
        List<Integer> expected = Arrays.asList(4, 16);
        assertEquals(expected, result);
    }

    @Test
    void testFilterAndSquareNoEven() {
        List<Integer> input = Arrays.asList(1, 3, 5, 7);
        List<Integer> result = StreamTask.filterAndSquare(input);
        assertTrue(result.isEmpty());
    }

    @Test
     void testFilterAndSquareNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
            StreamTask.filterAndSquare(null)
        );
        assertEquals("Input list cannot be null", exception.getMessage());
    }

    @Test
     void testJoinStringsPositive() {
        List<String> input = Arrays.asList("apple", "", "banana", null, "cherry");
        String result = StreamTask.joinStrings(input);
        assertEquals("apple,banana,cherry", result);
    }

    @Test
     void testJoinStringsAllInvalid() {
        List<String> input = Arrays.asList("", " ", null);
        String result = StreamTask.joinStrings(input);
        assertEquals("", result);
    }

    @Test
    void testJoinStringsNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
            StreamTask.joinStrings(null)
        );
        assertEquals("Input list cannot be null", exception.getMessage());
    }

    @Test
    void testGroupByLengthPositive() {
        List<String> input = Arrays.asList("a", "to", "tea", "at", "in", "I");
        Map<Integer, List<String>> result = StreamTask.groupByLength(input);
        // Ожидаем, что строки длины 1: "a", "I"; длины 2: "to", "at", "in"; длины 3: "tea"
        assertEquals(2, result.get(1).size());
        assertEquals(3, result.get(2).size());
        assertEquals(1, result.get(3).size());
    }

    @Test
    void testGroupByLengthEmptyList() {
        List<String> input = List.of();
        Map<Integer, List<String>> result = StreamTask.groupByLength(input);
        assertTrue(result.isEmpty());
    }

    @Test
    void testGroupByLengthNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
            StreamTask.groupByLength(null)
        );
        assertEquals("Input list cannot be null", exception.getMessage());
    }
}
