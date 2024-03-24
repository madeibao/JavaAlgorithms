package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->NumberLength
 * @description: 数字的长度
 * @author: MaYuan
 * @create: 2020-01-14 21:08
 * @version: 1.0
 * 求一个数组中的数字的位数为偶数，统计总和。
 **/
public class NumberLength {
    private static int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            String str = String.valueOf(nums[i]);
            if ((str.length() & 1) == 0) {
                result += 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, 8989, 9999};
        System.out.println(findNumbers(nums));
    }
}
