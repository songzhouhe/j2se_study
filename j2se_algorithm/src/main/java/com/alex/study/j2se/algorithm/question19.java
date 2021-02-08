package com.alex.study.j2se.algorithm;

import java.util.ArrayList;

public class question19 {
    static public ArrayList<String> findSub(String message) {
        ArrayList<String> subStrings = new ArrayList<String>();

        for (int x = 0; x < message.length(); x++) {
            for (int i = 0; i < message.length() - x + 1; i++) {
                String substring = message.substring(x, x + i);
                if (!subStrings.contains(substring) && !substring.equals(message)) {
                    subStrings.add(substring);
                }
            }
        }

        return subStrings;
    }
}
