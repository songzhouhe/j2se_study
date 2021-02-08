package com.alex.study.j2se.algorithm;

public class question29 {

    static public String transferStr (String message) {

        for (int x = 0; x < message.length(); x++) {
            int chNum = message.charAt(x);
            if (chNum > 96 && chNum < 118) {
                message = message.replaceAll(message.substring(x, x + 1), String.valueOf((char) (chNum - 27)));
            } else if (chNum > 117 && chNum < 123) {
                message = message.replaceAll(message.substring(x, x + 1), String.valueOf((char) (chNum - 53)));
            }
        }

        return message;
    }
}
