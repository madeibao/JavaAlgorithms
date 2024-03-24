package com.datastructure.www;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName TopKthA
 * @Author：Mayuan
 * @Date 2023/11/7/0007 15:16
 * @Description TODO
 * @Version 1.0
 **/
public class TopKthA {


    public static void printA() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        //将list排列顺序逆转顺序，升序就变成了降序
        Collections.sort(integers, Comparator.reverseOrder());
        //取前三个元素
        List<Integer> limit = integers.stream().limit(3).collect(Collectors.toList());
        limit.forEach(System.out::println);

    }

    public static void printB() {
        List<Integer> integers = Arrays.asList(6, 4, 3, 2, 1, 5, 9, 8,7);
        //从小到大排序
        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        List<Integer> limit = integers.stream().limit(3).collect(Collectors.toList());
        limit.forEach(System.out::println);
    }

    public static void printC() {
        List<Integer> integers = Arrays.asList(6, 4, 3, 2, 1, 5, 9, 8,7);
        //默认从小到大排序
        Collections.sort(integers);
        //逆转排序
        integers.sort(Comparator.reverseOrder());
        List<Integer> limit = integers.stream().limit(3).collect(Collectors.toList());
        limit.forEach(System.out::println);
    }


    public static void main(String[] args) {

        printA();
        printB();
        printC();
    }
}
