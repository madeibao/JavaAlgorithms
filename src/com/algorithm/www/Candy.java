package com.algorithm.www;

/**
 * @program: Pro1->Candy
 * @description: Java分糖果
 * @author: MaYuan
 * @create: 2019-12-23 12:42
 * @version: 1.0
 * leetcode分糖果的例子
 **/

import java.util.Arrays;
import java.util.Scanner;

public class Candy {

    /**
     * 分别从两边遍历选取较大值，计算结果
     */
    public static int candy(int[] ratings) {
        int[] left2 = new int[ratings.length];
        int[] right2 = new int[ratings.length];
        // 每人至少一个糖果
        Arrays.fill(left2, 1);
        Arrays.fill(right2, 1);

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left2[i] = left2[i - 1] + 1;
            }
        }

        // 从右面向左面进行糖果的分配。
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right2[i] = right2[i + 1] + 1;
            }
        }

        int sum2 = 0;
        for (int i = 0; i < ratings.length; i++) {
            sum2 += Math.max(left2[i], right2[i]);
        }
        return sum2;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(candy(num));
        sc.close();
    }
}





