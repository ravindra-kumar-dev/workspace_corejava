package com.org.skill.java;

public class CreditCardValidation {

    /**
     Luhn check or the mod 10 check for credit card validation
     1.) A credit card’s number must have 13 to 16 digits
     2.) All the visa cards start from 4
     3.) All the master cards start from 5
     4.) 37 is the starting for American express cards
     5.) All the discover cards start from 6
     6.) Double and Sum of all even digit number (if sum is tow digit number then again sum it's digit and get single digit number)
     7.) Sum of all odd digit number
     8.) find the sum of number from result 6.) and 7.), if it's divisible by 10 then it's valid Credit card number else in valid
     */
    private static final int CREDIT_CARD_MIN_LENGTH = 13;
    private static final int CREDIT_CARD_MAX_LENGTH = 16;

    public static boolean isValidCreditCard(long creditCardNumber) {
        return (creditCardNumber > 0 &&
                getLength(creditCardNumber) >= CREDIT_CARD_MIN_LENGTH) &&
                (getLength(creditCardNumber) <= CREDIT_CARD_MAX_LENGTH) &&
                (isPrefixMatched(creditCardNumber, 4) ||
                 isPrefixMatched(creditCardNumber, 5) ||
                 isPrefixMatched(creditCardNumber, 37) ||
                 isPrefixMatched(creditCardNumber, 6)) &&
                ((getSumOfAllEvenIndexDigit(creditCardNumber) + getSumOfAllOddIndexDigit(creditCardNumber)) % 10 == 0);
    }

    private static int getSumOfAllEvenIndexDigit(long creditCardNumber) {
        int sum = 0;
        int length = getLength(creditCardNumber);
        String values = String.valueOf(creditCardNumber);
        for(int i = length-2; i>= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(String.valueOf(values.charAt(i))) * 2);
        }
        return sum;
    }

    private static int getDigit(int number) {
        if (number <= 9) {
            return number;
        } else {
            return number / 10 + number % 10;
        }
    }

    private static int getSumOfAllOddIndexDigit(long creditCardNumber) {
        int sum = 0;
        int length = getLength(creditCardNumber);
        String values = String.valueOf(creditCardNumber);
        for(int i = length-1; i>= 0; i -= 2) {
            sum += Integer.parseInt(String.valueOf(values.charAt(i)));
        }
        return sum;
    }

    private static int getLength(long creditCardNumber) {
        return String.valueOf(creditCardNumber).length();
    }

    private static boolean isPrefixMatched(long creditCardNumber, int initialNumber) {
        return getPrefix(creditCardNumber, getLength(initialNumber)) == initialNumber;
    }

    private static int getPrefix(long creditCardNumber, int length) {
        return Integer.parseInt(String.valueOf(creditCardNumber).substring(0, length));
    }
}
