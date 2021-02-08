package com.alex.study.j2se.algorithm;

public class question26Test {
    public static void main(String[] args) {
        // \26. 二维数组转置
        // 例：1 2 3
        // 4 5 6
        // 转置
        // 1 4
        // 2 5
        // 3 6

        int[][] ints = {{1, 2, 3, 12}, {4, 5, 6, 22}, {7, 8, 9, 10}};
        int[][] reverseArr = question26.reverser2Dim(ints);

        for (int x = 0; x < reverseArr.length; x++) {
            for (int i = 0; i < reverseArr[x].length; i++) {
                System.out.print(reverseArr[x][i] + " ");
            }
            System.out.println();
        }

    }
}
