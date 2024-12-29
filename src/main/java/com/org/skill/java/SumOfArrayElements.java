package com.org.skill.java;

import com.org.skill.java.utils.ArithmeticUtil;

import java.util.List;
import java.util.stream.Collectors;

public class SumOfArrayElements {

    public static int sumOfArrayElementsV6(List<Integer> numbers) {
        if(numbers == null) {
            throw new IllegalArgumentException("Invalid inputs");
        }
        return numbers.stream().collect(Collectors.summingInt(Integer::intValue));
    }

    public static int sumOfArrayElementsV5(List<Integer> numbers) {
        if(numbers == null) {
            throw new IllegalArgumentException("Invalid inputs");
        }
        return numbers.stream().reduce(0, ArithmeticUtil::sum);
    }

    public static int sumOfArrayElementsV4(List<Integer> numbers) {
        if(numbers == null) {
            throw new IllegalArgumentException("Invalid inputs");
        }
        return numbers.stream().reduce(0, Integer::sum);
    }

    public static int sumOfArrayElementsV3(List<Integer> numbers) {
        if(numbers == null) {
            throw new IllegalArgumentException("Invalid inputs");
        }
        return numbers.stream().reduce(0, (a, b) -> a + b);
    }

    public static int sumOfArrayElementsV2(List<Integer> numbers) {
        if(numbers == null) {
            throw new IllegalArgumentException("Invalid inputs");
        }
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public static int sumOfArrayElements(List<Integer> numbers) {
        if(numbers == null) {
            throw new IllegalArgumentException("Invalid Argument");
        }
        int sum = 0;
        for(Integer number : numbers){
            sum = sum + number;
        }
        return sum;
    }
}
