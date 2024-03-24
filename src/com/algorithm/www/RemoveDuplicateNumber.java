package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->RemoveDuplicateNumber
 * @description: 删除重复的元素内容
 * @author: MaYuan
 * @create: 2020-01-10 21:02
 * @version: 1.0
 **/
public class RemoveDuplicateNumber {
    public int removeDuplicates(int[] nums) {
        int nextEmpty = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[nextEmpty] = nums[i];
                nextEmpty++;
            }
        }
        return nextEmpty;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(new RemoveDuplicateNumber().removeDuplicates(nums));
    }
}
