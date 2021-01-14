package com.datastructure.www;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * @ClassName JavaSetTest
 * @Author：Mayuan
 * @Date 2020/3/9 11:11
 * @Description TODO
 * @Version 1.0
 **/
public class JavaSetTest {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        for (String data : Arrays.asList("B", "E", "D", "C", "A", "M", "N")) {
            hashSet.add(data);
            linkedHashSet.add(data);
            treeSet.add(data);
        }

        //不保证有序
        System.out.println("Ordering in HashSet :" + hashSet);

        //FIFO保证安装插入顺序排序
        System.out.println("Order of element in LinkedHashSet :" + linkedHashSet);

        //内部实现排序
        System.out.println("Order of objects in TreeSet :" + treeSet);
    }
}
