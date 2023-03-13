package com.company.multithreading;

import java.util.concurrent.Semaphore;

public class Worker1 extends Thread {
    Semaphore semaphore; // todo private

    Worker1(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        int n = 0;
        while (n++ < 3) { // todo будет работать так же. Если n = 1 и ты пишешь n++ < 3, то будет сравнение 1 < 3, а потом в трае n будет уже 2, т.е. сначала возвращается значение, потом увеличивается. Если ++n < 3, то будет 2 < 3, т.е. сначала увеличивается значение, потом отдается
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
        }
    }
}