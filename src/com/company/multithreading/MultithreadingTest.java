package com.company.multithreading;

import java.util.concurrent.Semaphore;

public class MultithreadingTest {
    public static void main(String[] args) throws InterruptedException {
        // появилась идея сделать через семафор, но нет уверенности насколько праивльно я его реализовал
        Semaphore semaphore = new Semaphore(1, true);
        Thread myThread1 = new Worker1(semaphore);
        myThread1.start();
        Thread myThread2 = new Worker2(semaphore);
        myThread2.start();
        Thread myThread3 = new Worker3(semaphore);
        myThread3.start();

        myThread1.join();
        myThread2.join();
        myThread3.join();

        System.out.println(SynchronizedCollection.getInstance().stringList);
    }
}
