package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->SingleDirection2
 * @description: 判断数组是否单调
 * @author: MaYuan
 * @create: 2019-12-25 21:46
 * @version: 1.0
 **/
public class SingleDirection2 {
    private static boolean isSingleDirection(int[] nums) {
        if (nums == null || nums.length == 1 || nums.length == 2) {
            return true;
        }
        // 单调递增的内容。
        int countUp = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] >= 0) {
                countUp += 1;
            }
        }
        if (countUp == nums.length - 1) {
            return true;
        }

        //单调递减
        int countDown = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] - nums[j - 1] <= 0) {
                countDown += 1;
            }
        }

        if (countDown == nums.length - 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 1};
        System.out.println(isSingleDirection(nums));
    }
}
