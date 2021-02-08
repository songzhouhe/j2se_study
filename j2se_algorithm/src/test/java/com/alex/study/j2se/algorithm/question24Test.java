package com.alex.study.j2se.algorithm;

import java.util.Scanner;

public class question24Test {
    public static void main(String[] args) {
        // \24. 分解质因数
        // eg：输入 28
        // 输出 227

        System.out.println("请输入要分解的数");
        Scanner inputer = new Scanner(System.in);
        int num = inputer.nextInt();
        question24.findPrimeFactor(num);

    }
}
