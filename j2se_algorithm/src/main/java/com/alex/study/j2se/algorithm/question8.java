package com.alex.study.j2se.algorithm;

public class question8 {
    static public int[] findMin (int[][] intArr) {
        int[] ints = new int[intArr.length];

        for (int x = 0; x < intArr.length; x++) {
            int min = intArr[x][0];

            for (int i = 1; i < intArr[x].length; i++) {
                if (intArr[x][i] < min) {
                    min = intArr[x][i];
                }
            }

            ints[x] = min;
        }

        return ints;
    }
}
