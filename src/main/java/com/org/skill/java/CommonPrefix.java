package com.org.skill.java;

import java.util.Arrays;

public class CommonPrefix {

    public static String findLongestCommonPrefixV2(String[] words){
        if(words == null || words.length == 0) {
            throw new IllegalArgumentException("Inappropriate input values");
        }
        String resource = words[0];
        for(int i = 1; i < words.length; i++){
            int len = getCommonPrefixLength(resource, words[i]);
            resource = resource.substring(0, len);
        }
        return resource;
    }

    private static int getCommonPrefixLength(String word1, String word2) {
        int minLength = Math.min(word1.length(), word2.length());
        int index = 0;
        while(index < minLength && word1.charAt(index) == word2.charAt(index)){
            index++;
        }
        return index;
    }

    public static String findLongestCommonPrefix(String[] words){
        if(words == null || words.length == 0) {
            throw new IllegalArgumentException("Inappropriate input values");
        }
        Arrays.sort(words);
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        int minLength = Math.min(firstWord.length(), lastWord.length());
        int index = 0;
        while(index < minLength && firstWord.charAt(index) == lastWord.charAt(index)){
            index++;
        }
        return firstWord.substring(0,index);
    }
}
