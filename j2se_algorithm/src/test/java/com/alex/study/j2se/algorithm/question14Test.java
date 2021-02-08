package com.alex.study.j2se.algorithm;

import java.util.Scanner;

public class question14Test {
    public static void main(String[] args) {
        // \14. 功能描述：找出一个int[]中满足 2^n的数字，然后组成的新的数组
        // 输入：{4,3，8}
        // 输出：{4,8}

        Scanner inputer = new Scanner(System.in);
        String message = inputer.nextLine();

        String[] split = message.split(",");
        int[] twoIndex = question14.find2index(split);

        System.out.print("[");
        for (int x = 0; x < twoIndex.length - 1; x++) {
            System.out.print(twoIndex[x] + ", ");
        }

        System.out.println(twoIndex[twoIndex.length - 1] + "]");


    }
}
