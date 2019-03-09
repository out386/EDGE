package com.edge.starringharsh.EDGE.utils;

public class FormatUtils {
    public static String numToStr(int n) {
        switch(n % 10) {
            case 1:
                return n + "st";
            case 2:
                return n + "nd";
            case 3:
                return n + "rd";
            default:
                return n + "th";
        }
    }
}
