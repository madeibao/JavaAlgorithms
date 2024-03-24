package com.BasicThreadTest.www;

/**
 * @ClassName TestThread4
 * @Author：Mayuan
 * @Date 2021/4/8/0008 10:50
 * @Description TODO
 * @Version 1.0
 **/

class Thread3 extends Thread{
    private String name;
    public Thread3(String name) {
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
/**
 * @author mayuan
 */
public class TestThread4 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"主线程执行開始!");
        Thread3 mTh1=new Thread3("A");
        Thread3 mTh2=new Thread3("B");
        mTh1.start();
        mTh2.start();
        System.out.println(Thread.currentThread().getName()+ "主线程执行结束!");

    }
}
