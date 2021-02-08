package com.alex.study.j2se.algorithm;

import java.util.Scanner;

import static com.alex.study.j2se.algorithm.question11.checkString;

public class question11Test {
    public static void main(String[] args) {
        // \11. 功能描述：判断一个字符串中是否只含有相同的子字符串（子串长度>=2）
        // 输入：abab
        // 返回：true
        // 输入：abcd
        // 返回：false
        // 要求实现方法：
        // public boolean checkString(String data)
        // {
        // TODO
        // return false;
        // }

        System.out.println("请输入要检查的字符串");
        Scanner inputer = new Scanner(System.in);
        String message = inputer.nextLine();
        System.out.println("结果为：" + checkString(message));

    }

}
