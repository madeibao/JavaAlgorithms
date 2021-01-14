package com.shuzu.www;

import java.util.Arrays;

/**
 * @ClassName MinKNumber
 * @Author：Mayuan
 * @Date 2020/2/25 13:57
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个数组中的最小的K个数字。
 **/
public class MinKthNumber {
    public static int[] getLeastNumbers(int[] arr, int k) {
        int[] nums = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            nums[i] = arr[i];
        }
        return nums;
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 1};
        int[] temp = getLeastNumbers(arr, 1);
        for (int j : temp) {
            System.out.print(j + " ");
        }
    }
}
