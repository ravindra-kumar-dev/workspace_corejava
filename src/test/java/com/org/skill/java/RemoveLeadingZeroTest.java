package com.org.skill.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RemoveLeadingZeroTest {

    @Test
    public void testRemoveLeadingZeroV2() {
        assertEquals("456000", RemoveLeadingZero.removeLeadingZeroV2("456000"));
        assertEquals("456000", RemoveLeadingZero.removeLeadingZeroV2("00000456000"));
        assertEquals("40506000", RemoveLeadingZero.removeLeadingZeroV2("0000000040506000"));
        assertNotEquals("405", RemoveLeadingZero.removeLeadingZeroV2("00000000450"));
    }

    @Test
    public void testRemoveLeadingZero() {
        assertEquals("456000", RemoveLeadingZero.removeLeadingZero("456000"));
        assertEquals("456000", RemoveLeadingZero.removeLeadingZero("00000456000"));
        assertEquals("40506000", RemoveLeadingZero.removeLeadingZero("0000000040506000"));
        assertNotEquals("405", RemoveLeadingZero.removeLeadingZero("00000000450"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveLeadingZeroException() {
        RemoveLeadingZero.removeLeadingZero(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveLeadingZeroEmpty() {
        RemoveLeadingZero.removeLeadingZero("");
    }
}
