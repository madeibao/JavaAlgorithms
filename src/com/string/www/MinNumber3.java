package com.string.www;

import java.util.Arrays;

/**
 * @ClassName MinNumber3
 * @Author：Mayuan
 * @Date 2020/10/9 21:52
 * @Description TODO
 * @Version 1.0
 * <p>
 * 数组来组成的最小的数字。
 **/
public class MinNumber3 {

    public static String minNum(int[] nums) {
        String[] str2 = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str2[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(str2, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < str2.length; j++) {
            sb.append(str2[j]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {10, 2};
        System.out.println(minNum(nums));
    }
}
