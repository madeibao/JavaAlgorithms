package com.shuzu.www;

/**
 * @program: JavaWorkSpace2->DeleteDuplicateNumber
 * @description: 删除数组中的重复出现的元素内容
 * @author: MaYuan
 * @create: 2020-02-07 15:13
 * @version: 1.0
 **/
public class DeleteDuplicateNumber {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[++k] = nums[i];
            }
        }
        return k + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }
}
