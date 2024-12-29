package com.org.skill.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CommonPrefixTest {

    @Test
    public void testFindLongestCommonPrefixV2() {
        String[] values = {"Ramesh","Rajdeep","Ravindra"};
        assertEquals("Ra", CommonPrefix.findLongestCommonPrefixV2(values));
        assertEquals("India", CommonPrefix.findLongestCommonPrefixV2(new String[]{"India", "Indiana"}));
        assertEquals("", CommonPrefix.findLongestCommonPrefixV2(new String[]{"India", "West Indies"}));
        assertNotEquals("Geeta", CommonPrefix.findLongestCommonPrefixV2(new String[]{"Geeta", "Geeta Pandit","Sita"}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindLongestCommonPrefixV2Null() {
        CommonPrefix.findLongestCommonPrefixV2(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindLongestCommonPrefixV2Empty() {
        CommonPrefix.findLongestCommonPrefixV2(new String[0]);
    }

    @Test
    public void testFindLongestCommonPrefix() {
        String[] values = {"Ramesh","Rajdeep","Ravindra"};
        assertEquals("Ra", CommonPrefix.findLongestCommonPrefix(values));
        assertEquals("India", CommonPrefix.findLongestCommonPrefix(new String[]{"India", "Indiana"}));
        assertEquals("", CommonPrefix.findLongestCommonPrefix(new String[]{"India", "West Indies"}));
        assertNotEquals("Geeta", CommonPrefix.findLongestCommonPrefix(new String[]{"Geeta", "Geeta Pandit","Sita"}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindLongestCommonPrefixNull() {
        CommonPrefix.findLongestCommonPrefix(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindLongestCommonPrefixEmpty() {
        CommonPrefix.findLongestCommonPrefix(new String[0]);
    }
}
