package com.alex.study.j2se.algorithm;

public class SortUtils {

    public static void insertSort() {
        int a [] = {6,8,2,4,1,6,3};
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }
}
