package com.alex.study.j2se.algorithm;

import java.util.Scanner;

public class question10Test {
    public static void main(String[] args) {
        // \10. 功能描述：将字符串中的字母全部替换成字母的下一个字母，
        // 要是最后一位是z或Z则替换为a或A。
        // 输入：aBxyZ
        // 输出：bCyzA

        System.out.println("请输入要转换的字符串");
        Scanner inputer = new Scanner(System.in);
        String message = inputer.nextLine();
        String transferred = question10.transferStr(message);
        System.out.printf(transferred);


    }
}
