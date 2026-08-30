package com.concerrent.www;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @ClassName CountDownDemo
 * @Author Mayuan
 * @Date 2026/8/30/星期日 10:59
 * @Version 1.0
 **/
public class CountDownDemo {
    public static void main(String[] args) throws InterruptedException {
        // 创建一个计数器，设置初始的计数值为 3
        CountDownLatch latch = new CountDownLatch(3);

        // 创建三个工作线程
        new Thread(() -> {
            try {
                Thread.sleep(1000);  // 模拟任务耗时
                System.out.println("Thread 1 finished");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            } finally {
                latch.countDown();  // 每个线程任务完成后，使计数器减 1
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(2000);  // 模拟任务耗时
                System.out.println("Thread 2 finished");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            } finally {
                latch.countDown();  // 每个线程任务完成后，使计数器减 1
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(3000);  // 模拟任务耗时
                System.out.println("Thread 3 finished");
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            } finally {
                latch.countDown();  // 每个线程任务完成后，使计数器减 1
            }
        }).start();

        // 主线程会在此阻塞，直到计数器减为 0
        latch.await();
        System.out.println("All tasks finished. Main thread proceeding.");
    }
}
