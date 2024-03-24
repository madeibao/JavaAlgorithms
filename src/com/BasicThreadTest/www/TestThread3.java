package com.BasicThreadTest.www;

/**
 * @ClassName TestThread3
 * @Author：Mayuan
 * @Date 2020/8/7 16:52
 * @Description TODO
 * @Version 1.0
 **/
public class TestThread3 {
    public static class MyThread implements Runnable {

        @Override
        public void run() {
            System.out.println("MyThread");
        }
    }

    public static void main(String[] args) {

        new MyThread().run();
        new Thread(() -> {
            System.out.println("Java 8的匿名类编码");
        }).start();
    }
}
