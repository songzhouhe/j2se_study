package com.alex.study.j2se.algorithm;

import java.util.Scanner;

public class question7Test {
    public static void main(String[] args) {
        // 7、要求实现方法public String addTwoBigNumber(String s1,string s2)
        // 大数相加，注意处理异常
        // public class Test{
        // public String addTwoBigNumber(String s1,string s2)
        // {
        // return "";
        // }
        // public static void main(String[] args)
        // {
        // Test test = new Test();
        // test.addTwoBigNumber("123456789","987654321")
        // }
        // }

        // range of int -2147483648 ~ 2147483647

        Scanner inputer = new Scanner(System.in);
        String number1 = inputer.nextLine();
        String number2 = inputer.nextLine();
        String sum = question7.add2BigNuxm(number1, number2);
        System.out.println(sum);

    }


}
