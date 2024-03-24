package com.shuzu.www;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName MaxNum
 * @Author：Mayuan
 * @Date 2021/3/19/0019 19:52
 * @Description TODO
 * @Version 1.0
 **/
public class MaxNum {

    public static String maxNum(int[] nums) {
        if(nums.length==0||nums==null) {
            return null;
        }
        String[] strs = new String[nums.length];
        for(int i=0;i<nums.length;i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, (o1, o2)->(o1+o2).compareTo(o2+o1));
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });
        StringBuilder sb =new StringBuilder();
        for(String i:strs) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        int[] nums = {10,2};
        System.out.println(maxNum(nums));
    }
}
