package com.algorithm.www;

/**
 * @ClassName MinCoin
 * @Author：Mayuan
 * @Date 2020/8/9 22:07
 * @Description TODO
 * @Version 1.0
 * <p>
 * 换零钱
 * <p>
 * 3 20
 * 5 2 3
 * <p>
 * 输出：
 * 4
 * <p>
 * <p>
 * 3张硬币 无限数量
 * 20 总金额
 * 5 元，2元，3元
 * 最少的数量。
 **/

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinCoin {
    public static int getMinMoneyCount(int[] arr, int target) {
        if (target <= 0 || arr.length <= 0) {
            return -1;
        }
        int length = arr.length;
        int[] dp = new int[target + 1];
        // 首先填充一个默认的值。
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 0; i < length; i++) {
            for (int j = arr[i]; j <= target; j++) {
                if (dp[j - arr[i]] != -1) {
                    if (dp[j] == -1) {
                        dp[j] = dp[j - arr[i]] + 1;
                    } else {
                        dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
                    }
                }
            }
        }
        return dp[target];
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] param = bufferedReader.readLine().split(" ");
        int len = Integer.valueOf(param[0]);
        int target = Integer.valueOf(param[1]);
        String[] numbers = bufferedReader.readLine().split(" ");
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = Integer.valueOf(numbers[i]);
        }
        System.out.println(getMinMoneyCount(array, target));
    }
}