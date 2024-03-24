package com.algorithm.www;

import java.util.Arrays;

/**
 * @ClassName RotateNums
 * @Author：Mayuan
 * @Date 2021/4/3/0003 9:49
 * @Description TODO
 * @Version 1.0
 *
 * 移动数组的元素，负数移动到整数的前面
 *
 **/
public class RotateNums {


    static int[] rotate(int[] nums) {
        if (nums.length <=0) {
            return new int[]{};
        }

        int j = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]<0) {
                if(i!=j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }
        return nums;

    }
    public static void main(String[] args) {
        int[] nums = {-1,2,-3,4,-5};
        int[] res= rotate(nums);
        System.out.println(Arrays.toString(res));
    }
}
