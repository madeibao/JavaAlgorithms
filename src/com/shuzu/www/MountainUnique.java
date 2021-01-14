package com.shuzu.www;

import java.util.Arrays;

/**
 * @ClassName MountainUnique
 * @Author：Mayuan
 * @Date 2020/4/5 11:53
 * @Description TODO
 * @Version 1.0
 * <p>
 * 独特的山峰数组
 * 众所周知，牛妹是一个offer收割姬，这次面试她遇到了这样的一个问题。
 * 给了一个序列，让找出最长的“凸子序列”
 * 何为“凸子序列”：数列中有一个xi,使得所有x0<x1<x2….xi-1<xi且xi>xi+1>xi+1>….>xn
 * eg：12345431,是山峰序列，12345234不是山峰序列
 * 注：单调递增或单调递减序列也算山峰序列；单独一个数是长度为1的山峰序列
 **/
public class MountainUnique {
    public static int mountainSequence(int[] numberList) {
        if (numberList == null || numberList.length == 0) {
            return 0;
        }
        int n = numberList.length;
        int[] maxs = new int[n];
        int[] mins = new int[n];
        Arrays.fill(maxs, 1);
        Arrays.fill(mins, 1);
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (numberList[i] > numberList[j]) {
                    maxs[i] = Math.max(maxs[i], maxs[j] + 1);
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (numberList[i] > numberList[j])
                    mins[i] = Math.max(mins[i], mins[j] + 1);
            }
        }

        // 如果只有一个数组，
        int res = 1;
        for (int i = 0; i < n; i++) {
            res = Math.max(maxs[i] + mins[i] - 1, res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 1};
        System.out.println(mountainSequence(nums));
    }
}




