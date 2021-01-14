package com.AAAA.www;

import java.util.Arrays;

/**
 * @ClassName B
 * @Author：Mayuan
 * @Date 2020/12/30/0030 22:37
 * @Description TODO
 * @Version 1.0
 *
 * 旋转数组的最小的数字。
 **/

public class B {
    public static String PrintMinNumber(int[] numbers) {
        String[] strs = new String[numbers.length];
        for(int i=0;i<numbers.length;i++) {
            strs[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strs,(o1,o2)->(o1+o2).compareTo(o2+o1));
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<strs.length;i++) {
            sb.append(strs[i]);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        int[] nums ={10,2};
        System.out.println(PrintMinNumber(nums));

    }
}
