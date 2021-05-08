package com.BasicThreadTest.www;

/**
 * @ClassName ThreadJoin
 * @Author：Mayuan
 * @Date 2021/4/8/0008 15:09
 * @Description TODO
 * @Version 1.0
 *
 * 线程的join 函数。
 *
 *
 **/

class Thread2 extends Thread{
    private String name;
    public Thread2(String name) {
        super(name);
        this.name=name;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 线程执行開始!");
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程"+name + "执行 : " + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " 线程执行结束!");
    }
}

public class ThreadJoin {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"主线程执行開始!");
        Thread2 mTh1=new Thread2("A");
        Thread2 mTh2=new Thread2("B");
        mTh1.start();
        mTh2.start();
        try {
            mTh1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            mTh2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+ "主线程执行结束!");
    }
}
