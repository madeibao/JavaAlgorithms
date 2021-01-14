package com.string.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MinNumber2
 * @Author：Mayuan
 * @Date 2020/10/9 21:52
 * @Description TODO
 * @Version 1.0
 **/
public class MinNumber2 {
    public static String minNun(int[] nums) {
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list2.add(String.valueOf(nums[i]));
        }

        list2.sort((o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list2.size(); i++) {
            sb.append(list2.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {10, 2};
        System.out.println(minNun(nums));
    }
}