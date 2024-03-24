package com.ACompany.www;

/**
 * @ClassName Jump2
 * @Author：Mayuan
 * @Date 2020/8/9 9:49
 * @Description TODO
 * @Version 1.0
 * <p>
 * 网易跳柱子，从
 * 链接：https://www.nowcoder.com/questionTerminal/f02fe9dda1c443bdbe14b5775727124f?orderByHotValue=0&amp;questionTypes=000100&amp;page=1&amp;onlyReference=false
 * 来源：牛客网
 * 输入
 * 1
 * 5 3
 * 6 2 4 3 8
 * 输出
 * YES
 **/

import java.util.*;

public class Jump2 {
    public static boolean solution(int[] nums, int k) {
        int n = nums.length;
        boolean[][] dp = new boolean[n][2];
        dp[0][0] = true;
        dp[0][1] = true;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= k && i - j >= 0; j++) {
                if (nums[i - j] >= nums[i]) {
                    dp[i][0] |= dp[i - j][0];
                    dp[i][1] |= dp[i - j][1];
                }
                dp[i][1] |= dp[i - j][0];
            }
        }

        // 返回最后的一个位置的值。
        return dp[n - 1][0] || dp[n - 1][1];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int i = 0; i < T; i++) {
            int n = input.nextInt();
            int k = input.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = input.nextInt();
            }
            if (solution(nums, k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}