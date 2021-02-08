package com.alex.study.j2se.algorithm;

import java.util.Scanner;

public class question1Test {
    public static void main(String[] args) {
        // 1.程序实现目标： 输入一个字符串，将其各个字符对应的ASCII值加5后，输出结果。
        // 程序要求：该字符串只包含小写字母，若其值加5后的字符值大于'z',将其转换成从a开始的字符。

        Scanner inputer = new Scanner(System.in);
        String message  = inputer.nextLine();
        String transferred = question1.transferStr(message);
        System.out.println("结果：" + transferred);

    }
}
