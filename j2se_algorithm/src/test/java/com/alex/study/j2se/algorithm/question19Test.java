package com.alex.study.j2se.algorithm;

import java.util.ArrayList;
import java.util.Scanner;

import static com.alex.study.j2se.algorithm.question19.findSub;

public class question19Test {
    // \19. 功能描述：查找一个字符串的子字符串集
    // 输入：abab
    // 输出：a b ab ba aba bab
    // 要求实现方法：
    // public List getChildren(String data)
    // {
    // List list = new ArrayList();
    // TODO
    // return list;
    // }

    public static void main(String[] args) {

        System.out.println("请输入字符串对象");
        Scanner inputer = new Scanner(System.in);
        String message = inputer.nextLine();
        ArrayList<String> subStrings = findSub(message);

        System.out.println("该字符串的所有子字符串有：");
        for (String substring : subStrings) {
            System.out.println(substring);
        }
    }


}
