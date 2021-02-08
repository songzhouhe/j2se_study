package com.alex.study.j2se.algorithm;

import java.util.Scanner;

public class question21Test {
    public static void main(String[] args) {
        // \21. 程序实现目标： 输入一个字符，将字符转换为小写，将其对应的ASCII值加5后，输出结果。
        // 程序要求：若其值加5后的字符值大于'z',将其转换成从a开始的字符。
        // 输入：‘A’
        // 输出：‘f’

        System.out.println("请输入要转换的字符");
        Scanner inputer = new Scanner(System.in);
        String input = inputer.nextLine();

        System.out.println("输出：" + question21.transferChar(input));
    }
}
