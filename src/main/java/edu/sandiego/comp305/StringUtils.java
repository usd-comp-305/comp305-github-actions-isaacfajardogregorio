package edu.sandiego.comp305;

public final class StringUtils {
    private StringUtils() {}

    public static String reverseString(final String input) {

        return new StringBuilder(input).reverse().toString();
    }

    public static void main(final String[] args) {
        System.out.println(reverseString("Hello World!"));
    }
}


