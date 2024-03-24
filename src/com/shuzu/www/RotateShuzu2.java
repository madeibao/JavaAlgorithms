package com.shuzu.www;

/**
 * @ClassName RotateShuzu2
 * @Author：Mayuan
 * @Date 2020/3/17 11:26
 * @Description TODO
 * @Version 1.0
 * <p>
 * 将数组来循环的右面移动k个位置。
 **/
public class RotateShuzu2 {

    static void reverse(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        swap(nums, 0, n - k - 1);
        swap(nums, n - k, n - 1);
        swap(nums, 0, n - 1);
    }

    static void swap(int[] nums, int p, int q) {
        for (; p < q; p++, q--) {
            int temp = nums[p];
            nums[p] = nums[q];
            nums[q] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        reverse(nums, k);
        for (int j : nums) {
            System.out.print(j + " ");
        }

    }
}
