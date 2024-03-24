package com.datastructure.www;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: Pro1->ArrayList2Print
 * @description: 遍历打印链表
 * @author: MaYuan
 * @create: 2019-12-23 19:03
 * @version: 1.0
 **/
public class ArrayList2Print {
    static void oneByone(List<Integer> list1) {
        //此处为下标的输出方式进行遍历。
        int size = list1.size();
        for (int i = 0; i < size; i++) {
            System.out.print(list1.get(i) + " ");
        }
    }

    static void oneByone2(List<Integer> list1) {
        //forEach的遍历。
        for (Object o : list1) {
            System.out.println(o);
        }
    }

    static void oneByone3(List<Integer> list1) {
        // java8 的语法糖的结构
        list1.forEach(x -> System.out.print(x + " "));
    }

    static void oneByone4(List<Integer> list1) {
        //Java的迭代器的方式来进行遍历。
        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);
        list1.add(1);
        oneByone(list1);
    }
}






