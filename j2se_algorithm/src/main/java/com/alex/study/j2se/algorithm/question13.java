package com.alex.study.j2se.algorithm;

import java.util.HashMap;

public class question13 {
    static public String deleteLeast (String message) {
        HashMap<Character, Integer> letterCounter = new HashMap<>();

        for (int x = 0; x < message.length(); x++) {
            Integer counter;

            if ((counter = letterCounter.get(message.charAt(x))) == null) {
                letterCounter.put(message.charAt(x), 1);
            } else {
                letterCounter.put(message.charAt(x), ++counter);
            }
        }

        int most = message.length();
        for (Character ch : letterCounter.keySet()) {
            if (letterCounter.get(ch) < most) {
                most = letterCounter.get(ch);
            }
        }

        for (Character ch : letterCounter.keySet()) {
            if (letterCounter.get(ch) == most) {
                String[] splited = message.split(Character.toString(ch));
                StringBuilder combined = new StringBuilder(splited[0]);
                for (int t = 1; t < splited.length; t++) {
                    combined.append(splited[t]);
                }

                message = combined.toString();
            }
        }

        return message;
    }

}
