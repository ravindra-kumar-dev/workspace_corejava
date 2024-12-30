package com.org.skill.java;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IPAddressValidationTest {

    @Test
    public void testValidateIPAddress() {
        assertTrue(IPAddressValidation.validateIPAddress("123.211.125.255"));
        assertTrue(IPAddressValidation.validateIPAddress("192.168.98.102"));
        assertFalse(IPAddressValidation.validateIPAddress("192.08.68.102"));
        assertFalse(IPAddressValidation.validateIPAddress("1c2.08.68.102"));
        assertFalse(IPAddressValidation.validateIPAddress("1...102"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateIPAddressException() {
        IPAddressValidation.validateIPAddress(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValidateIPAddressEmpty() {
        IPAddressValidation.validateIPAddress("");
    }
}
