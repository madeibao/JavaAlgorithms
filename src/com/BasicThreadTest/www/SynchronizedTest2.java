package com.BasicThreadTest.www;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName SynchronizedTest2
 * @Author：Mayuan
 * @Date 2020/6/30 9:54
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java的sysnchronize的用法
 **/

public class SynchronizedTest2 {
    public void func1() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        SynchronizedTest2 e1 = new SynchronizedTest2();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> e1.func1());
        executorService.execute(() -> e1.func1());
    }

    /**
     * public static void main(String[] args) {
     SynchronizedTest2 e1 = new SynchronizedTest2();
     SynchronizedTest2 e1 = new SynchronizedTest2();
     *     ExecutorService executorService = Executors.newCachedThreadPool();
     *     executorService.execute(() -> e1.func1());
     *     executorService.execute(() -> e2.func1());
     //        0 0 1 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9 9
     * }
     */
}
