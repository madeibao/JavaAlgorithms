package com.Stream.www;

import java.util.stream.Stream;

/**
 * @ClassName StreamTest
 * @Author：Mayuan
 * @Date 2023/8/31/0031 9:31
 * @Description TODO
 * @Version 1.0
 **/
public class StreamTest {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);

        Stream<Integer> stream2 = Stream.iterate(0, (x) -> x + 3).limit(4);
        stream2.forEach(System.out::println);

        Stream<Double> stream3 = Stream.generate(Math::random).limit(3);
        stream3.forEach(System.out::println);

    }
}
