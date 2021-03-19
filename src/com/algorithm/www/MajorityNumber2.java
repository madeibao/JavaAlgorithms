package com.algorithm.www;

import java.util.Arrays;

/**
 * @ClassName MajorityNumber2
 * @Author：Mayuan
 * @Date 2020/6/6 19:43
 * @Description TODO
 * @Version 1.0
 * <p>
 * 多数的元素
 **/


public class MajorityNumber2 {

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }
}
