package com.BasicThreadTest.www;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @ClassName AtomicIntegerArrayTest
 * @Author：Mayuan
 * @Date 2020/8/5 9:53
 * @Description TODO
 * @Version 1.0
 **/
public class AtomicIntegerArrayTest {
    static int[] value = new int[]{1, 2};

    static AtomicIntegerArray ai = new AtomicIntegerArray(value);

    public static void main(String[] args) {
        ai.getAndSet(0, 3);
        System.out.println(ai.get(0));
        System.out.println(value[0]);
    }

    // 原子操作类，不会改变的是原来的数组的值，
    // 会将原来的数组内容进行复制一份。
}
