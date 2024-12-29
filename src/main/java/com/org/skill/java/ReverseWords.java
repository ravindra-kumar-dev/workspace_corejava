package com.org.skill.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ReverseWords {

    public static String reverseWordsV2(String text) {
        if(text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Invalid input");
        }
        Stack<String> stack = new Stack<>();
        StringBuilder word = new StringBuilder();
        for(int i = 0; i < text.length() ; i++) {
            if(!Character.isWhitespace(text.charAt(i))) {
                word.append(text.charAt(i));
            }

            else if(word.length() > 0) {
                stack.push(word.toString());
                word.setLength(0);
            }
        }
        if(word.length() > 0) {
            stack.push(word.toString());
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if(!stack.isEmpty()) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static String reverseWords(String text) {
        if(text == null || text.length() == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        String[] values = text.split(" ");
        List<String> words = new ArrayList<>();
        for(String val : values){
            if(!val.isEmpty()){
                words.add(val);
            }
        }
        Collections.reverse(words);
        return String.join(" ",words);
    }
}
