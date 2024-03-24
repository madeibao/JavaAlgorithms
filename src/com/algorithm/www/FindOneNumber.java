package com.algorithm.www;

import java.util.Scanner;

/**
 * @ClassName FindOneNumer
 * @Author：Mayuan
 * @Date 2021/4/9/0009 22:03
 * @Description TODO
 * @Version 1.0
 *
 * 找到只出现奇数字的数字。
 *
 * //589698956
 * 输出9
 *
 *
 **/
public class FindOneNumber {

    static int FindOneNum(int arr[], int length) {
        int i, num=0;
        for(i=0; i<length; i++) {
            num ^= arr[i];
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split("");

        int[] nums = new int[strs.length];
        for(int i=0;i<nums.length;i++) {
            nums[i] = Integer.valueOf(strs[i]);
        }
        System.out.println(FindOneNum(nums,nums.length));
    }
}
