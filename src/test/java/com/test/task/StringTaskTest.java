package com.test.task;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.test.task.str.StringTask;
import org.junit.jupiter.api.Test;

class StringTaskTest {

    @Test
    public void testReverseRegularString() {
        assertEquals("olleh", StringTask.reverse("hello"));
    }

    @Test
    public void testReverseEmptyString() {
        assertEquals("", StringTask.reverse(""));
    }

    @Test
    public void testReverseNull() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            StringTask.reverse(null);
        });
        assertEquals("Input cannot be null", ex.getMessage());
    }

    @Test
    public void testCountVowelsRegular() {
        // В "hello" гласные: e, o -> 2
        assertEquals(2, StringTask.countVowels("hello"));
    }

    @Test
    public void testCountVowelsCaseInsensitive() {
        // В "Apple" гласные: A, e -> 2
        assertEquals(2, StringTask.countVowels("Apple"));
    }

    @Test
    public void testCountVowelsNoVowels() {
        assertEquals(0, StringTask.countVowels("bcdfg"));
    }

    @Test
    public void testCountVowelsEmpty() {
        assertEquals(0, StringTask.countVowels(""));
    }

    @Test
    public void testCountVowelsNull() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            StringTask.countVowels(null);
        });
        assertEquals("Input cannot be null", ex.getMessage());
    }

    @Test
    public void testPalindromeSimple() {
        assertTrue(StringTask.isPalindrome("racecar"));
    }

    @Test
    public void testPalindromeWithSpacesAndCase() {
        assertTrue(StringTask.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(StringTask.isPalindrome("hello"));
    }

    @Test
    public void testEmptyStringPalindrome() {
        // Пустая строка считается палиндромом
        assertTrue(StringTask.isPalindrome(""));
    }

    @Test
    public void testNullInput() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            StringTask.isPalindrome(null);
        });
        assertEquals("Input cannot be null", ex.getMessage());
    }

    @Test
    public void testRemoveDuplicatesRegular() {
        // "hello" -> "helo"
        assertEquals("helo", StringTask.removeDuplicates("hello"));
    }

    @Test
    public void testRemoveDuplicatesAllUnique() {
        assertEquals("abc", StringTask.removeDuplicates("abc"));
    }

    @Test
    public void testRemoveDuplicatesEmpty() {
        assertEquals("", StringTask.removeDuplicates(""));
    }

    @Test
    public void testRemoveDuplicatesNull() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            StringTask.removeDuplicates(null);
        });
        assertEquals("Input cannot be null", ex.getMessage());
    }

    @Test
    public void testCapitalizeWordsRegular() {
        assertEquals("Hello World", StringTask.capitalizeWords("hello world"));
    }

    @Test
    public void testCapitalizeWordsMixedCase() {
        assertEquals("Java Programming", StringTask.capitalizeWords("jAvA pRoGrAmMiNg"));
    }

    @Test
    public void testCapitalizeWordsExtraSpaces() {
        assertEquals("Hello World", StringTask.capitalizeWords("  hello   world  "));
    }

    @Test
    public void testCapitalizeWordsEmpty() {
        assertEquals("", StringTask.capitalizeWords(""));
    }

    @Test
    public void testCapitalizeWordsNull() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            StringTask.capitalizeWords(null);
        });
        assertEquals("Input cannot be null", ex.getMessage());
    }

    @Test
    public void testFindLongestWordRegular() {
        assertEquals("programming", StringTask.findLongestWord("Java programming is fun"));
    }

    @Test
    public void testFindLongestWordTie() {
        // Если два слова равны по длине, должно возвращаться первое
        assertEquals("hello", StringTask.findLongestWord("hello world"));
    }

    @Test
    public void testFindLongestWordEmpty() {
        assertEquals("", StringTask.findLongestWord(""));
    }

    @Test
    public void testFindLongestWordNull() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            StringTask.findLongestWord(null);
        });
        assertEquals("Input cannot be null", ex.getMessage());
    }

}
