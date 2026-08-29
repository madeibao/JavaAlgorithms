package com.concerrent.www;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 可重入锁，重新获取锁
 *
 * @ClassName ReentrantDemo
 * @Author Mayuan
 * @Date 2026/8/29/星期六 17:45
 * @Version 1.0
 **/
public class ReentrantDemo {
    private final Lock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println("外层方法获取锁");
            // 再次获取同一个锁
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod() {
        lock.lock();
        try {
            System.out.println("内层方法再次获取锁（可重入）");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        new ReentrantDemo().outerMethod();
    }
}
