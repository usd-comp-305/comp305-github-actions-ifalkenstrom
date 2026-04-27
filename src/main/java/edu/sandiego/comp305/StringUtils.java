package edu.sandiego.comp305;

/**
 * Utility class for string operations.
 */
public class StringUtils {

    private StringUtils() {
        // Prevent instantiation
    }

    /**
     * Reverses the provided string.
     * @param s The string to reverse.
     * @return The reversed string.
     */
    public static String reverseString(final String s) {
        if (s == null) {
            return null;
        }
        return new StringBuilder(s).reverse().toString();
    }
}



