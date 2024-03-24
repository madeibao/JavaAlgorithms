package com.shuzu.www;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName ArraySort2
 * @Author：Mayuan
 * @Date 2020/6/14 9:47
 * @Description TODO
 * @Version 1.0
 * <p>
 * 数组的根据特殊的规则来排序。
 * <p>
 * 首先根据一个数字的二进制的表示中1的个数，如果1的个数相同，然后根据数字的大小来排序
 **/
public class ArraySort2 {
    public static int[] sortByBits(int[] arr) {

        // JDK8 之后的写法。
        Integer[] res = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(res, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int a = num(o1);
                int b = num(o2);
                if (a == b) {
                    return o1 - o2;
                }
                return a - b;
            }
        });
        int[] res2 = Arrays.stream(res).mapToInt(Integer::valueOf).toArray();
        return res2;
    }


    private static int num(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count += 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] res = sortByBits(arr);
        for (int j : res) {
            System.out.print(j + " ");
        }
    }
}



