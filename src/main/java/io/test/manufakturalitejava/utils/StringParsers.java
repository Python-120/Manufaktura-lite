package io.test.manufakturalitejava.utils;

import org.jspecify.annotations.NonNull;

public class StringParsers {

    public static String removeWhitespace(String input) {
        return input == null ? null : input.replaceAll("\\s+", "");
    }

    public static String toUpperCase(String input) {
        return input == null ? null : input.toUpperCase();
    }

    public static String toLowerCase(String input) {
        return input == null ? null : input.toLowerCase();
    }

    public static boolean containsSubstring(String input, String substring) {
        return input != null && substring != null && input.contains(substring);
    }

    public static String reverseString(String input) {
        return input == null ? null : new StringBuilder(input).reverse().toString();
    }

    public static String extractDigits(String input) {
        return input == null ? null : input.replaceAll("\\D+", "");
    }


    public static String extractLetters(String input) {
        return input == null ? null : input.replaceAll("[^a-zA-Z]", "");
    }

    @NonNull
    public static Integer parseIntegerFromString(String targetText) {
        String digitText = targetText.replaceAll("\\D+", "");
        return Integer.parseInt(digitText);
    }

    @NonNull
    public static   Double parseDoubleFromString(String targetText) {
        String doubleText = targetText.replaceAll("[^\\d.]", "");
        return Double.parseDouble(doubleText);
    }

}
