package com.alex.study.j2se.algorithm;

public class question28 {

    static public int calcuAge (String id, int year) {
        String idyearStr = id.substring(6, 10);
        int idyearInt = Integer.parseInt(idyearStr);

        return year - idyearInt;
    }

}
