package com.org.skill.java;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CreditCardValidationTest {

    @Test
    public void testIsValidCreditCardLengthCheck() {
        assertFalse(CreditCardValidation.isValidCreditCard(67876534365432564l));
        assertFalse(CreditCardValidation.isValidCreditCard(-91960l));
    }

    @Test
    public void testIsValidCreditCardPositive() {
        assertFalse(CreditCardValidation.isValidCreditCard(-5196081888500645l));
        assertTrue(CreditCardValidation.isValidCreditCard(5196081888500645l));
    }

    @Test
    public void testIsValidCreditCardPrefix() {
        assertFalse(CreditCardValidation.isValidCreditCard(8196081888500645l));
        assertFalse(CreditCardValidation.isValidCreditCard(9196081888500645l));
        assertFalse(CreditCardValidation.isValidCreditCard(3196081888500645l));
        assertFalse(CreditCardValidation.isValidCreditCard(2196081888500645l));
        assertFalse(CreditCardValidation.isValidCreditCard(1196081888500645l));
    }

    @Test
    public void testIsValidCreditCard() {
        assertFalse(CreditCardValidation.isValidCreditCard(9196081888500645l));
        assertFalse(CreditCardValidation.isValidCreditCard(9155476571213186350l));
        assertTrue(CreditCardValidation.isValidCreditCard(5196081888500645l));
    }
}
