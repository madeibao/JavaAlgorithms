package com.concerrent.www;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @ClassName GetLockDemo
 * @Author Mayuan
 * @Date 2026/8/29/星期六 17:53
 * @Version 1.0
 **/
public class GetLockDemo {
    private final ReentrantLock lock = new ReentrantLock();
    public void tryLockMethod() {
        try {
            // 尝试等待 2 秒获取锁，超时则放弃
            if (lock.tryLock(2, TimeUnit.SECONDS)) {
                try {
                    System.out.println(Thread.currentThread().getName() + " 成功获取锁");
                    Thread.sleep(1000);
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " 获取锁超时，执行其他逻辑");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        GetLockDemo example = new GetLockDemo();

        Thread t1 = new Thread(example::tryLockMethod, "线程A");
        Thread t2 = new Thread(example::tryLockMethod, "线程B");

        t1.start();
        // 让线程A先获取锁
        Thread.sleep(100);
        t2.start();
    }
}
