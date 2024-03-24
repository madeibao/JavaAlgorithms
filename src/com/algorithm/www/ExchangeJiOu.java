package com.algorithm.www;

import java.util.Arrays;

/**
 * @ClassName ExchangeJiOu
 * @Author：Mayuan
 * @Date 2020/3/26 16:53
 * @Description TODO
 * @Version 1.0
 * <p>
 * 数组中的奇数和偶数来进行重新排列。
 **/
public class ExchangeJiOu {

    public static int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1, tmp;
        while (i < j) {
            while (i < j && (nums[i] & 1) == 1) {
                i++;
            }
            while (i < j && (nums[j] & 1) == 0) {
                j--;
            }
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 4};
        int[] temp = exchange(nums);
        System.out.println(Arrays.toString(temp));
    }
}
