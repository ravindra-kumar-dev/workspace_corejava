package com.org.skill.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfNumbersFromStringTest {

    @Test
    public void testSumfOfNumbersFromStringV2NotSame() {
        assertNotEquals(10, SumOfNumbersFromString.sumOfNumbersFromStringV2("Item1 3, item2 7"));
    }

    @Test
    public void testSumOfNumbersFromStringV2() {
        assertEquals(10, SumOfNumbersFromString.sumOfNumbersFromStringV2("Item1 3 Item2 5 Item3 2"));
    }

    @Test
    public void testSumOfNumbersFromString() {
        assertEquals(5, SumOfNumbersFromString.sumOfNumbersFromString("order1 4 order2 1"));
    }

    @Test
    public void testSumOfNumbersFromStringEmpty() {
        assertEquals(0, SumOfNumbersFromString.sumOfNumbersFromString(""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSumOfNumbersFromStringNull() {
        SumOfNumbersFromString.sumOfNumbersFromString(null);
    }
}
