package com.org.skill.java;


import java.util.Arrays;

public class Anagram {

    public static boolean isAnagramV3(String text1, String text2) {

        if(text1 == null || text2 == null) {
            throw new IllegalArgumentException("Invalid argument");
        }
        if(text1.length() != text2.length()) {
            return false;
        }
        int NO_Of_CHARS = 256;
        int[] count1 = new int[NO_Of_CHARS];
        int[] count2 = new int[NO_Of_CHARS];
        Arrays.fill(count1, 0);
        Arrays.fill(count2, 0);

        for(int i = 0; i <= text1.length()-1 && i <= text2.length()-1 ; i++)
        {
            count1[text1.charAt(i)]++;
            count2[text2.charAt(i)]++;
        }
        for(int i = 0; i< NO_Of_CHARS; i++) {
            if(count1[i] != count2[i])
                return false;
        }
        return true;
    }

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
    /**
        Time Complexity: O(NLogN)
        Auxiliary space: O(1).
     */
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
