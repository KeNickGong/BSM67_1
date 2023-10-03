package com.demo;

public class StaticUtils {

    public static String range() {
        return "Msg";
    }

    public String getTest(String msg) {
        String msg1 = privateTest(msg);
        return msg1;
    }

    private String privateTest(String msg) {
        return msg + "Building";
    }
}
