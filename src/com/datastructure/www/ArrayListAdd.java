package com.datastructure.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ArrayListAdd
 * @Author：Mayuan
 * @Date 2020/2/26 11:12
 * @Description TODO
 * @Version 1.0
 * <p>
 * 链表的添加的操作
 **/
public class ArrayListAdd {

    public static void main(String[] args) {

        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        res.add(2);
        res.add(3);
        res.add(4);
        res.add(5);

        // 指定的节点的头部来进行添加内容
        // 由于内部是基于数组来实现的，所以可以随机位置的访问和添加元素。
        res.add(0, 0);

        res.forEach(System.out::println);

        System.out.println("-------------------------------");
        // 作为链表的结构。
        Integer[] li = {1, 2, 3, 4, 6, 8, 9, 10};
        List<Integer> list2 = Arrays.asList(li);
        list2.forEach(System.out::println);
    }
}
