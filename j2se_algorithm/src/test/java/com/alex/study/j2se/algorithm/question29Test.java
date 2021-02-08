package com.alex.study.j2se.algorithm;

import java.util.Scanner;

public class question29Test {
    public static void main(String[] args) {
        // \29. 输入一个字符串，如果是小写则转换成相应的大写字母的后五位，如果是VWXYZ则转换成abcde,其他的都不变，
        // 例如：“aDsR154+-/.”则应该输出为“FDXR154+-/.”

        Scanner inputer = new Scanner(System.in);
        String message = inputer.nextLine();
        String transferred = question29.transferStr(message);

        System.out.println(transferred);

    }
}
