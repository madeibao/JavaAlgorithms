package com.basicJava11.www;

import java.util.Optional;

/**
 *
 * @ClassName OptionalTest
 * @Author Mayuan
 * @Date 2026/6/29/星期一 18:22
 * @Version 1.0
 **/
public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> emptyOpt = Optional.empty();
        System.out.println(emptyOpt.isEmpty()); // true
        System.out.println(Optional.of("test").isEmpty()); // false
    }
}
