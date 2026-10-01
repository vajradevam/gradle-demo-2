package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    @DisplayName("isNullOrEmpty handles null, empty, and non-empty strings")
    void isNullOrEmpty() {
        assertTrue(StringUtils.isNullOrEmpty(null));
        assertTrue(StringUtils.isNullOrEmpty(""));
        assertFalse(StringUtils.isNullOrEmpty("hello"));
    }

    @Test
    @DisplayName("joinWithComma skips nulls")
    void joinWithComma() {
        assertEquals("a, b, c", StringUtils.joinWithComma(Arrays.asList("a", null, "b", "c")));
        assertEquals("", StringUtils.joinWithComma(List.of()));
    }

    @Test
    @DisplayName("splitOnComma trims and omits empty strings")
    void splitOnComma() {
        assertEquals(List.of("a", "b", "c"), StringUtils.splitOnComma("a, b,, c ,"));
        assertEquals(List.of(), StringUtils.splitOnComma(null));
        assertEquals(List.of(), StringUtils.splitOnComma(""));
    }

    @Test
    @DisplayName("nullToEmpty converts null to empty string")
    void nullToEmpty() {
        assertEquals("", StringUtils.nullToEmpty(null));
        assertEquals("hi", StringUtils.nullToEmpty("hi"));
    }
}
