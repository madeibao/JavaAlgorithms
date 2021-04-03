package com.designpattern.www.iterator.singleinstance;

/**
 * @ClassName Single5
 * @Author：Mayuan
 * @Date 2020/10/16 21:56
 * @Description TODO
 * @Version 1.0
 * <p>
 * 单例模式的静态内部类的实现
 * 静态内部类的实现。
 **/
public class Singleton5 {


    // 一个静态的内部类实现。
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {
    }

    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
