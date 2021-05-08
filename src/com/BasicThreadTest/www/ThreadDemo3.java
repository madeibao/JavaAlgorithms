package com.BasicThreadTest.www;

/**
 * @ClassName ThreadDemo3
 * @Author：Mayuan
 * @Date 2021/4/8/0008 10:24
 * @Description TODO
 * @Version 1.0
 *
 * 多线程的并发执行。
 **/

/**
 * 通过继承来实现。
 */
class Thread1 extends Thread {
    private String name;
    public Thread1(String name) {
        this.name = name;
    }

    public void run() {
        for(int i =0;i<5;i++) {
            System.out.println(name+ "执行"+" "+i);
            try {
                sleep((int)(Math.random()*10));
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadDemo3 {

    public static void helper() {
        Thread1 t1 = new Thread1("t1 test");
        Thread1 t2 = new Thread1("t2 test");

        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        helper();
    }
}
