package com.shuzu.www;

/**
 * @ClassName RobMoney3
 * @Author：Mayuan
 * @Date 2020/3/10 16:12
 * @Description TODO
 * @Version 1.0
 * 注意，相邻的不能够抢劫。
 * 抢劫钱财.
 **/
public class RobMoney3 {
    public static int rob(int[] nums) {
        int pre2 = 0, pre1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int cur = Math.max(pre2 + nums[i], pre1);
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }

    public static void main(String[] args) {
        int[] num = {2, 7, 9, 3, 1};
        System.out.println(rob(num));

    }
}
