package com.dprogram.www;

import java.util.Arrays;

/**
 * @ClassName MaxIncNum
 * @Author：Mayuan
 * @Date 2024/3/2/0002 20:32
 * @Description TODO
 * @Version 1.0
 **/
public class MaxIncNum {

    static int getMaxLen(int[] nums) {
        int len = 0;
        int[] dp = new int[nums.length];

        for(int num: nums) {
            int index = Arrays.binarySearch(dp, 0, len, num);
            if(index < 0) {
                index = -(index + 1);
            }
            dp[index] = num;
            // 当dp数组中的数增加时，len++
            if(len == index){len++;}
        }

        return len;
    }
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(getMaxLen(nums));
    }
}
