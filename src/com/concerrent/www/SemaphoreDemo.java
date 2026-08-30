package com.concerrent.www;

import java.util.concurrent.Semaphore;

/**
 * Semaphore是一种同步工具，它允许多个线程同时访问一个有限资源。
 * Semaphore的构造函数允许指定一个初始信号量数，表示有多少资源可供同时访问
 *
 * @ClassName SemaphoreDemo
 * @Author Mayuan
 * @Date 2026/8/30/星期日 10:47
 * @Version 1.0
 **/
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        for (int i = 0; i < 5; i++) {
            new Thread(new Worker(i, semaphore)).start();
        }
    }
}

class Worker implements Runnable {
    private final int id;
    private final Semaphore semaphore;

    public Worker(int id, Semaphore semaphore) {
        this.id = id;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println("线程 " + id + " 获得了资源，开始工作");
            Thread.sleep((long) (Math.random() * 10000));
            System.out.println("线程 " + id + " 完成工作，释放了资源");
            semaphore.release();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}