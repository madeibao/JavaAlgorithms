package com.datastructure.www;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @ClassName ArrayListTraverse3
 * @Author：Mayuan
 * @Date 2021/4/11/0011 21:09
 * @Description TODO
 * @Version 1.0
 *
 * 链表的遍历
 *
 **/

public class ArrayListTraverse3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // one 原始for
        System.out.println("方法1开始：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("方法1结束\n");

        // two 增强for
        System.out.println("方法2开始：");
        for (int item : list) {
            System.out.println(item);
        }
        System.out.println("方法2结束\n");

        // three 迭代器
        System.out.println("方法3开始：");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("方法3结束\n");

        // four forEach(JAVA8)
        System.out.println("方法4开始：");
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("方法4结束\n");

        // five Lambda表达式
        System.out.println("方法5开始：");
        list.forEach(item -> System.out.println(item));
        System.out.println("方法5结束\n");

        // six Lambda表达式进阶
        System.out.println("方法6开始：");
        list.forEach(System.out::println);
        System.out.println("方法6结束\n");

        // seven Lambda表达式+stream
        System.out.println("方法7开始：");
        list.stream().forEach(item -> System.out.println(item));
        System.out.println("方法7结束\n");

        // eight Lambda表达式+stream进阶
        System.out.println("方法8开始：");
        list.stream().forEach(System.out::println);
        System.out.println("方法8结束\n");
    }
}
