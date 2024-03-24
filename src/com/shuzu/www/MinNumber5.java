package com.shuzu.www;

import java.util.Arrays;

/**
 * @ClassName MinNumber5
 * @Author：Mayuan
 * @Date 2021/4/25/0025 15:50
 * @Description TODO
 * @Version 1.0
 *
 * 数组来组成的最小的数字。
 *
 **/
public class MinNumber5 {

    public static String min(int[] nums) {

        String[] strs = new String[nums.length];
        for(int i=0;i<nums.length;i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (o1,o2)->(o1+o2).compareTo(o2+o1));
        return String.join("",strs);
    }

    public static void main(String[] args) {
        int[] nums = {10,2};
        System.out.println(min(nums));
    }
}
