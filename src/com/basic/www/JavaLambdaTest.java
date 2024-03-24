package com.basic.www;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @ClassName JavaLambdaTest
 * @Author：Mayuan
 * @Date 2020/2/22 17:17
 * @Description TODO
 * @Version 1.0
 * <p>
 * java的匿名函数的内容。
 **/
public class JavaLambdaTest {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            myList.add(i);
        }

        //有序流
        Stream<Integer> sequentialStream = myList.stream();

        //并行流
        Stream<Integer> parallelStream = myList.parallelStream();

        //使用lambda表达式，过滤大于90的数字
        Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
        //lambdag表达式 forEach循环
        highNums.forEach(p -> System.out.println("最大数 并行=" + p));

        Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
        highNumsSeq.forEach(p -> System.out.println("最大数 有序=" + p));
    }
}



