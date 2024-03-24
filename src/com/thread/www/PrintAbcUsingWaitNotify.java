package com.thread.www;

/**
 * @ClassName PrintABCUsingWaitNotify
 * @Author：Mayuan
 * @Date 2023/9/18/0018 21:18
 * @Description TODO
 * @Version 1.0
 **/
public class PrintAbcUsingWaitNotify {

    // 打印的次数
    private int times;

    /**打印的状态*/
    private int state = 0;
    private Object objectA = new Object();
    private Object objectB = new Object();
    private Object objectC = new Object();


    public PrintAbcUsingWaitNotify(int times) {
        this.times = times;
    }

    public void printA() {
        print("A",0,objectA,objectB);
    }

    public void printB() {
        print("B",1,objectB, objectC);
    }

    public void printC() {
        print("C",2,objectC,objectA);
    }


    public void print(String name, int targetState, Object curr, Object next) {

        for(int i=0;i<times;i++) {
            synchronized (curr) {
                while (state%3!=targetState) {
                    try {
                        curr.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                i++;
                state++;
                System.out.println(name);
                synchronized (next) {
                    next.notify();
                }
            }
        }
    }


    public static void main(String[] args) {
        PrintAbcUsingWaitNotify p = new PrintAbcUsingWaitNotify(10);
        new Thread(new Runnable() {
            @Override
            public void run() {
                p.printA();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                p.printB();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                p.printC();
            }
        }).start();
    }
}
