package com.org.skill.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RomanToIntegerTest {

    @Test
    public void testRomanToInteger() {
        assertEquals(6, RomanToInteger.romanToInteger("VI"));
        assertEquals(3, RomanToInteger.romanToInteger("III"));
        assertEquals(19, RomanToInteger.romanToInteger("XIX"));
        assertEquals(108, RomanToInteger.romanToInteger("CVIII"));
        assertNotEquals(1001, RomanToInteger.romanToInteger("M"));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testRomanToIntegerException() {
        RomanToInteger.romanToInteger(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRomanToIntegerEmpty() {
        RomanToInteger.romanToInteger("");
    }
}
