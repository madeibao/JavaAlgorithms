package com.basicJava11.www;

import java.util.stream.Stream;

/**
 *
 * @ClassName VarDemo
 * @Author Mayuan
 * @Date 2026/6/29/星期一 18:21
 * @Version 1.0
 **/
public class VarDemo {
    public static void main(String[] args) {
        Stream.of(1,2,3).map((var num) -> num * 2).forEach(System.out::print);
        System.out.println();
    }
}
