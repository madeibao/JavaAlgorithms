package com.shuzu.www;

import java.util.ArrayList;

/**
 * @ClassName MinNumberArray
 * @Author：Mayuan
 * @Date 2020/12/28/0028 10:42
 * @Description TODO
 * @Version 1.0
 *
 * 蒋数组来排成最小的数字，
 *
 *
 **/
public class MinNumberArray {

    private static String minNum(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            list.add(String.valueOf(nums[i]));
        }

        list.sort((o1,o2)->(o1+o2).compareTo(o2+o1));
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.size();i++) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int[] nums ={2,10};
        System.out.println(minNum(nums));
    }
}


