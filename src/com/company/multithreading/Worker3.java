package com.company.multithreading;

import java.util.concurrent.Semaphore;

public class Worker3 extends Thread {
    Semaphore semaphore;

    Worker3(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        int n = 0;
        while (n < 3) {
            try {
                System.out.println("Третий поток ожидает разрешения");
                semaphore.acquire();
                System.out.println("Третий поток начинает работу");
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SynchronizedCollection.getInstance().stringList.add("Java");
            System.out.println("Третий освобождает разрешение");
            semaphore.release();
            n++;
        }
    }
}