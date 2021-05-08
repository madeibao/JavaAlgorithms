package com.basicJava8.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName JavaStream
 * @Author：Mayuan
 * @Date 2020/7/2 10:48
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java的流式的计算与实现
 *
 * 流的各种方法
 **/
public class JavaStream {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        stringCollection
                // 转换成为流处理。
                .stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);

        // "aaa2", "aaa1"

        stringCollection
                .stream()
                .filter((s)->s.startsWith("a"))
                .sorted()
                .forEach((e)-> System.out.println(e));

        //--------------------------------------------------------------
        stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

        // "DDD2", "DDD1", "CCC", "BBB3", "BBB2", "AAA2", "AAA1"


    }
}
