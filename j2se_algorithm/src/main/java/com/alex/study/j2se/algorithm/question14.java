package com.alex.study.j2se.algorithm;

import java.util.ArrayList;

public class question14 {

    static public int[] find2index (String[] numbers) {
        ArrayList<Integer> twoindex = new ArrayList<>();

        for (int x = 0; x < numbers.length; x++) {
            int num = Integer.parseInt(numbers[x]);
            double logs = Math.log(num) / Math.log(2);

            if (((int) logs - logs) == 0) {
                twoindex.add(num);
            }
        }

        int[] result = new int[twoindex.size()];
        int counter = 0;
        for (int number : twoindex) {
            result[counter] = number;
            counter++;
        }

        return result;

    }

}
