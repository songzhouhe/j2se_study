package com.alex.study.j2se.algorithm;

import java.util.ArrayList;

public class question24 {
    static public void findPrimeFactor (int number) {
        ArrayList<Integer> primes = new ArrayList<>();
        System.out.print(number);

        for (int x = 2; x < number + 1; x++) {
            if (number % x == 0) {
                primes.add(x);
                number /= x;
                x--;
            }
        }

        if (primes.size() == 1) {
            System.out.print("是质数");
        } else {
            System.out.print("不是质数，其质因数有：");
            for (Integer prime : primes) {
                System.out.print(prime + " ");
            }
        }
    }
}
