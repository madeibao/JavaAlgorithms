package com.algorithm.www;

/**
 * @ClassName KeepOneNumber
 * @Author：Mayuan
 * @Date 2021/6/3/0003 10:02
 * @Description TODO
 * @Version 1.0
 *
 * 保持数组中的数字唯一的出现，
 * 并返回个数
 * 注意不能使用额外的空间。
 *
 **/
public class KeepOneNumber {
    public static int removeDuplicates(int[] nums) {
        int i =0,j =0;
        for(i=0;i<nums.length;i++) {
            if(nums[i]!=nums[j]) {
                nums[++j] = nums[i];
            }
        }

        // 由于是从零开始计数，所以返回值+1
        return j+1;
    }


    public static void main(String[] args) {
        int[] nums=  {1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
}
