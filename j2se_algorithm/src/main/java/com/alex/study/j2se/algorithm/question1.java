package com.alex.study.j2se.algorithm;

public class question1 {

    static public String transferStr (String message) {
        StringBuilder result = new StringBuilder();

        for (int x = 0; x < message.length(); x++) {
            int chNum = message.charAt(x);
            if (chNum > 96 && chNum < 118) {
                result.append((char) (message.charAt(x) + 5));
            } else if (chNum > 117 && chNum < 123) {
                result.append((char) (message.charAt(x) - 21));
            } else {
                System.out.println("你输入的字符串包含非法字符");
                System.exit(0);
            }
        }

        return result.toString();
    }

}
