package edu.sandiego.comp305;

public final class StringUtils {
    private StringUtils() {}

    /**
     *
     * @param input the string to reverse
     * @return the reversed string
     */
    public static String reverseString(final String input) {

        return new StringBuilder(input).reverse().toString();
    }

    /**
     *
     * @param args CLI
     */

    public static void main(final String[] args) {
        System.out.println(reverseString("Hello World!"));
    }
}


