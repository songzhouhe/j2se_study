package com.alex.study.j2se.algorithm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class question2Test {
    public static void main(String[] args) {
        // 2.程序实现目标：求一个整型数组中元素的平均值，并统计其中大于和小于此平均值的元素的个数。
        // 程序要求：输入：整型数组中的元素个数及各个元素。
        // ? 输出：整型数组中元素的平均值，大于和小于此平均值的元素的个数。


        Scanner inputer = new Scanner(System.in);
        System.out.println("请输入数组元素个数");
        int arrayLength = 0;

        try {
            arrayLength = inputer.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("你输入的数据有误，程序终结");
            System.exit(0);
        }

        int[] numbers = new int[arrayLength];
        System.out.println("请输入数组元素，输入除整数之外元素则视为输入完成，其余数组元素默认为0");

        for (int x = 0; x < arrayLength; x++) {
            try {
                numbers[x] = inputer.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("你所输入的数据有误");
            }
        }

        question2.aab(numbers);
    }
}
