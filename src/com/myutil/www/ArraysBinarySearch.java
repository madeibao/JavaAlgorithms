package com.myutil.www;

import java.util.Arrays;

/**
 * @program: Pro1->ArraysBinarySearch
 * @description: 二分查找
 * @author: MaYuan
 * @create: 2019-12-23 19:40
 * @version: 1.0
 * 用二分法查找数组中的某个元素。该方法和 sort 方法一样，适用于各种基本数据类型以及对象。
 * 注意：二分法是对以及有序的数组进行查找（比如先用Arrays.sort()进行排序，
 * 然后调用此方法进行查找）。找到元素返回下标，没有则返回 -1
 **/
public class ArraysBinarySearch {
    /**
     * 二分查找必须是有序的数组，才能进行二分查找。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] num = {1, 3, 8, 5, 2, 4, 6, 7};
        Arrays.sort(num);
        //[1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println(Arrays.toString(num));
        //返回元素的下标 1，代表的式下标的所在。
        System.out.println(Arrays.binarySearch(num, 2));
    }
}




