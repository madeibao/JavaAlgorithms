package com.algorithm.www;

/**
 * @ClassName TwoSum
 * @Author：Mayuan
 * @Date 2020/10/9 10:38
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 两个数字的和等于一个给定的值。
 **/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;

        int[] res = new int[2];
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                res[0] = nums[i];
                res[1] = nums[j];
                return res;
            } else if (nums[i] + nums[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = {2, 7, 11, 15};
        int target = 9;
        int[] res2 = twoSum(res, target);
        for (int j : res2) {
            System.out.print(j + " ");
        }
    }
}
