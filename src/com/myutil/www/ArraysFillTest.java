package com.myutil.www;

import java.util.Arrays;

/**
 * @program: Pro1->ArraysFillTest
 * @description: 快速填充数组
 * @author: MaYuan
 * @create: 2019-12-23 19:43
 * @version: 1.0
 **/
public class ArraysFillTest {
    public static void main(String[] args) {
        boolean[] a1 = new boolean[5];

        // 填充1的值。
        Arrays.fill(a1, true);
        for (boolean bb : a1) {
            System.out.print(bb + " ");
        }
        System.out.println();
        String[] a = new String[6];
        Arrays.fill(a, "Hello");
        // 只会填充3.4两个部分内容。
        Arrays.fill(a, 3, 5, "World");
        for (String s : a) {
            System.out.print(s + " ");
        }

        System.out.println();
        //快速的填充一个数组。
        int[] ab = new int[5];
        Arrays.fill(ab, 1);
        System.out.println(Arrays.toString(ab));
    }
}





