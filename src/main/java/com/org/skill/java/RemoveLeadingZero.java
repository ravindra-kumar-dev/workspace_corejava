package com.org.skill.java;

public class RemoveLeadingZero {


    public static String removeLeadingZeroV2(String value) {
         try {
            return Integer.valueOf(value).toString();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
        return "";
    }

    public static String removeLeadingZero(String value) {
        if(value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Invalid input");
        }
        int index = 0;
        while(index < value.length() && value.charAt(index) == '0') {
            index++;
        }
        return value.substring(index, value.length());
    }
}
