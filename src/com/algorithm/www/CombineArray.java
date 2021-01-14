package com.algorithm.www;

import java.util.Arrays;

/**
 * @program: JavaWorkSpace2->CombineArray
 * @description: 合并两个有序的数组内容
 * @author: MaYuan
 * @create: 2020-01-26 20:23
 * @version: 1.0
 **/
public class CombineArray {
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 5, 6};
        merge(num1, 3, num2, 3);
        for (int j : num1) {
            System.out.print(j + " ");
        }
    }
}


