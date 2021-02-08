package com.alex.study.j2se.algorithm;

public class question27 {

    static public String allIntRear (String message) {
        StringBuilder charStr = new StringBuilder();
        StringBuilder intStr = new StringBuilder();

        for (int x = 0; x < message.length(); x++) {
            int chNum = message.charAt(x);
            if (chNum > 47 && chNum < 58) {
                intStr.append(message.charAt(x));
            } else {
                charStr.append(message.charAt(x));
            }
        }

        return charStr.append(intStr).toString();
    }


}
