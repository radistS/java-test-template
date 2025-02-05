package com.test.task.errors;

import com.test.task.exception.InvalidAgeException;

public class ExceptionsTask {

    /**
     * Поделить numerator на denominator.
     *
     * @param numerator делимое
     * @param denominator делитель
     * @return результат деления
     * @throws ArithmeticException если denominator равен 0
     */
    public static double divide(int numerator, int denominator) {
        // todo: add code ...
        return 0;
    }

    /**
     * Преобразуй строку в целое число.
     *
     * @param input строка для преобразования
     * @return целое число
     * @throws NumberFormatException если строка не является корректным числом
     */
    public static int parseInt(String input) {
        // todo: add code ...
        return 0;
    }

    /**
        * Проверь, что возраст находится в диапазоне [0, 120].
        *
        * @param age возраст для проверки
     * @return true, если возраст валиден
     * @throws InvalidAgeException если возраст невалидный
     */
    public static boolean validateAge(int age) {
        // todo: add code ...
        return false;
    }

    /**
     * Вычисллить факториал числа.
     *
     * @param n число для вычисления факториала
     * @return факториал n
     * @throws IllegalArgumentException если n отрицательное
     */
    public static long factorial(int n) {
        // todo: add code ...
        return 0L;
    }
}
