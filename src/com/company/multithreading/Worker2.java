package com.company.multithreading;

public class Worker2 extends Thread {

    private String name;
    private long milliseconds;
    static final Object lock = new Object();

    public Worker2(String name, long milliseconds) {
        this.name = name;
        this.milliseconds = milliseconds;
        this.start();
    }

    @Override
    public void run() {
        System.out.println(name + " ждёт работу с ресурсом 2");
        synchronized (lock) {
            try {
                int n = 0;
                while (n++ < 3) {
                    System.out.println(name + " пользуется ресурсом 2");
                    Thread.sleep(milliseconds);
                    SynchronizedCollection.getInstance().getStudents().add("Pifagor");
                    System.out.println(name + " завершил свои дела с ресурсом 2");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
