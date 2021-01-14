package com.shuzu.www;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName AppearTwoNumber
 * @Author：Mayuan
 * @Date 2020/2/27 12:04
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个数组中有两个数字出现了一次，找出数字
 **/
public class AppearTwoNumber {

    public static int[] singleNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                set.remove(n);
            } else {
                set.add(n);
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 6, 7, 8, 9};
        int[] num2 = singleNumbers(nums);
        for (int j : num2) {
            System.out.print(j + " ");
        }
    }
}





