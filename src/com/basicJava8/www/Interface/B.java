package com.basicJava8.www.Interface;

/**
 * @ClassName B
 * @Author：Mayuan
 * @Date 2020/8/10 17:33
 * @Description TODO
 * @Version 1.0
 **/

public interface B extends A {
    default void doSomething() {
        System.out.println("Interface B");
    }
}
