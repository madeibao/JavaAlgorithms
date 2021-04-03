package com.string.www;

import java.util.Scanner;

/**
 * @ClassName CommonSequence
 * @Author：Mayuan
 * @Date 2021/3/29/0029 10:29
 * @Description TODO
 * @Version 1.0
 *
 * 最长的公共子序列。
 *
 **/
public class CommonSequence {
    public static String LCS (String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        int [][] dp = new int[len1 + 1][len2 + 2];
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                boolean isEqual = s1.charAt(i - 1) == s2.charAt(j - 1);
                if (isEqual) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        StringBuffer buffer = new StringBuffer();
        int i = len1;
        int j = len2;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                buffer.insert(0, s1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i-1][j] > dp[i][j-1])  {
                i--;
            } else {
                j--;
            }
        }
        if (buffer.length() == 0)  {
            return "-1";
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(LCS(str1, str2));
    }
}
