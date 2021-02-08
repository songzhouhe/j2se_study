package com.alex.study.j2se.algorithm;

public class question9 {
    static public String fingLongest (String message) {
        String[] words = message.split(" ");
        int longest = 0;

        for (int x = 1; x < words.length; x++) {
            if (words[x].length() > words[longest].length()) {
                longest = x;
            }
        }

        return words[longest];
    }
}
