package com.algorithm.www;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName AppearNumber
 * @Author：Mayuan
 * @Date 2020/7/4 19:57
 * @Description TODO
 * @Version 1.0
 * <p>
 * 第一个没有出现的数字。
 **/
public class AppearNumber {
    public static int firstMissingPositive(int[] nums) {
        int len = nums.length;
        Set<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        for (int i = 1; i <= len; i++) {
            if (!hashSet.contains(i)) {
                return i;
            }
        }

        return len + 1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2,};
        System.out.println(firstMissingPositive(nums));

    }
}
