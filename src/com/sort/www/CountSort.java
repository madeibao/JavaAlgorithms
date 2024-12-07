package com.sort.www;

import java.util.Arrays;

/**
 * java的计数排序
 *
 * @ClassName CountSort
 * @Author：Mayuan
 * @Date 2024/12/7/星期六 21:05
 * @Description TODO
 * @Version 1.0
 **/
public class CountSort {
    private static int[] sortNums(int[] nums) {

        int maxValue;
        maxValue = Arrays.stream(nums).max().getAsInt();
        int[] countArray = new int[maxValue + 1];
        // 便利数组，填充统计数组
        for (int i = 0; i < nums.length; i++) {
            countArray[nums[i]]++;
        }
        int index = 0;
        int[] resArray = new int[nums.length];

        for(int i=0;i<countArray.length;i++){
            for(int j= 0;j<countArray[i];j++){
                resArray[index++] = i;
            }
        }
        return resArray;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 4, 3, 3, 5, 3, 6, 7, 9, 8};
        int[] sortArray = sortNums(array);
        System.out.println(Arrays.toString(sortArray));
    }
}
