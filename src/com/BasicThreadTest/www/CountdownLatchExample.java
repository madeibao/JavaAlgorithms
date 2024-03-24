package com.BasicThreadTest.www;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName CountdownLatchExample
 * @Author：Mayuan
 * @Date 2020/7/5 9:30
 * @Description TODO
 * @Version 1.0
 * <p>
 * 线程的计数器。
 **/

public class CountdownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        final int totalThread = 10;
        CountDownLatch countDownLatch = new CountDownLatch(totalThread);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < totalThread; i++) {
            executorService.execute(() -> {
                System.out.print("run..");
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();

        System.out.println("end");
        executorService.shutdown();
    }

}
