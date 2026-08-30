package com.concerrent.www;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 原子操作，确保线程安全
 * 一个线程的操作被另一个线程理解可见
 * 
 * @ClassName AtomicLongDemo
 * @Author Mayuan
 * @Date 2026/8/30/星期日 17:17
 * @Version 1.0
 **/
public class AtomicLongDemo {
    // 创建一个AtomicLong实例
    private final AtomicLong count = new AtomicLong(0);

    // 增加计数的方法
    public void increment() {
        // 使用getAndIncrement方法原子性地增加count的值
        count.getAndIncrement();
    }

    // 获取当前计数的值
    public long getCount() {
        // 使用get方法获取count的值
        return count.get();
    }

    // 主方法，用于演示
    public static void main(String[] args) {
        AtomicLongDemo example = new AtomicLongDemo();

        // 创建一个线程，用于增加计数
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        // 创建另一个线程，用于增加计数
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        });

        // 启动两个线程
        thread.start();
        thread2.start();

        // 等待两个线程执行完毕
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        // 输出最终的计数结果
        System.out.println("Final count: " + example.getCount());
    }
}
