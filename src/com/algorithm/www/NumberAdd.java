package com.algorithm.www;

/**
 * @ClassName NumberAdd
 * @Author：Mayuan
 * @Date 2020/5/31 17:05
 * @Description TODO
 * @Version 1.0
 * <p>
 * 两个数字来相加
 **/

import java.util.*;

public class NumberAdd {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();
        int b = sr.nextInt();
        System.out.println(reverseAdd(a, b));
    }

    public static int reverseAdd(int a, int b) {
        if ((a <= 1 && a >= 70000) || (b <= 1 && b >= 70000))
            return -1;
        String str1 = new StringBuilder(a + "").reverse().toString();
        String str2 = new StringBuilder(b + "").reverse().toString();
        return Integer.parseInt(str1) + Integer.parseInt(str2);
    }
}
