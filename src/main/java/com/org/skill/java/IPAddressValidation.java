package com.org.skill.java;

import java.util.StringTokenizer;

public class IPAddressValidation {

    public static boolean validateIPAddress(String ipAddress) {
        if(ipAddress == null || ipAddress.isEmpty()) {
            throw new IllegalArgumentException("Invalid Value");
        }
        int dots = 0, count = 0, length = ipAddress.length();
        for(int i = 0; i < length ; i++) {
            if(ipAddress.charAt(i) == '.')
                count++;
        }
        if(count != 3) {
            return false;
        }

        StringTokenizer st = new StringTokenizer(ipAddress, ".");
        while (st.hasMoreElements()) {
            String ipValue = st.nextToken();
            if(validateIPValue(ipValue)) {
                if(st.hasMoreTokens()) {
                    dots++;
                }
            } else {
                return false;
            }
        }
        if(dots != 3)
            return false;
        return true;
    }

    private  static boolean validateIPValue(String ipValue) {
        if(ipValue.isEmpty())
            return false;
        if(!ipValue.matches("\\d+"))
            return false;
        int length = ipValue.length();
        if(length > 3)
            return false;
        if(ipValue.indexOf('0') == 0 && length > 1)
            return false;
        try {
            int value = Integer.parseInt(ipValue);
            return (value >= 0 && value <= 255);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return false;
        }
    }
}
