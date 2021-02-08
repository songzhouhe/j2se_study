package com.alex.study.j2se.algorithm;

import java.util.Scanner;

public class question28Test {
    public static void main(String[] args) {
        // \28. 输入一个身份证号码（15位和18位）和一个年份，计算现在的年龄（忽略非法参数）
        // eg：610618199001020065 2011
        // 输出：21

        Scanner inputer = new Scanner(System.in);
        System.out.println("请输入身份证号码");
        String id = inputer.nextLine();
        System.out.println("请输入年份");
        int year = inputer.nextInt();
        int age = question28.calcuAge(id, year);

        System.out.println("现在的年龄为：" + age);

    }

}
