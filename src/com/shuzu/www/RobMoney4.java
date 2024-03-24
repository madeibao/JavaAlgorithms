package com.shuzu.www;

/**
 * @ClassName RobMoney4
 * @Author：Mayuan
 * @Date 2020/3/10 16:16
 * @Description TODO
 * @Version 1.0
 * <p>
 * 盗匪抢夺钱财.
 * 主义,所有的房屋时围成一圈来进行的.
 **/
public class RobMoney4 {
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        return Math.max(rob(nums, 0, n - 2), rob(nums, 1, n - 1));
    }

    private static int rob(int[] nums, int first, int last) {
        int pre2 = 0, pre1 = 0;
        for (int i = first; i <= last; i++) {
            int cur = Math.max(pre1, pre2 + nums[i]);
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 2};
        System.out.println(rob(nums));
    }
}
