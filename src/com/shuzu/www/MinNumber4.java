package com.shuzu.www;

import java.util.Arrays;

/**
 * @ClassName MinNumber4
 * @Author：Mayuan
 * @Date 2020/10/8 16:00
 * @Description TODO
 * @Version 1.0
 * <p>
 * 最小的数字的值。
 **/
public class MinNumber4 {

    public static String min(int[] nums) {
        String[] temp = new String[nums.length];
        for (int j = 0; j < nums.length; j++) {
            temp[j] = String.valueOf(nums[j]);
        }
        Arrays.sort(temp, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        StringBuilder sb = new StringBuilder();
        for (String t : temp) {
            sb.append(t);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {10, 2};
        System.out.println(min(nums));
    }
}
