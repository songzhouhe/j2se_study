package com.alex.study.j2se.algorithm;

public class question21 {
    static public Character transferChar(String input) {
        int chNum = input.charAt(0) + 37;
        char chTransferred = chNum > 122 ? (char) (chNum - 26) : (char) chNum;
        return chTransferred;
    }
}
