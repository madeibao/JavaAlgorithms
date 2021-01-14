package com.datastructure.www;

import java.util.LinkedList;

/**
 * @ClassName LinkedList2
 * @Author：Mayuan
 * @Date 2020/2/26 11:22
 * @Description TODO
 * @Version 1.0
 * <p>
 * 内部是基于链表结构来实现的
 * 这里是一个双向的链表。
 * 所以不具有随机的特性，但是插入和删除元素的时候，效率比较的高。
 **/
public class LinkedList2 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach(System.out::println);

    }
}
