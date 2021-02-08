package com.alex.study.j2se.algorithm;

public class question7 {
    static public String add2BigNuxm(String number1, String number2) {
        long long1 = 0;
        long long2 = 0;

        try {
            long1 = Long.parseLong(number1);
            long2 = Long.parseLong(number2);
        } catch (NumberFormatException e) {
            System.out.println("你输入的数据不符合要求");
            System.exit(0);
        }

        String sum = String.valueOf(long1 + long2);

        return sum;
    }
}
