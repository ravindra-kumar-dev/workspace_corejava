package com.org.skill.java;

public class RomanToInteger {

    public static int romanToInteger(String roman) {
        if(roman == null || roman.isEmpty()) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int result = 0;
        for(int i = 0; i < roman.length(); i++) {
            int value = value(roman.charAt(i));
            if(i+1 < roman.length()) {
                int nextValue = value(roman.charAt(i + 1));
                if(value >= nextValue) {
                    result = result + value;
                } else {
                    result = result + (nextValue - value);
                    i++;
                }
            } else {
                result = result + value;
            }
        }
        return result;
    }

    private static int value(char r) {
        if(r == 'I')
            return 1;
        if(r == 'V')
            return 5;
        if(r == 'X')
            return 10;
        if(r == 'L')
            return 50;
        if(r == 'C')
            return 100;
        if(r == 'D')
            return 500;
        if(r == 'M')
            return 1000;
        return -1;
    }
}
