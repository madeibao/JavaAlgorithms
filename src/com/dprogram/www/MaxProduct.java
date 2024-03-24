package com.dprogram.www;

/**
 * @program: Pro1->MaxProduct
 * @description: 连续元素的最大的乘积
 * @author: MaYuan
 * @create: 2019-12-24 18:50
 * @version: 1.0
 * 给定一个整形的数组内容，然后求最大的连续的乘积序列
 * 例如 list2 = [2, 3, -2, 4]
 * 则最大的连续乘积序列为 [2,3]  乘积结果为6.
 **/
public class MaxProduct {

    /**
     * 使用一个一维数组记录以每个位置结尾的最大累乘积，再使用一个res变量(记录结果)，记录每一个位置结尾ends[i]的最大值。
     * 如何快速求出所有以i位置结尾(nums[i])的子数组的最大累乘积?
     * 假设以nums[i-1]结尾的最大累乘积为maxEnds[i-1]，
     * 以nums[i-1]记为的最小累乘积为minEnds[i-1]，那么以nums[i]结尾的最大累乘积只有三种可能
     * 可能是maxEnds[i-1] * nums[i]，这个是显然的，因为记录前面的最大值，如[3,4,5]；
     * 可能是 minEnds[i-1] * nums[i]，因为minEnds[i-1]和nums[i]都有可能是负数，如[-2,-4]；
     * 也有可能是 nums[i]自己；
     *
     * @param nums
     * @return
     */
    private static int maxMulti(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] minEnds = new int[nums.length];
        int[] maxEnds = new int[nums.length];
        minEnds[0] = nums[0];
        maxEnds[0] = nums[0];
        //代表的是最终的结果值。
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int max = nums[i] * maxEnds[i - 1];
            int min = nums[i] * minEnds[i - 1];
            maxEnds[i] = Math.max(max, Math.max(min, nums[i]));
            minEnds[i] = Math.min(min, Math.min(max, nums[i]));
            res = Math.max(maxEnds[i], res);
        }
        return res;
    }


    private static int maxMulti2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int minEnd = nums[0];
        int maxEnd = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int max = nums[i] * maxEnd;
            int min = nums[i] * minEnd;
            maxEnd = Math.max(max, Math.max(min, nums[i]));
            minEnd = Math.min(min, Math.min(max, nums[i]));
            // 然后再求最大值。
            res = Math.max(maxEnd, res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println(maxMulti(nums));
    }
}
