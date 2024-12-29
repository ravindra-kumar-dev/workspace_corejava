package com.org.skill.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfNumbersFromStringTest {

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
