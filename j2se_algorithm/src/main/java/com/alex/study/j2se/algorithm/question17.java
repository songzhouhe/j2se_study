package com.alex.study.j2se.algorithm;

public class question17 {

    static public int reverseNoct (String bString) {
        StringBuilder reversed = new StringBuilder();

        for (int x = 0; x < bString.length(); x++) {
            char ch = bString.charAt(x);
            int numericValue = Character.getNumericValue(ch);
            reversed.append((numericValue * -1 + 1));
        }

        int oct = Integer.parseInt(reversed.toString(), 2);
        return oct;
    }
}
