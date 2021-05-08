package com.basicinterface.www;

/**
 * @ClassName Test
 * @Author：Mayuan
 * @Date 2021/4/10/0010 21:31
 * @Description TODO
 * @Version 1.0
 **/

interface A {
    default void say(int name) {
        System.out.println("A=" + name);
    }
}

interface B {
    default String say(short name) {
        System.out.println("B=" + name);
        return "hi, " + name;
    }
}

interface C extends A, B {
    default String say(String name) {
        System.out.println("C=" + name);
        return "hi, " + name;
    }
}

public class Test {
    static class D implements C {

    }
    public static void main(String[] args) {
        D d = new D();
        byte a = 1;
        d.say(a);

        d.say("hoxiurong");
    }
}