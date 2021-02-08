package com.alex.study.j2se.algorithm;

import java.util.ArrayList;

public class question23 {
    static public ArrayList<String> allOrderSub(String target, int shortened) {
        ArrayList<String> result = new ArrayList<>();

        if (shortened == 1) {
            for (int x = 0; x < target.length(); x++) {
                result.add(target.substring(x, x + 1));
            }
        } else {
            for (int x = 0; x < target.length() - shortened + 1; x++) {
                ArrayList<String> shortenStr = allOrderSub(target.substring(x + 1), shortened - 1);
                for (String shorten : shortenStr) {
                    result.add(target.substring(x, x + 1).concat(shorten));
                }
            }
        }

        return result;
    }
}
