package com.alex.study.j2se.algorithm;

import java.util.Random;

public class question5Test {
    public static void main(String[] args) {
        // 5、要求：随机打印50个随机（4-10长度）的字符串，要求字符串包含的范围是所有的英文字母包含大小写和数字，
        // 按照编码顺序排序，每行打印4个，要求首字符对齐

        Random generator = new Random();

        for (int x = 0; x < 50; x++) {
            int len = generator.nextInt(6) + 4;
            StringBuilder message = new StringBuilder();

            for (int i = 0; i < len; i++) {
                int randomChar = generator.nextInt(61);
                if (randomChar < 10) {
                    message.append((char)(randomChar + 48));
                } else if (randomChar > 35) {
                    message.append((char)(randomChar + 61));
                } else {
                    message.append((char)(randomChar + 55));
                }
            }

            if ((x + 1) % 4 == 0) {
                System.out.println(message);
            } else {
                System.out.print(message + " ");
            }
        }
    }
}
