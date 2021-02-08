package com.alex.study.j2se.algorithm;

import static com.alex.study.j2se.algorithm.question8.findMin;

public class question8Test {
    public static void main(String[] args) {
        // 8、比较二维数组列最小值，组成一个新数组返回。(实现核心算法，不需要使用IO)
        // 输入：intArr = {{5,6,1,16},{7,3,9}}
        // 输出：intArrs ={1,3}

        int[][] intArr = {{5,6,1,16},{7,3,9}};
        int[] minInt = findMin(intArr);

        System.out.println("该二维数组中的最小值为");
        for (int min : minInt) {
            System.out.print(min + " ");
        }

    }
}
