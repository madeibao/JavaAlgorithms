package com.algorithm.www;

/**
 * @ClassName UniqueNumber
 * @Author：Mayuan
 * @Date 2020/5/16 12:21
 * @Description TODO
 * @Version 1.0
 * <p>
 * 独一无二的数字
 * <p>
 * 一个树组中的出现的唯一的一个数字。
 * 只出现一次的数字。
 **/
public class UniqueNumber {
    static int singleNonDuplicate(int[] nums, int numsSize) {
        int res = 0;

        for (int i = 0; i < numsSize; i++) {
            res = (res ^ nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 4, 4, 5, 5,};
        System.out.println(singleNonDuplicate(nums, nums.length));
    }
}
