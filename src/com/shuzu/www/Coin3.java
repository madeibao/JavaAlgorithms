package com.shuzu.www;

import java.util.Scanner;

/**
 * @ClassName Coin3
 * @Author：Mayuan
 * @Date 2020/6/10 20:05
 * @Description TODO
 * @Version 1.0
 * <p>
 * 百度笔试题翻转硬币的操作。
 * 桌子上放着N枚硬币，将其从1到N编号，初始时有的正面朝上，有的反面朝上。现在要将所有硬币翻至正面朝上，每次可选择一个区间[L,R]（1≤L≤R≤N），并执行以下两种操作的一种：
 * <p>
 * （1）将编号为L到R的硬币翻面；
 * <p>
 * （2）若编号为L到R的硬币均反面朝上，则将其翻至正面朝上。
 * <p>
 * 其中操作①所需代价为x，操作②的代价为y，那么将所有硬币翻至正面朝上的总代价最少是多少？
 * <p>
 * 输入
 * 第一行包含三个整数N，x和y，1≤N≤10^5，1≤x，y≤10。
 * <p>
 * 第二行包含N个空格隔开的整数t1到tN，0≤ti≤1。若ti=0，则表示i号硬币初始时反面朝上；若ti=1，则表示i号硬币初始时正面朝上。
 * <p>
 * 输出
 * 输出总代价的最小值。
 * <p>
 * 样例
 * 输入：
 * <p>
 * 3 1 2
 * <p>
 * 0 1 0
 * <p>
 * 输出：
 * <p>
 * 2
 * ————————————————
 * 版权声明：本文为CSDN博主「Calotte_Lin」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/Calotte_Lin/article/details/105188172
 **/

public class Coin3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }
        int res = minSum(nums, x, y);
        System.out.print(res);
    }

    public static int minSum(int[] nums, int x, int y) {
        int[] dp = new int[nums.length + 1];
        dp[1] = nums[0] == 0 ? Math.min(x, y) : 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == nums[i - 1]) {
                dp[i + 1] = dp[i];
            } else {
                dp[i + 1] = dp[i] + Math.min(x, y);
            }
        }
        return dp[nums.length];
    }
}
