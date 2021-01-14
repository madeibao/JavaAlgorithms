package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->MoveZeros
 * @description: 移动数组中的零到末尾的位置上
 * @author: MaYuan
 * @create: 2020-02-05 17:40
 * @version: 1.0
 **/
public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        while (j < nums.length) {
            nums[j++] = 0;
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 0, 3, 0, 2, 0, 3};
        moveZeroes(nums);
        for (int j : nums) {
            System.out.print(j + " ");
        }
    }
}
