package com.org.skill.java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfNumbersFromString {

    public static int sumOfNumbersFromStringV2(String text) {
        if(text == null) {
            throw new IllegalArgumentException("Invalid input");
        }
        return Arrays.asList(text.split(" ")).stream().
                filter((value) -> value.matches("\\d+")).
                collect(Collectors.summingInt(Integer::valueOf));
    }

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
