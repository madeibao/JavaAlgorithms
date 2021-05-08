package com.BasicThreadTest.www;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @ClassName ThreadDemo2
 * @Author：Mayuan
 * @Date 2020/8/17 10:58
 * @Description TODO
 * @Version 1.0
 **/


public class ThreadDemo2 {
    // 原子类的操作。
    private AtomicBoolean flag = new AtomicBoolean(true);

    public static void main(String[] args) throws Exception {
        ThreadDemo2 demo = new ThreadDemo2();

        new Thread(demo.new ThreadOne(), "线程1").start();
        new Thread(demo.new ThreadTwo(), "线程2").start();
        Thread.sleep(200);
        System.out.println("结束");
    }

    class ThreadOne implements Runnable {

        public void run() {
            int i = 1;
            while (i < 27) {
                synchronized (flag) {

                    if (flag.get()) {
                        System.out.print(i);
                        i++;
                        flag.set(false);
                        flag.notifyAll();
                    } else {
                        try {
                            flag.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    class ThreadTwo implements Runnable {

        private String[] charArray = new String[]{"A", "B", "C", "D"
                , "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T"
                , "U", "V", "W", "X", "Y", "Z"};

        public void run() {
            int i = 0;
            while (i < 26) {
                synchronized (flag) {

                    if (!flag.get()) {
                        System.out.print(charArray[i]);
                        if (i == 25) {
                            System.out.println();
                        }
                        i++;
                        flag.set(true);
                        flag.notifyAll();
                    } else {
                        try {
                            flag.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        }
    }
}