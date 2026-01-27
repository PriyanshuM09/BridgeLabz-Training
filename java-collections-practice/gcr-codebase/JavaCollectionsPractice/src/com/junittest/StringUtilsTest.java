package com.junittest;
import com.junit.StringUtils;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testReverse() {
        assertEquals("olleh", StringUtils.reverse("hello"));
        assertEquals("", StringUtils.reverse(""));
        assertNull(StringUtils.reverse(null));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertTrue(StringUtils.isPalindrome("level"));
        assertFalse(StringUtils.isPalindrome("hello"));
        assertFalse(StringUtils.isPalindrome(null));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        assertEquals("JAVA", StringUtils.toUpperCase("java"));
        assertNull(StringUtils.toUpperCase(null));
    }
}

