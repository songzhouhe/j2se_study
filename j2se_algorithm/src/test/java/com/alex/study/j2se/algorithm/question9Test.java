package com.alex.study.j2se.algorithm;

import java.util.Scanner;

public class question9Test {
    public static void main(String[] args) {
        // 输入：a aa,cat tiger.123dd
        // 输出： tiger
        // 功能描述：键盘输入一句话
        // ? 输出一句话中最常的单词，如果最长的出现多次，返回第一个。
        // ? 这句话只包含数字字母和标点。

        Scanner inputer = new Scanner(System.in);
        String message = inputer.nextLine();
        String longest = question9.fingLongest(message);
        System.out.println("The longest word in the sentence is " + longest);

    }
}
