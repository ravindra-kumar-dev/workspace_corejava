package com.org.skill.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void testIsAnagramV2() {
        assertTrue(Anagram.isAnagramV2("listen", "silent"));
    }

    @Test
    public void testIsAnagramV2False() {
        assertFalse(Anagram.isAnagramV2("Ravindra", "Rajiv"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsAnagramV2NullEmpty() {
        Anagram.isAnagramV2(null,  "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsAnagramV2NullNull() {
        Anagram.isAnagramV2(null,  null);
    }

    @Test
    public void testIsAnagram() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
    }

    @Test
    public void testIsAnagramFalse() {
        assertFalse(Anagram.isAnagram("Ravindra", "Rajiv"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsAnagramNullEmpty() {
        Anagram.isAnagram(null,  "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsAnagramNullNull() {
        Anagram.isAnagram(null,  null);
    }

}
