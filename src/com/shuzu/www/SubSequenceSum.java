package com.shuzu.www;

/**
 * @ClassName SubSequenceSum
 * @Author：Mayuan
 * @Date 2020/3/26 17:23
 * @Description TODO
 * @Version 1.0
 * <p>
 * 子数组的最大和
 * <p>
 * 有负数的子数组的最大值。
 **/

public class SubSequenceSum {

    public static int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE, sum = 0;
        for (int num : nums) {
            sum = Math.max(sum + num, num);
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    /**
     * 方法2，动态规划来实现
     *
     * @param nums
     * @return
     */
    public int maxSubArray2(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}
