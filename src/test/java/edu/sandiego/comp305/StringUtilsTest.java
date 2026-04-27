package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    public void testIsEmpty() {
        assertEquals("", StringUtils.reverseString(""));

    }
    @Test
    public void testReverseSimpleString() {
        assertEquals("olleh", StringUtils.reverseString("hello"));
    }
    @Test
    public void testReverseSingleCharacter() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    @Test
    public void testReverseStringWithSpaces() {
        assertEquals("dlrow olleh", StringUtils.reverseString("hello world"));
    }

}
