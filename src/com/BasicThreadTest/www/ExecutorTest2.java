package com.BasicThreadTest.www;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ExecutorTest2
 * @Author：Mayuan
 * @Date 2020/7/5 9:34
 * @Description TODO
 * @Version 1.0
 * <p>
 * 线程的中断方法
 **/
public class ExecutorTest2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Thread run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.shutdownNow();
        System.out.println("Main run");
    }
}
