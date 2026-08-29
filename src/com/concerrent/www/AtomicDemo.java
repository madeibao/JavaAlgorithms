package com.concerrent.www;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @ClassName AtomicDemo
 * @Author Mayuan
 * @Date 2026/8/29/星期六 17:34
 * @Version 1.0
 **/
public class AtomicDemo {

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger count = new AtomicInteger(0);
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    count.incrementAndGet(); // 原子自增
                }
            });
            threads[i].start();
        }
        for (Thread t : threads) {
            t.join();
        }
        System.out.print(count.get());
    }
}
