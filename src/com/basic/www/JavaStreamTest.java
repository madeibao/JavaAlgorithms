package com.basic.www;

import java.util.Arrays;

/**
 * @ClassName JavaStreamTest
 * @Author：Mayuan
 * @Date 2020/6/14 9:57
 * @Description TODO
 * @Version 1.0
 * <p>
 * java 的流运算实现整形数组和包装形状的转换
 **/


public class JavaStreamTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4};
        Integer[] res = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        for (Integer j : res) {
            System.out.print(j + " ");
        }

        System.out.println();
        // 下面是包装类型向普通类型的转换
        Integer[] res2 = {2, 23, 23, 24, 23};
        int[] arr2 = Arrays.stream(res2).mapToInt(Integer::valueOf).toArray();

        for (int j : arr2) {
            System.out.print(j + " ");
        }
    }
}
