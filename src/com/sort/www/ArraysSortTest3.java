package com.sort.www;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName ArraysSortTest3
 * @Author：Mayuan
 * @Date 2020/5/9 22:31
 * @Description TODO
 * @Version 1.0
 **/
public class ArraysSortTest3 {
    public static void main(String[] args) {
        Integer[] nums = {1, 22, 3, 2, 3, 4,};
        Arrays.sort(nums, Comparator.reverseOrder());
        for (int j : nums) {
            System.out.print(j + " ");
        }
    }
}
