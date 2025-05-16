package io.test.manufakturalitejava.utils;

public class StringParsers {
    /**
     * Удаляет все пробелы из строки.
     */
    public static String removeWhitespace(String input) {
        return input == null ? null : input.replaceAll("\\s+", "");
    }

    /**
     * Преобразует строку в верхний регистр.
     */
    public static String toUpperCase(String input) {
        return input == null ? null : input.toUpperCase();
    }

    /**
     * Преобразует строку в нижний регистр.
     */
    public static String toLowerCase(String input) {
        return input == null ? null : input.toLowerCase();
    }

    /**
     * Проверяет, содержит ли строка указанную подстроку.
     */
    public static boolean containsSubstring(String input, String substring) {
        return input != null && substring != null && input.contains(substring);
    }

    /**
     * Переворачивает строку (реверс).
     */
    public static String reverseString(String input) {
        return input == null ? null : new StringBuilder(input).reverse().toString();
    }

    /**
     * Извлекает только цифры из строки.
     */
    public static String extractDigits(String input) {
        return input == null ? null : input.replaceAll("\\D+", "");
    }

    /**
     * Извлекает только буквы из строки.
     */
    public static String extractLetters(String input) {
        return input == null ? null : input.replaceAll("[^a-zA-Z]", "");
    }

}
