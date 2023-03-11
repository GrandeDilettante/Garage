package com.company;

public class StringComparator {

    public boolean stringCompare(String s1, String s2) {
        return s1.intern() == s2.intern();
    }
}