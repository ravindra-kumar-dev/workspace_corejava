package com.org.skill.java;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordContainsVowelsTest {

    @Test
    public void testIsVowelPresents() {
        assertTrue(WordContainsVowels.isVowelPresents("teacher"));
        assertFalse(WordContainsVowels.isVowelPresents("Crypt"));
        assertFalse(WordContainsVowels.isVowelPresents("Fly"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsVowelPresentsException() {
        WordContainsVowels.isVowelPresents(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsVowelPresentsEmpty() {
        WordContainsVowels.isVowelPresents("");
    }

}
