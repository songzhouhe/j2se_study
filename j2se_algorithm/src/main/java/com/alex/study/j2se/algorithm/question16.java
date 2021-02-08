package com.alex.study.j2se.algorithm;

public class question16 {
    static public int[] count1n0 (int number) {
        String bString = Integer.toBinaryString(number);
        int zeroNum = 0;
        int oneNum = 0;

        for (int x = 0; x < bString.length(); x++) {
            if (bString.charAt(x) == '0') {
                zeroNum ++;
            }else {
                oneNum ++;
            }
        }

        int[] oneNzero = {zeroNum, oneNum};
        return oneNzero;
    }
}
