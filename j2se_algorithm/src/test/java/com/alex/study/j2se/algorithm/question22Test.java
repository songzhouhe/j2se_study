package com.alex.study.j2se.algorithm;

public class question22Test {
    public static void main(String[] args) {
        // \22. 要求：将一个二维数组进行逆序，逆序后所有的元素行列不定，进行随机排列
        // ①先把数组每一行逆序
        // ②再把逆序后每一行进行随机排列
        // 如：{{4,3,32,5},{1,2,3,4},{9,6,5,4}};
        // ?4 6 5 9 　3 4 2 1 　5 4 32 3

        int[][] intArr = {{4,3,32,5},{1,2,3,4},{9,6,5,4}};
        int firstLength = intArr.length;
        int[][] intArrProcessed = new int[firstLength][];

        for (int x = 0; x < firstLength; x++) {
            intArrProcessed[x] = question22.shuffleArr(intArr[firstLength - 1 - x]);
        }

        for (int x = 0; x < firstLength; x++) {
            for (int i = 0; i < intArrProcessed[x].length; i++) {
                System.out.print(intArrProcessed[x][i] + " ");
            }
            System.out.print(" ");
        }

    }
}
