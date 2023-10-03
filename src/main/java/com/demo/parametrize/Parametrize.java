package com.demo.parametrize;

public class Parametrize {
    public static boolean isPalindrom(String str) {
        return new StringBuffer(str).reverse().toString().equals(str);
    }
}
