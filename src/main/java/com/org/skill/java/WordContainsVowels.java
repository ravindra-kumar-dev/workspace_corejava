package com.org.skill.java;

public class WordContainsVowels {

    public static void main(String[] args) {
        System.out.println(isVowelPresents("Hello"));
    }

    public static boolean isVowelPresents(String words) {
        if(words == null || words.isEmpty()) {
            throw new IllegalArgumentException("Inappropriate input");
        }
       return words.toLowerCase().matches(".*[aeiou].*");
    }
}
