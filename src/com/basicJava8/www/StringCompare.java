package com.basicJava8.www;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparingInt;

/**
 * @ClassName StringCompare
 * @Author：Mayuan
 * @Date 2023/9/23/0023 17:25
 * @Description TODO
 * @Version 1.0
 **/
public class StringCompare {

    public static void main(String[] args) {
        List<String> list2 = new ArrayList<>();
        list2.add("abb");
        list2.add("cc");
        list2.add("wmwen");
        list2.add("234");
        list2.sort(comparingInt(String::length));
        list2.forEach(System.out::println);
    }
}
