package com.alex.study.j2se.algorithm;

public class question4 {
    public static boolean isPalindrome (String strIn) {
        int len = strIn.length();

        for (int x = 0; x < len/2; x++) {
            if (strIn.charAt(x) != strIn.charAt(len - x - 1)) {
                return false;
            }
        }
        return true;
    }
}
