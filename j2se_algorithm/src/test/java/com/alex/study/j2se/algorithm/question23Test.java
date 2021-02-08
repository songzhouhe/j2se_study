package com.alex.study.j2se.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class question23Test {
    public static void main(String[] args) {
        // \23. 根据输入m数据，找出str的m个字符的所有字符串
        // 例如"abc" m=2
        // "ab" "ac" "bc"
        // "abcd" m=3
        // "abc" "acd" "bcd" "abd"
        // public ArrayList perenum(String str,int m)
        // {
        // return null;
        // }

        Scanner inputer = new Scanner(System.in);
        System.out.println("请输入字符串");
        String message = inputer.nextLine();
        System.out.println("请输入长度m");
        int targetLength = inputer.nextInt();

        if (targetLength > message.length()) {
            System.out.println("你输入的字符串长度和m不符要求");
            System.exit(0);
        }

        ArrayList<String> shortenStr = question23.allOrderSub(message, targetLength);
        for (String shorted : shortenStr) {
            System.out.println(shorted);
        }
    }

}
