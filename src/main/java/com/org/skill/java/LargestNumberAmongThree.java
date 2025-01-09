package com.org.skill.java;

public class LargestNumberAmongThree {

    public static int largestAmongThree(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3)
            return num1;
        else if ( num2 > num3)
            return num2;
        return num3;
    }

    public static int largestAmongThreeV2(int num1, int num2, int num3) {
        return (num1 > num2 && num1 > num3) ? num1 : (num2 > num3 ? num2 : num3);
    }

    public static int largestAmongThreeV3(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
}
