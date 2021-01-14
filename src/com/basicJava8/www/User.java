package com.basicJava8.www;

import java.util.Optional;

/**
 * @ClassName User
 * @Author：Mayuan
 * @Date 2020/8/6 18:50
 * @Description TODO
 * @Version 1.0
 **/

public class User {
    private String username;
    private Integer age;

    private User() {
    }

    public static User of() {
        return new User();
    }

    private User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public static User of(String username, Integer age) {
        return new User(username, age);
    }

    public static void main(String[] args) {
        // Optional类已经成为Java 8类库的一部分，在Guava中早就有了，可能Oracle是直接拿来使用了
        // Optional用来解决空指针异常，使代码更加严谨，防止因为空指针NullPointerException对代码造成影响
        String msg = "hello";
        Optional<String> optional = Optional.of(msg);
        // 判断是否有值，不为空
        boolean present = optional.isPresent();
        // 如果有值，则返回值，如果等于空则抛异常
        String value = optional.get();
        // 如果为空，返回else指定的值
        String hi = optional.orElse("hi");
        // 如果值不为空，就执行Lambda表达式
        optional.ifPresent(opt -> System.out.println(opt));
    }
}
