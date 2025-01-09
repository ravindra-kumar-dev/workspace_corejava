package com.org.skill.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargestNumberAmongThreeTest {

    @Test
    public void testLargestAmongThree() {
        assertEquals(80000, LargestNumberAmongThree.largestAmongThree(2000, 6000, 80000));
        assertEquals(8, LargestNumberAmongThree.largestAmongThree(2, 6, 8));
        assertEquals(-2, LargestNumberAmongThree.largestAmongThree(-2, -6, -8));
        assertNotEquals(-6, LargestNumberAmongThree.largestAmongThree(-2, -6, -8));
    }

    @Test
    public void testLargestAmongThreeV2() {
        assertEquals(80000, LargestNumberAmongThree.largestAmongThreeV2(2000, 6000, 80000));
        assertEquals(8, LargestNumberAmongThree.largestAmongThreeV2(2, 6, 8));
        assertEquals(-2, LargestNumberAmongThree.largestAmongThreeV2(-2, -6, -8));
        assertNotEquals(-6, LargestNumberAmongThree.largestAmongThreeV2(-2, -6, -8));
    }

    @Test
    public void testLargestAmongThreeV3() {
        assertEquals(80000, LargestNumberAmongThree.largestAmongThreeV3(2000, 6000, 80000));
        assertEquals(8, LargestNumberAmongThree.largestAmongThreeV3(2, 6, 8));
        assertEquals(-2, LargestNumberAmongThree.largestAmongThreeV3(-2, -6, -8));
        assertEquals(0, LargestNumberAmongThree.largestAmongThreeV3(0, 0, 0));
        assertNotEquals(-6, LargestNumberAmongThree.largestAmongThreeV3(-2, -6, -8));
    }
}
