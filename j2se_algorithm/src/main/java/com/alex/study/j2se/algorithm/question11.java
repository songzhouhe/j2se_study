package com.alex.study.j2se.algorithm;

import java.util.HashMap;

public class question11 {
    static public boolean checkString(String message) {
        HashMap<Character, Integer> counter = new HashMap<>();
        Integer times;
        for (int x = 0; x < message.length(); x++) {
            char character = message.charAt(x);
            if ((times = counter.get(character)) != null) {
                counter.put(character, ++times);
            } else {
                counter.put(character, 1);
            }
        }

        for (Integer value : counter.values()) {
            if (value == 1) {
                return false;
            }
        }

        return true;
    }
}
