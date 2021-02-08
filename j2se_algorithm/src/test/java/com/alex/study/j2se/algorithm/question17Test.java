package com.alex.study.j2se.algorithm;

import java.util.Scanner;

public class question17Test {
    public static void main(String[] args) {
        // \17. 功能描述：对一个二进制数的每位进行0和1反转，求翻转后的二进制所对应的十进制
        // 输入：1010
        // 输出：5

        Scanner inputer = new Scanner(System.in);
        String bString = inputer.nextLine();
        int oct = question17.reverseNoct(bString);
        System.out.println("输出：" + oct);

    }
}
