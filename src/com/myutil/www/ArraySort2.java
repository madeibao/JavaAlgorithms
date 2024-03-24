package com.myutil.www;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ClassName ArraySort2
 * @Author：Mayuan
 * @Date 2020/10/17 11:11
 * @Description TODO
 * @Version 1.0
 * <p>
 * 数组的排序的操作。
 **/
public class ArraySort2 {

    public static void main(String[] args) {
        Integer[] nums = {2, 3, 1, 3, 4, 5, 5, 2, 4,};
        Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        Arrays.sort(nums, (o1, o2) -> (o2 - o1));
        Arrays.sort(nums, Collections.reverseOrder());
        for (int j : nums) {
            System.out.print(j + " ");
        }
    }
}



