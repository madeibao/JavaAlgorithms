package com.basicJava8.www.Interface;

/**
 * @ClassName A
 * @Author：Mayuan
 * @Date 2020/8/10 17:33
 * @Description TODO
 * @Version 1.0
 **/

public interface A {
    default void doSomething() {
        System.out.println("Interface A");
    }
}
