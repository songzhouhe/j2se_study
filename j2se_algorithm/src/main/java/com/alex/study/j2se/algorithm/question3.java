package com.alex.study.j2se.algorithm;

import java.util.ArrayList;
import java.util.Comparator;

public class question3 {
    public static void max2 (ArrayList<Integer> numberArr) {
        numberArr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num2 - num1;
            }
        });

        System.out.println("数组中的2个最大值为：" + numberArr.get(0) + " & " + numberArr.get(1));
    }
}
