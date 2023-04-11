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

    private List<String> namesList = new ArrayList<>();
    private List<String> students = new ArrayList<>();

    public List<String> getNamesList() {
        return namesList;
    }

    public List<String> getStudents() {
        return students;
    }
}