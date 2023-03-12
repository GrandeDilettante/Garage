package com.company.multithreading;

import java.util.concurrent.Semaphore;

public class Worker2 extends Thread {
    Semaphore semaphore;

    Worker2(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        int n = 0;
        while (n < 3) {
            try {
                System.out.println("Второй поток ожидает разрешения");
                semaphore.acquire();
                System.out.println("Второй поток начинает работу");
                Thread.sleep(2 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SynchronizedCollection.getInstance().stringList.add("Matvey");
            System.out.println("Второй освобождает разрешение");
            semaphore.release();
            n++;
        }
    }
}