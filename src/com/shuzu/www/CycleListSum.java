package com.shuzu.www;

/**
 * @ClassName CycleListSum
 * @Author：Mayuan
 * @Date 2020/6/2 20:38
 * @Description TODO
 * @Version 1.0
 * <p>
 * 最大的环形数组的和，求最大值
 **/
public class CycleListSum {
    public static int maxSubarraySumCircular(int[] A) {
        int[] right = new int[A.length + 1];
        int rightMax = Integer.MIN_VALUE, rightSum = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            rightSum += A[i];
            rightMax = Math.max(rightMax, rightSum);
            right[i] = rightMax;
        }

        int two = Integer.MIN_VALUE, preSum = 0;
        int one = Integer.MIN_VALUE, leftSum = 0, leftMax = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            preSum = Math.max(preSum + A[i], A[i]);
            one = Math.max(one, preSum);
            leftSum += A[i];
            leftMax = Math.max(leftMax, leftSum);
            two = Math.max(two, leftMax + right[i + 1]);
        }
        return Math.max(two, one);
    }

    public static void main(String[] args) {

        int[] nums = {1, -2, 3, -2};
        System.out.println(maxSubarraySumCircular(nums));
    }
}
