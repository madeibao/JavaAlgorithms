package com.shuzu.www;

import java.util.Arrays;

/**
 * @program: JavaWorkSpace2->ClosestSumThree
 * @description: 最接近一个数字的和
 * @author: MaYuan
 * @create: 2020-02-08 16:37
 * @version: 1.0
 **/
public class ClosestSumThree {

    public static int threeSumClosest(int[] nums, int target) {
        // 首先来进行排序。
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                int sum = nums[start] + nums[end] + nums[i];
                if (Math.abs(target - sum) < Math.abs(target - ans))
                    ans = sum;
                if (sum > target)
                    end--;
                else if (sum < target)
                    start++;
                else
                    return ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
