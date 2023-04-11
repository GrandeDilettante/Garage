package com.company.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultithreadingTest {
    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        new Worker1("Worker 1", 1000, lock);
        new Worker1("Worker 2", 2000, lock);
        new Worker1("Worker 3", 3000, lock);

        new Worker2("Worker 4", 1000);
        new Worker2("Worker 5", 2000);
        new Worker2("Worker 6", 3000);
    }
}