package com.company.OOP;

public class StringComparator {

    public static boolean stringCompare(String s1, String s2) {
        return s1.intern() == s2.intern();
    }
}