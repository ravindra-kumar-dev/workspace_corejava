package com.org.skill.java;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class SumOfArrayElementsTest {

    @Test
    public void testSumOfArrayElements() {
        assertEquals(12, SumOfArrayElements.sumOfArrayElements(Arrays.asList(2,4,6)));
        assertNotSame(15, SumOfArrayElements.sumOfArrayElements(Arrays.asList(2,4,6)));
    }

    @Test
    public void testSumOfArrayElementsV2() {
        assertEquals(12, SumOfArrayElements.sumOfArrayElementsV2(Arrays.asList(2,4,6)));
        assertNotSame(15, SumOfArrayElements.sumOfArrayElementsV2(Arrays.asList(2,4,6)));
    }

    @Test
    public void testSumOfArrayElementsV3() {
        assertEquals(12, SumOfArrayElements.sumOfArrayElementsV3(Arrays.asList(2,4,6)));
        assertNotSame(15, SumOfArrayElements.sumOfArrayElementsV3(Arrays.asList(2,4,6)));
    }

    @Test
    public void testSumOfArrayElementsV4() {
        assertEquals(12, SumOfArrayElements.sumOfArrayElementsV4(Arrays.asList(2,4,6)));
        assertNotSame(15, SumOfArrayElements.sumOfArrayElementsV4(Arrays.asList(2,4,6)));
    }

    @Test
    public void testSumOfArrayElementsV5() {
        assertEquals(21, SumOfArrayElements.sumOfArrayElementsV5(Arrays.asList(2,4,6,9)));
        assertNotSame(15, SumOfArrayElements.sumOfArrayElementsV5(Arrays.asList(2,4,6)));
    }


    @Test
    public void testSumOfArrayElementsV6() {
        assertEquals(21, SumOfArrayElements.sumOfArrayElementsV6(Arrays.asList(2,4,6,9)));
        assertNotSame(15, SumOfArrayElements.sumOfArrayElementsV6(Arrays.asList(2,4,6)));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSumOfArrayElementsNull() {
        SumOfArrayElements.sumOfArrayElementsV2(null);
    }

}
