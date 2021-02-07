package com.alex.study.j2se.algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class question3Test {
    public static void main(String[] args) {
        // 3、手动输入一个存储整数的数组，要求输出数组里面的2个最大值。
        // 实例：
        // ? 输入：1,2,5,9,84,3,2
        // ? 输出：84,9

        System.out.println("请按照‘1,2,5,9,84,3,2‘的格式输入数组元素，中间不要留空格");
        Scanner inputer = new Scanner(System.in);
        String elements = inputer.nextLine();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        String[] splitedElements = elements.split(",");
        for (String element : splitedElements) {
            try {
                numbers.add(Integer.parseInt(element));
            } catch (NumberFormatException e) {
                System.out.println("你输入的数组元素有误，程序终结");
                System.exit(0);
            }
        }

        question3.max2(numbers);
    }
}
