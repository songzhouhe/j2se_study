package com.alex.study.j2se.algorithm;

import java.util.Scanner;

public class question13Test {
    public static void main(String[] args) {
        // 13. 功能描述：删除字符串中字符个数最少的字符，最少字符串有多个，最少的要全部删除
        // ? 然后返回该子字符串。
        // 输入：asdasdas
        // 输出：asasas

        System.out.println("请输入要进行删除的字符串");
        Scanner inputer = new Scanner(System.in);
        String message = inputer.nextLine();
        String afterDelete = question13.deleteLeast(message);
        System.out.println("经过删除之后的字符串为：" + afterDelete);


    }
}
