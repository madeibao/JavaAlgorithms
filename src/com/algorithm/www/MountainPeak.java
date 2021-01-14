package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->MountainPeak
 * @description: 数组的山脉数组内容
 * @author: MaYuan
 * @create: 2020-02-05 16:31
 * @version: 1.0
 * <p>
 * 我们把符合下列属性的数组 A 称作山脉：*
 * A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 **/
public class MountainPeak {
    public static int peakIndexInMountainArray(int[] A) {
        int i = 0;
        while (A[i] < A[i + 1]) {
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.print(peakIndexInMountainArray(nums));
    }
}








