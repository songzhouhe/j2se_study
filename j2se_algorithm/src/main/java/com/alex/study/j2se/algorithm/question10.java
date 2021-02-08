package com.alex.study.j2se.algorithm;

public class question10 {

    static public String transferStr (String message) {
        // 1.程序实现目标： 输入一个字符串，将其各个字符对应的ASCII值加5后，输出结果。
        // 程序要求：该字符串只包含小写字母，若其值加5后的字符值大于'z',将其转换成从a开始的字符。

        StringBuilder result = new StringBuilder();

        for (int x = 0; x < message.length(); x++) {
            if (message.charAt(x) != 'Z' && message.charAt(x) != 'z') {
                result.append((char) (message.charAt(x) + 1));
            } else {
                result.append((char) (message.charAt(x) - 25));
            }
        }

        return result.toString();
    }

}
