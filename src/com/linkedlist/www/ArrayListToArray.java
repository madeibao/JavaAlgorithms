package com.linkedlist.www;

import java.util.ArrayList;

/**
 * @ClassName ArrayListToArray
 * @Author：Mayuan
 * @Date 2020/2/25 20:45
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 链表来变成数组进行存储
 **/
public class ArrayListToArray {

    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        res.add(2);
        res.add(3);
        res.add(1);
        res.add(5);

        // Java8 中的数据流的方法来实现。
        // ArrayList变成数组的形式来进行存储。
        int[] array = res.stream().mapToInt(i -> i).toArray();

        for (int i : array) {
            System.out.println(i + " ");
        }
    }
}
