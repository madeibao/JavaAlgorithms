package com.shuzu.www;

/**
 * @program: JavaWorkSpace2->ArrayMoveKthnumber
 * @description: 数组移动k个元素的内容
 * @author: MaYuan
 * @create: 2019-12-28 21:04
 * @version: 1.0
 * 题目：
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 示例 1:
 * 输入:
 * [1,2,3,4,5,6,7]
 * 和 k = 3
 * 输出:
 * [5,6,7,1,2,3,4]
 **/

public class ArrayMoveKthNumber {


    public int[] rotation(int[] nums, int start, int end) {

        while (start <= end) {
            int temp = 0;
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }

    /**
     * 矩阵的转置的操作内容.
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        while (k > len) {
            k = k % len;
        }
        rotation(nums, 0, len - k - 1);
        rotation(nums, len - k, len - 1);
        rotation(nums, 0, len - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        new ArrayMoveKthNumber().rotate(nums, k);
        for (int j : nums) {
            System.out.print(j + " ");
        }
    }
}
