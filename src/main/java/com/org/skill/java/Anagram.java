package com.org.skill.java;


import java.util.Arrays;

public class Anagram {

    public static boolean isAnagramV2(String text1, String text2) {
        if(text1 == null || text2 == null) {
            throw new IllegalArgumentException("Invalid argument");
        }
        if(text1.length() != text2.length()) {
            return false;
        }
        char[] values1 = text1.toCharArray();
        for(char val: values1) {
            if(text2.indexOf(val) == -1)
                return false;
        }
        return true;
    }

    public static boolean isAnagram(String text1, String text2) {
        if(text1 == null || text2 == null) {
            throw new IllegalArgumentException("Invalid argument");
        }
        if(text1.length() != text2.length()) {
            return false;
        }
        char[] value1 = text1.toCharArray();
        char[] value2 = text2.toCharArray();

        Arrays.sort(value1);
        Arrays.sort(value2);
        for(int i = 0; i <= value1.length-1; i++) {
            if(value1[i] != value2[i])
                return false;
        }

        return true;
    }
}
