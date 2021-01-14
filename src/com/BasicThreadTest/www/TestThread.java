package com.BasicThreadTest.www;

/**
 * @ClassName TestThread
 * @Author：Mayuan
 * @Date 2020/6/24 14:43
 * @Description TODO
 * @Version 1.0
 * <p>
 * 测试线程类的结果值。
 **/

public class TestThread {
    public static void main(String[] args) {
        DoSomeThing ds1 = new DoSomeThing("阿三");
        DoSomeThing ds2 = new DoSomeThing("李四");

        Thread t1 = new Thread(ds1);
        Thread t2 = new Thread(ds2);

        t1.start();
        t2.start();
    }
}