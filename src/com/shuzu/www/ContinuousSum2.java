package com.shuzu.www;

/**
 * @ClassName ContinuousSum2
 * @Author：Mayuan
 * @Date 2020/4/4 12:11
 * @Description TODO
 * @Version 1.0
 * <p>
 * 连续的子数组的和是一个整数的倍数
 * <p>
 * 给定一个包含非负数的数组和一个目标整数 k，编写一个函数来判断该数组是否含有连续的子数组，其大小至少为 2，总和为 k 的倍数，即总和为 n*k，其中 n 也是一个整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [23,2,4,6,7], k = 6
 * 输出: True
 * 解释: [2,4] 是一个大小为 2 的子数组，并且和为 6。
 * 示例 2:
 * <p>
 * 输入: [23,2,6,4,7], k = 6
 * 输出: True
 * 解释: [23,2,6,4,7]是大小为 5 的子数组，并且和为 42。
 **/
public class ContinuousSum2 {
    public static boolean checkSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return false;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if ((k != 0 && sum % k == 0) || (k == 0 && sum == 0))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        System.out.println(checkSubarraySum(nums, k));


    }
}
