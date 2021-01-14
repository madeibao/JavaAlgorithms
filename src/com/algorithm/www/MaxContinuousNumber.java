package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->MaxContinuousNumber
 * @description: 最大的连续的数组内容求和
 * @author: MaYuan
 * @create: 2020-01-10 16:24
 * @version: 1.0
 **/
public class MaxContinuousNumber {
    private static int sumNumber(int[] nums) {
        int maxSum = nums[0];
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
            temp += nums[i];
            if (temp > maxSum) {
                maxSum = temp;
            }
            if (temp < 0) {
                temp = 0;
            }
        }
        return maxSum;
    }

    /**
     * 第二种解法内容。
     *
     * @param nums
     * @return
     */
    private static int sumNumber2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + Math.max(nums[i - 1], 0);
        }

        // 当前的内容。
        int maxNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(sumNumber2(nums));
    }
}
