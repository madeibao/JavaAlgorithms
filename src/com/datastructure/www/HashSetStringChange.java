package com.datastructure.www;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName HashSet3
 * @Author：Mayuan
 * @Date 2020/3/17 19:05
 * @Description TODO
 * @Version 1.0
 **/
public class HashSetStringChange {

    public static void main(String[] args) {

        Set<String> set2 = new HashSet<>();
        set2.add("1");
        set2.add("2");
        set2.add("3");
        set2.add("4");
        set2.add("5");
        set2.add("6");
        set2.add("7");

        String[] result = set2.toArray(new String[set2.size()]);
        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
