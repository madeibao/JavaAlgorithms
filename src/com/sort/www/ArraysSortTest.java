package com.sort.www;

import java.util.Arrays;
import java.util.Collections;

/**
 * @ClassName ArraysSortTest
 * @Author：Mayuan
 * @Date 2020/5/9 22:13
 * @Description TODO
 * @Version 1.0
 * <p>
 * 利用Java的内置的集合对象。
 **/
public class ArraysSortTest {

    public static void main(String[] args) {

        // 注意的是一定为包装的类型才能够进行排序。
        Integer[] nums = {1, 4, 2, 2, 3, 4, 8, 9, 2, 9, 20};
        Arrays.sort(nums, Collections.reverseOrder());

        for (Integer i : nums) {
            System.out.print(i + " ");
        }
    }
}
