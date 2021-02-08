package com.alex.study.j2se.algorithm;

import java.util.Scanner;

public class question16Test {
    public static void main(String[] args) {
        // \16. 功能描述：统计一个数字转为二进制后，0和1的个数，组成数组返回
        // 输入：6
        // 输出：{1,2}

        System.out.println("请输入要转换的数字");
        Scanner inputer = new Scanner(System.in);
        int num = inputer.nextInt();
        int[] oneNzero = question16.count1n0(num);

        System.out.println("number of zero " + oneNzero[0]);
        System.out.println("number of one " + oneNzero[1]);

    }
}
