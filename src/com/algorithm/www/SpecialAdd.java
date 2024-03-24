package com.algorithm.www;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName SpecialAdd
 * @Author：Mayuan
 * @Date 2020/3/16 19:06
 * @Description TODO
 * @Version 1.0
 * <p>
 * 不适用加法号来进行求和
 **/
public class SpecialAdd {
    public static int add(int a, int b) {
        while (a != 0) {
            int temp = a ^ b;
            a = (a & b) << 1;
            b = temp;
        }
        return b;
    }

    public static int addV2(int a, int b) {
        AtomicInteger ai = new AtomicInteger(a);
        return ai.addAndGet(b);
    }

    public static void main(String[] args) {
        System.out.println(add(3, 2));
    }
}
