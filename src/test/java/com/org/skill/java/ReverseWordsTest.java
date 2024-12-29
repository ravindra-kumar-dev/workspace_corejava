package com.org.skill.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ReverseWordsTest {

    @Test
    public void testReverseWordsV2NotSame() {
        assertNotEquals("I leave in bangalore", ReverseWords.reverseWordsV2("I leave in bangalore"));
    }

    @Test
    public void testReverseWordsV2() {
        assertEquals("ravindra am i", ReverseWords.reverseWordsV2("i am ravindra"));
        assertEquals("ravindra am i", ReverseWords.reverseWordsV2("  i  am  ravindra  "));
        assertEquals("ravindra", ReverseWords.reverseWordsV2("  ravindra  "));
    }

    @Test
    public void testReverseWordsNotSame() {
        assertNotEquals("I leave in bangalore", ReverseWords.reverseWords("I leave in bangalore"));
    }

    @Test
    public void testReverseWords() {
        assertEquals("ravindra am i", ReverseWords.reverseWords("i am ravindra"));
        assertEquals("ravindra am i", ReverseWords.reverseWords("  i  am  ravindra  "));
        assertEquals("ravindra", ReverseWords.reverseWords("  ravindra  "));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReverseWordsEmpty() {
        ReverseWords.reverseWords("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReverseWordsNull() {
        ReverseWords.reverseWords(null);
    }

}
