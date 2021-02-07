package com.alex.study.j2se.algorithm;

public class question2 {
    // 2.程序实现目标：求一个整型数组中元素的平均值，并统计其中大于和小于此平均值的元素的个数。
    // 程序要求：输入：整型数组中的元素个数及各个元素。
    // ? 输出：整型数组中元素的平均值，大于和小于此平均值的元素的个数。

    public static void aab (int[] numberArr) {
        // average, above and below

        int sum = 0;
        for (int number : numberArr) {
            sum += number;
        }

        double average = sum / numberArr.length;
        int smallNumber = 0;
        int largeNunber = 0;

        for (int number : numberArr) {
            if (number > average) {
                largeNunber++;
            } else if (number < average) {
                smallNumber++;
            }
        }

        System.out.println("数组中的平均值为：" + (int) average + "；大于此平均值的元素个数为" + largeNunber + "；小于此平均值的元素个数为" + smallNumber);
    }

}
