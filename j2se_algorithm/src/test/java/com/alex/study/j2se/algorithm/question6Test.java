package com.alex.study.j2se.algorithm;

import java.util.Scanner;

public class question6Test {
    public static void main(String[] args) {

        // 6.手动输入一个字符串，仅限小写字母，统计并输出每个字符在字符串中出现的次数,并输出。提示(可以用Map)
        //实例：
        //输入：aaabbbccc
        //输出：a 3
        //? b 3
        //? c 3

        Scanner inputer = new Scanner(System.in);
        String message = inputer.nextLine();
        question6.letterCounter(message);


    }
}
