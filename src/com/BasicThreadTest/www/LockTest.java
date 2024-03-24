package com.BasicThreadTest.www;

import java.util.concurrent.locks.ReentrantLock;
/**
 * @ClassName LockTest
 * @Author：Mayuan
 * @Date 2021/4/7/0007 21:54
 * @Description TODO
 * @Version 1.0
 *    ReentrantLock的使用
 *    非公平锁（默认) 可以开启公平锁。
 *
 *    三个优势
 *    1. 等待可中断。
 *    2. 绑定多个对象。
 *    3. 可以公平锁。
 **/

/**
 * 实现多线程方式，
 */
class ThreadTest implements Runnable {

    ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        lock.lock();
        try {
            for(int i=0;i<5;i++) {
                System.out.println(Thread.currentThread().getName()+" :"+i);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            // 主动释放锁。
            lock.unlock();
        }
    }
}
public class LockTest {

    public static void run2() {
        Runnable t = new ThreadTest();
        new Thread(t,"t1").start();
        new Thread(t,"t2").start();
    }
    public static void main(String[] args) {
        run2();
    }
}
