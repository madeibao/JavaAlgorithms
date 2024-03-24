package com.BasicThreadTest.www;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName ThreadDemo
 * @Author：Mayuan
 * @Date 2020/8/17 10:56
 * @Description TODO
 * @Version 1.0
 **/
public class ThreadDemo implements Runnable {
    private static int totalNumber = 100;

    // 原子类的操作。
    private static AtomicInteger value = new AtomicInteger(0);

    private static int inputNum = 0;

    private static CountDownLatch countDownLatch;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int threadNum = in.nextInt();
        inputNum = threadNum;
        countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            new Thread(new ThreadDemo(), "thread" + i).start();
            countDownLatch.countDown();
        }
    }


    @Override
    public void run() {
        try {
            countDownLatch.await();
            //System.out.println("begin value is " + value.get());
            while (value.get() < totalNumber) {
                synchronized (value) {
                    String name = Thread.currentThread().getName();
                    int taskThreadNum = Integer.parseInt(name.substring(6, 7));
                    if (value.get() == taskThreadNum || value.get() % inputNum == taskThreadNum) {
                        System.out.println(name + " value is" + value);
                        value.getAndIncrement();
                        value.notifyAll();
                    } else {
                        value.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}