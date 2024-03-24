package com.basicinterface.www;

/**
 * @ClassName Test2
 * @Author：Mayuan
 * @Date 2021/4/10/0010 21:41
 * @Description TODO
 * @Version 1.0
 **/


interface A2 {
    default void say(int a) {
        System.out.println("A");
    }

    default void run() {
        System.out.println("A.run");
    }
}

interface B2 extends A2 {
    default void say(int a) {
        System.out.println("B");
    }

    default void play() {
        System.out.println("B.play");
    }
}

interface C2 extends A2, B2 {

}

public class  Test2 {

    static class D2 implements C2 {

    }

    public static void main(String[] args) {
        D2 d = new D2();
        d.run();
        d.play();
    }
}