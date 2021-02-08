package com.alex.study.j2se.algorithm;

import java.util.Scanner;

public class question12Test {
    public static void main(String[] args) {
        // \12. 功能描述：已知：yi er san si wu liu qi ba jiu 分别对应123456789，
        // 对一段只含有这几种字符串的字符串进行转换，如：
        // 输入：yiersansan
        // 输出：1233
        // 要求实现方法：
        // public String trunNumber(String data)
        // {
        // TODO
        // return "";
        // }

        System.out.println("请输入字符串");
        Scanner inputer = new Scanner(System.in);
        String message = inputer.nextLine();
        String result = question12.pinyinToNum(message);

        System.out.println(result);
    }
}
