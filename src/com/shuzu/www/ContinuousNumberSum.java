package com.shuzu.www;

/**
 * @ClassName ContinuousNumberSum
 * @Author：Mayuan
 * @Date 2020/3/3 22:16
 * @Description TODO
 * @Version 1.0
 * <p>
 * 连续数组的最大的和
 **/
public class ContinuousNumberSum {

    private static int sumArray(int[] nums) {
        int sum = 0;
        int res = nums[0];
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            res = Math.max(res, sum);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(sumArray(nums));
    }
}
