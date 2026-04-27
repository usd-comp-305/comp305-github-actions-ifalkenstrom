package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for StringUtils.
 */
class StringUtilsTest {

    @Test
    void reverseString_RegularInput_ReturnsReversedString() {
        final String input = "USD";
        final String expected = "DSU";

        final String actual = StringUtils.reverseString(input);

        assertEquals(expected, actual,
                "String should be reversed correctly.");
    }

    @Test
    void reverseString_EmptyString_ReturnsEmptyString() {
        final String input = "";
        final String expected = "";

        final String actual = StringUtils.reverseString(input);

        assertEquals(expected, actual,
                "Empty string should remain empty.");
    }

    @Test
    void reverseString_Palindrome_ReturnsSameString() {
        final String input = "racecar";
        final String expected = "racecar";

        final String actual = StringUtils.reverseString(input);

        assertEquals(expected, actual,
                "Palindrome should remain unchanged.");
    }

    @Test
    void reverseString_NullInput_ReturnsNull() {
        assertNull(StringUtils.reverseString(null),
                "Null input should return null.");
    }
}




