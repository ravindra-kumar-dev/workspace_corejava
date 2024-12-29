package com.org.skill.java;

import java.util.Arrays;

public class SumOfNumbersFromString {

    public static int sumOfNumbersFromString(String text) {
        if(text == null) {
            throw new IllegalArgumentException("Invalid input");
        }
        Integer sum = Arrays.asList(text.split(" ")).stream().
                filter((value) -> value.matches("\\d+")).
                mapToInt(Integer::valueOf).sum();
        return sum;
    }
}
