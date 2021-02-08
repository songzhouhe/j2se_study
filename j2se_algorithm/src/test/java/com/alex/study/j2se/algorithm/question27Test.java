package com.alex.study.j2se.algorithm;

import java.util.Scanner;

import static com.alex.study.j2se.algorithm.question27.allIntRear;

public class question27Test {
    public static void main(String[] args) {
        // \27. 功能描述：输入字符串，将该字符串中数字放到非数字的后面，并保持原有顺序不变。
        // 例如：h3a2p0p1y----------happy3201
        // public String childStr(String inputStr){
        // }

        Scanner inputer = new Scanner(System.in);
        String message = inputer.nextLine();

        String strTransferred = allIntRear(message);
        System.out.println(strTransferred);

    }
}
