package com.algorithm.www;

import java.util.Arrays;

/**
 * @program: JavaWorkSpace2->MaxLengthOfTriangle
 * @description: 三角形的最大的周长
 * @author: MaYuan
 * @create: 2020-02-04 21:53
 * @version: 1.0
 *
 *
 **/
public class MaxLengthOfTriangle {
    private static int largestPerimeter(int[] A) {

        // 首先对数组的内容来进行排序
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            int a = A[i];
            int b = A[i - 1];
            int c = A[i - 2];
            if (a < b + c) {
                return a + b + c;
            }
        }
        // 默认的返回的是0.
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 2};
        System.out.println(largestPerimeter(nums));
    }
}
