package com.myutil.www;

import java.util.Arrays;

/**
 * @program: Pro1->ArraysSortTest
 * @description: 内部自定义排序
 * @author: MaYuan
 * @create: 2019-12-23 19:48
 * @version: 1.0
 * *  Java对数组中的一部分内容进行排序。
 * * 	这种形式是对数组部分排序，也就是对数组a的下标从fromIndex到toIndex-1的元素排序，注意：下标为toIndex的元素不参与排序哦！
 * *  Arrays.sort(int[] a, int fromIndex, int toIndex)
 * 指定的区间内容进行排序的操作。
 * 包括开始，不包括结尾的内容。
 **/
public class ArraysSortTest {
    public static void main(String[] args) {

        Integer[] a = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};
        Arrays.sort(a, 0, 3);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}


