package com.alex.study.j2se.algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class question22 {
    static public int[] shuffleArr (int[] intArr) {
        int arrLength = intArr.length;
        ArrayList<Integer> order = new ArrayList<Integer>();
        int[] shuffledArr = new int[arrLength];

        for (int x = 0; x < intArr.length; x++) {
            order.add(x);
        }

        Collections.shuffle(order);

        for (int x = 0; x < arrLength; x++) {
            shuffledArr[x] = intArr[order.get(x)];
        }

        return shuffledArr;
    }
}
