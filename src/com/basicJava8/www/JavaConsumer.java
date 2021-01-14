package com.basicJava8.www;

import java.util.function.Consumer;

/**
 * @ClassName JavaConsumer
 * @Author：Mayuan
 * @Date 2020/11/9 17:22
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java8的consumer的接口来实现。
 * 有输入，但是没有输出
 **/
public class JavaConsumer {
    public static void modifyValue(int value, Consumer<Integer> consumer) {
        consumer.accept(value);
    }

    public static void main(String[] args) {
        modifyValue(3, (x) -> System.out.println(x * 3));
    }
}
