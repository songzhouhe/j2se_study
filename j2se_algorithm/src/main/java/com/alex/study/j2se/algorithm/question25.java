package com.alex.study.j2se.algorithm;

import java.util.ArrayList;

public class question25 {
    static public ArrayList<String> allSub(String message, int targetLength) {
        ArrayList<String> result = new ArrayList<>();

        if (targetLength == 1) {
            for (int x = 0; x < message.length(); x++) {
                result.add(message.substring(x, x + 1));
            }
        } else {
            for (int x = 0; x < message.length(); x++) {

                String deleted = new StringBuilder(message).delete(x, x + 1).toString();
                String addto = message.substring(x, x + 1);
                ArrayList<String> extracted = allSub(deleted, targetLength - 1);

                for (String sub : extracted) {
                    result.add(addto.concat(sub));
                }
            }
        }

        return result;
    }
}
