package com.alex.study.j2se.algorithm;

import java.util.HashMap;
import java.util.Set;

public class question6 {
    static public void letterCounter (String message) {
        HashMap<Character, Integer> counter = new HashMap<Character, Integer>();

        for (int x = 0; x < message.length(); x++) {
            char c = message.charAt(x);
            Integer times;

            if ((times = counter.get(c)) != null) {
                counter.put(c, times + 1);
            } else {
                counter.put(c, 1);
            }
        }

        Set<Character> keys = counter.keySet();
        for (Character key : keys) {
            System.out.println(key + "：" + counter.get(key));
        }
    }
}
