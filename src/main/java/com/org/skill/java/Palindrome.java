package com.org.skill.java;

public class Palindrome {

    public static boolean isPalindromeV3(String word) {
        StringBuilder sb = new StringBuilder(word);
        return sb.reverse().toString().equalsIgnoreCase(word);
    }

    public static boolean isPalindromeV2(String word) {
        StringBuilder sb = new StringBuilder();
        for(int i = word.length()-1; i >=0; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString().equalsIgnoreCase(word);
    }

    public static boolean isPalindrome(String word) {
        if(word == null || word.length() == 0) {
            throw new IllegalArgumentException("Not Valid argument");
        }
        char[] charArrays = word.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = charArrays.length-1; i >= 0; i--) {
            sb.append(charArrays[i]);
        }
        return sb.toString().equalsIgnoreCase(word);
    }

}
