package com.shuzu.www;

/**
 * @program: Pro1->RobMoney
 * @description: leetcode小偷打劫计划
 * @author: MaYuan
 * @create: 2019-12-23 13:45
 * @version: 1.0
 * <p>
 * * 你是一个专业的小偷，计划偷窃沿街的房屋。
 * * 每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * * 打家劫舍的勾当
 * * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 * 偷窃到的最高金额 = 1 + 3 = 4 。
 * <p>
 * 做这题需要首先掌握动态规划，如果不了解动态规划可以先看我之前的博客 动态规划――五大常用算法之一。
 * 对于此题，如果只有两家或者以下，我们选择金额最大的。
 * 如果2家以上，那我们打劫到第 i 家的时候，就要考虑，
 * 要不要打劫这一家，也就是（这一家的价值+打劫到 i - 2家的最大价值）和（打劫到上一家（i - 1）的最大价值），
 * 比较这两个值，选较大值作为打劫到第 i 家的最大价值。最后输出最后一家就可以了。
 **/

public class RobMoney {
    private static int rob(int[] num) {
        int len = num.length;
        if (len == 0) {
            return 0;
        }
        int[] f = new int[len];
        if (len == 1) {
            return num[0];
        }

        // 如果是只有两个元素的值，直接的进行返回。
        int a = Math.max(num[0], num[1]);
        if (len == 2) {
            return a;
        }
        f[0] = num[0];
        f[1] = a;
        for (int i = 2; i < f.length; i++) {
            f[i] = Math.max(num[i] + f[i - 2], num[i - 1]);
        }
        return f[len - 1];
    }


    /**
     * 迭代的实现方法。
     * @param args
     */

    static int rob2(int[] nums) {
        if(nums.length==0||nums==null) {
            return -1;
        }
        if(nums.length==1) {
            return nums[0];
        }

        if(nums.length==2) {
            return Math.max(nums[0],nums[1]);
        }

        int pre = 0, cur=  0;
        for(int i=0;i<nums.length;i++) {
            int temp = Math.max(pre+nums[i], cur);
            pre = cur;
            cur = temp;
        }
        return cur;
    }
    public static void main(String[] args) {
        int[] num = {2, 7, 9, 3, 1};
        System.out.println(rob(num));
        // STOPSHIP: 2021/4/2/0002
        System.out.println(rob2(num));
    }
}



