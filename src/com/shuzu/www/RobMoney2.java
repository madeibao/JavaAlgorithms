package com.shuzu.www;

import java.util.Arrays;

/**
 * @ClassName RobMoney2
 * @Author：Mayuan
 * @Date 2020/3/5 17:59
 * @Description TODO
 * @Version 1.0
 * <p>
 * 打家劫舍的第二种情况
 * 打家劫舍的第二种情况，所有的房屋时围成一圈内容。
 **/
public class RobMoney2 {
    public static int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(myRob(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                myRob(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    private static int myRob(int[] nums) {
        int pre = 0, cur = 0, tmp;
        for (int num : nums) {
            tmp = cur;
            cur = Math.max(pre + num, cur);
            pre = tmp;
        }
        return cur;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 2};
        System.out.println(rob(nums));
    }
}
