package com.shuzu.www;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName NumsSort
 * @Author：Mayuan
 * @Date 2021/3/19/0019 19:42
 * @Description TODO
 * @Version 1.0
 **/
public class NumsSort {

    public void testArray() {
        Integer[] arr = new Integer[]{1, 3, 9, 8, 98, 6};
        Integer[] arr1 = new Integer[]{1, 3, 9, 8, 98, 6};
        Integer[] arr2 = new Integer[]{1, 3, 9, 8, 98, 6};
        Arrays.sort(arr);
        Arrays.sort(arr1, Comparator.reverseOrder());
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("arr:" + Arrays.toString(arr));
        System.out.println("arr1:" + Arrays.toString(arr1));
        System.out.println("arr2:" + Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        new NumsSort().testArray();
    }

}
