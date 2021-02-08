package com.alex.study.j2se.algorithm;

import java.util.Scanner;

import static com.alex.study.j2se.algorithm.question4.isPalindrome;

public class question4Test {
    public static void main(String[] args) {
        // 4、回文数字判断。
        //题目描述：
        //有这样一类数字，他们顺着看和倒着看是相同的数，例如：121,656,2332等，这样的数字就称为：回文数字。编写一个函数，判断某数字是否是回文数字。
        //要求实现方法：
        //public String isPalindrome(String strIn);
        //【输入】strIn: 整数，以字符串表示；
        //【返回】true: 是回文数字；
        //? false: 不是回文数字；
        //【注意】只需要完成该函数功能算法，中间不需要有任何IO的输入输出

        Scanner inputer = new Scanner(System.in);
        System.out.println("请输入任意整数");

        if (isPalindrome(inputer.nextLine())) {
            System.out.println("是回文数字");
        } else {
            System.out.println("不是回文数字");
        }
    }
}
