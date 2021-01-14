package com.shuzu.www;

/**
 * @program: JavaWorkSpace2->CountNumberLength
 * @description: 计算数字的位数长度
 * @author: MaYuan
 * @create: 2019-12-28 19:45
 * @version: 1.0
 * 输入：nums = [12,345,2,6,7896]
 * 输出：2
 * 解释：
 * 12 是 2 位数字（位数为偶数）
 * 345 是 3 位数字（位数为奇数）
 * 2 是 1 位数字（位数为奇数）
 * 6 是 1 位数字 位数为奇数）
 * 7896 是 4 位数字（位数为偶数）
 * 因此只有 12 和 7896 是位数为偶数的数字
 **/
public class CountNumberLength {
    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            String temp = String.valueOf(nums[i]);
            if ((temp.length() & 1) == 0) {
                result += 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
}
