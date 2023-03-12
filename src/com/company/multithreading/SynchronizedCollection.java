package com.company.multithreading;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedCollection {

    private static SynchronizedCollection uniqueInstance = new SynchronizedCollection();

    private SynchronizedCollection() {
    }

    public static SynchronizedCollection getInstance() {
        return uniqueInstance;
    }

    List<String> stringList = new ArrayList<>();
}
