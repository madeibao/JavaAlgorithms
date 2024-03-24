package com.string.www;

import java.util.Scanner;

/**
 * @ClassName LongestSubSequence
 * @Author：Mayuan
 * @Date 2020/6/16 14:10
 * @Description TODO
 * @Version 1.0
 * <p>
 * 最长的公共的子序列的长度值。
 * <p>
 * 求最长的公共的子序列，要求不一定是连续的。
 * 两个字符串中的共有的字符内容。
 * <p>
 *
abcbdab
bdcaba


 **/
public class LongestSubSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        LCSString(str1, str2);
    }

    public static void LCSString(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();

        //dp[i][j]表示的含义是：字符串s1的第i-1个位置长度的子串和字符串s2的第j-1位置处的子串的LCS长度
        //记录LCS长度大小
        int[][] dp = new int[n + 1][m + 1];
        //记录对应位置字符是否相等，1表示相等，2表示向上，3表示向左
        int[][] index = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= m; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    //相等记为1
                    index[i][j] = 1;
                } else if (dp[i - 1][j] >= dp[i][j - 1]) {
                    dp[i][j] = dp[i - 1][j];
                    //向上
                    index[i][j] = 2;
                } else {
                    dp[i][j] = dp[i][j - 1];
                    //将左
                    index[i][j] = 3;
                }
            }
        }

        /**
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print(index[i][j] + " ");
            }
            System.out.println();
        }
        **/

        StringBuilder ans = new StringBuilder();
        for (int i = n, j = m; i >= 0 && j >= 0; ) {
            if (index[i][j] == 1) {
                i--;
                j--;
                ans.append(s1.charAt(i));
            } else if (index[i][j] == 2) {
                i--;
            } else {
                j--;
            }
        }
        ans.reverse();
        System.out.println(ans);
    }
}
