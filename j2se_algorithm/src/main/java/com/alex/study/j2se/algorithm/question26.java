package com.alex.study.j2se.algorithm;

public class question26 {
    static public int[][] reverser2Dim (int[][] ints) {
        int[][] reverseArr = new int[ints[0].length][ints.length];

        for (int x = 0; x < reverseArr.length; x++) {
            for (int i = 0; i < reverseArr[x].length; i++) {
                reverseArr[x][i] = ints[i][x];
            }
        }

        return reverseArr;

    }
}
