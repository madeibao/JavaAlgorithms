package com.basicinterface.www;

/**
 * @ClassName Test3
 * @Author：Mayuan
 * @Date 2021/4/10/0010 22:06
 * @Description TODO
 * @Version 1.0
 **/


interface A3 {
    default void say() {
        System.out.println("hello,A1");
    }
}

interface A4 extends A3 {
    default void say() {
        System.out.println("hello B3");
    }
}

interface C3 extends A3,A4 {

}

public class Test3 {

    static class D3 implements C3 {

    }

    public static void main(String[] args) {
        D3 dd = new D3();
        dd.say();

        /**
         *  可以看到接口C会隐式继承子接口的方法， 也就是子接口A4的默认方法。
         *  优先子接口方法。
         */
    }
}
