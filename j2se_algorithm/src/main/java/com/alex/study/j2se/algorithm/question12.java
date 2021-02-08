package com.alex.study.j2se.algorithm;

public class question12 {
    static public String pinyinToNum (String message) {
        StringBuilder result = new StringBuilder();

        String[][] pinyin = {{"yi", "er", "si", "wu", "qi", "ba"}, {"san", "liu", "jiu"}};
        String[][] shuzi = {{"1", "2", "4", "5", "7", "8"}, {"3", "6", "9"}};

        for (int x = 0; x < message.length(); x++) {
            String sub = message.substring(x, x + 1);

            for (int i = 1; i < 3; i++) {
                sub = sub.concat(message.substring(x + i, x + 1 + i));

                for (int t = 0; t < pinyin[i - 1].length; t++) {
                    if (sub.equals(pinyin[i - 1][t])) {
                        result.append(shuzi[i - 1][t]);
                        x += i;
                        i = 3;
                        break;
                    }
                }
            }
        }

        return result.toString();
    }
}
