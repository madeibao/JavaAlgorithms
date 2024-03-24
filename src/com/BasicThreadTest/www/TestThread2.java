package com.BasicThreadTest.www;

/**
 * @ClassName TestThread2
 * @Author：Mayuan
 * @Date 2020/6/24 14:50
 * @Description TODO
 * @Version 1.0
 * <p>
 * 测试多线程2的结果值。
 **/


public class TestThread2 extends Thread {
    public TestThread2(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            for (long k = 0; k < 20; k++) {
                System.out.println(this.getName() + " : " + i);
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new TestThread2("阿三");
        Thread t2 = new TestThread2("李四");
        t1.start();
        t2.start();
    }
}