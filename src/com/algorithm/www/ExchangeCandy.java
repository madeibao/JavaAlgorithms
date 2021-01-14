package com.algorithm.www;

import java.util.Arrays;

/**
 * @program: JavaWorkSpace2->ExchangeCandy
 * @description: 交换糖果的算法
 * @author: MaYuan
 * @create: 2020-01-01 20:28
 * @version: 1.0
 * <p>
 * 爱丽丝和鲍勃有不同大小的糖果棒：A[i] 是爱丽丝拥有的第 i 块糖的大小，B[j] 是鲍勃拥有的第 j 块糖的大小。
 * <p>
 * 因为他们是朋友，所以他们想交换一个糖果棒，这样交换后，他们都有相同的糖果总量。（一个人拥有的糖果总量是他们拥有的糖果棒大小的总和。）
 * <p>
 * 返回一个整数数组 ans，其中 ans[0] 是爱丽丝必须交换的糖果棒的大小，ans[1] 是 Bob 必须交换的糖果棒的大小。
 * <p>
 * 如果有多个答案，你可以返回其中任何一个。保证答案存在。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：A = [1,1], B = [2,2]
 * 输出：[1,2]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：A = [1,2], B = [2,3]
 * 输出：[1,2]
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * 输入：A = [2], B = [1,3]
 * 输出：[2,3]
 * <p>
 * 示例 4：
 * <p>
 * 输入：A = [1,2,5], B = [2,4]
 * 输出：[5,4]
 **/
public class ExchangeCandy {

    public static int[] fairCandySwap(int[] A, int[] B) {
        int[] ans = new int[2];
        int sumA = 0, sumB = 0;
        for (int i : A) {
            sumA += i;
        }
        for (int j : B) {
            sumB += j;
        }
        Arrays.sort(A);
        Arrays.sort(B);

        //temp有可能是负数。
        int temp = sumA - (sumA + sumB) / 2;
        int i = 0, j = 0;
        while (i < A.length && j < B.length) {
            if (A[i] - B[j] == temp) {
                ans[0] = A[i];
                ans[1] = B[j];
                break;
            } else if (A[i] - B[j] > temp) {
                j++;
            } else if (A[i] - B[j] < temp) {
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 1};
        int[] num2 = {2, 2};
        int[] num3 = fairCandySwap(num1, num2);
        for (int j : num3) {
            System.out.print(j + " ");
        }
    }
}
