package com.algorithm.www;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: JavaWorkSpace2->ExchangeCandy2
 * @description: 交换糖果的内容2
 * @author: MaYuan
 * @create: 2020-01-28 16:07
 * @version: 1.0
 **/
public class ExchangeCandy2 {
    /**
     * 思路:
     * A集合的总个数sa,B集合的总个数sb
     * sa - x + y = sb - y + x
     * y = x + (sb - sa ) / 2
     * 通过公式计算出B数组中是否存在y值，如果存在则输出
     *
     * @param A
     * @param B
     * @return 数组
     * <p>
     * *
     * * 爱丽丝和鲍勃有不同大小的糖果棒：A[i] 是爱丽丝拥有的第 i 块糖的大小，B[j] 是鲍勃拥有的第 j 块糖的大小。
     * *
     * * 因为他们是朋友，所以他们想交换一个糖果棒，这样交换后，他们都有相同的糖果总量。（一个人拥有的糖果总量是他们拥有的糖果棒大小的总和。）
     * *
     * * 返回一个整数数组 ans，其中 ans[0] 是爱丽丝必须交换的糖果棒的大小，ans[1] 是 Bob 必须交换的糖果棒的大小。
     * *
     * * 如果有多个答案，你可以返回其中任何一个。保证答案存在。
     * *
     * *
     * *
     * * 示例 1：
     * *
     * * 输入：A = [1,1], B = [2,2]
     * * 输出：[1,2]
     * *
     * *
     * * 示例 2：
     * *
     * * 输入：A = [1,2], B = [2,3]
     * * 输出：[1,2]
     * *
     * *
     * * 示例 3：
     * *
     * * 输入：A = [2], B = [1,3]
     * * 输出：[2,3]
     * *
     * * 示例 4：
     * *
     * * 输入：A = [1,2,5], B = [2,4]
     * * 输出：[5,4]
     */

    public static int[] fairCandySwap(int[] A, int[] B) {
        int middle = (sum2(B) - sum2(A)) / 2;
        Set<Integer> setB = new HashSet<>();

        for (int x : B) {
            setB.add(x);
        }
        for (int x : A) {
            if (setB.contains(x + middle)) {
                return new int[]{x, x + middle};
            }
        }
        return null;
    }

    private static int sum2(int[] nums) {
        int sum3 = 0;
        for (int j : nums) {
            sum3 += j;
        }
        return sum3;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 5};
        int[] num2 = {2, 4};
        int[] num3 = fairCandySwap(num1, num2);
        for (int j : num3) {
            System.out.print(j + " ");
        }
    }
}
