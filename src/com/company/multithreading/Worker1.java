package com.company.multithreading;

import java.util.concurrent.locks.Lock;

public class Worker1 extends Thread {

    private String name;
    private long milliseconds;
    private Lock lock;

    public Worker1(String name, long milliseconds, Lock lock) {
        this.name = name;
        this.milliseconds = milliseconds;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        System.out.println(name + " ждёт работу с ресурсом 1");
        lock.lock();
        try {
            int n = 0;
            while (n++ < 3) {
                System.out.println(name + " пользуется ресурсом 1");
                Thread.sleep(milliseconds);
                SynchronizedCollection.getInstance().getNamesList().add("Roma");
                System.out.println(name + " завершил свои дела с ресурсом 1");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}