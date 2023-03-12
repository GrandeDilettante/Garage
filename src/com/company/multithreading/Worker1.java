package com.company.multithreading;

import java.util.concurrent.Semaphore;

public class Worker1 extends Thread {
    Semaphore semaphore;

    Worker1(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        int n = 0;
        while (n < 3) {
            try {
                System.out.println("Первый поток ожидает разрешения");
                semaphore.acquire();
                System.out.println("Первый поток начинает работу");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SynchronizedCollection.getInstance().stringList.add("Roma");
            System.out.println("Первый освобождает разрешение");
            semaphore.release();
            n++;
        }
    }
}