package com.concerrent.www;

/**
 *
 * @ClassName VolatileDemo
 * @Author Mayuan
 * @Date 2026/8/29/星期六 19:17
 * @Version 1.0
 **/
public class VolatileDemo {
    // 不加 volatile，子线程可能永远感知不到 running = false
    private static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            long count = 0;
            while (running) {  // 每次循环都从主内存读取最新值
                count++;
            }
            System.out.println("工作线程停止，累计循环: " + count);
        });

        worker.start();
        Thread.sleep(1000);        // 主线程休眠1秒
        running = false;                 // 主线程修改标志位
        System.out.println("主线程已将 running 设为 false");
    }
}
