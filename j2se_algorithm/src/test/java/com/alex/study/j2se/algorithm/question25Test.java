package com.alex.study.j2se.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class question25Test {
    public static void main(String[] args) {
        // 25.n个长度的字符串中取m个长度的组合

        Scanner inputer = new Scanner(System.in);
        System.out.println("请输入目标字符串");
        String message = inputer.nextLine();
        System.out.println("请输入长度m");
        int targetLength = inputer.nextInt();

        if (targetLength > message.length()) {
            System.out.println("你输入的字符串长度和m不符要求");
            System.exit(0);
        }

        ArrayList<String> subString = question25.allSub(message, targetLength);

        for (String sub : subString) {
            System.out.println(sub);
        }

    }
}
