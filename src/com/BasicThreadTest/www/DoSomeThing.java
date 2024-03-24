package com.BasicThreadTest.www;

/**
 * @ClassName DoSomeThing
 * @Author：Mayuan
 * @Date 2020/6/24 14:41
 * @Description TODO
 * @Version 1.0
 **/


public class DoSomeThing implements Runnable {
    private String name;

    public DoSomeThing(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            for (long k = 0; k < 20; k++) {
                System.out.println(name + ":  " + i);
            }
        }
    }
}