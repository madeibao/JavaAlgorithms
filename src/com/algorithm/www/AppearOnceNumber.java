package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->AppearOnceNumber
 * @description: 只是出现一次的数字
 * @author: MaYuan
 * @create: 2020-01-28 11:53
 * @version: 1.0
 * <p>
 * 一个数组中，求只出现一次的数字内容。
 **/
public class AppearOnceNumber {

    private static int singleNumber(int[] nums) {
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(singleNumber(nums));
    }
}






