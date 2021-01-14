package com.thread.www;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Demo2
 * @Author：Mayuan
 * @Date 2020/4/26 12:04
 * @Description TODO
 * @Version 1.0
 * <p>
 * 多线程的表示结果1
 **/
public class Demo2 {
    private static int count = 0;
    static Lock lock = new ReentrantLock();

    public static void inc() {
        lock.lock();
        try {
            Thread.sleep(1);
            count++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
    }
}