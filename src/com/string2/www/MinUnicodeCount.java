package com.string2.www;

/**
 * @ClassName MinUnicodeCount
 * @Author：Mayuan
 * @Date 2024/11/9/星期六 19:05
 * @Description TODO
 * @Version 1.0
 **/
public class MinUnicodeCount {

    public int minimumDeleteSum(String s1, String s2) {

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] + s1.codePointAt(i - 1);
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] + s2.codePointAt(j - 1);
        }

        for (int i = 1; i <= m; i++) {
            int codeA = s1.codePointAt(i - 1);
            for (int j = 1; j <= n; j++) {
                int codeB = s2.codePointAt(j - 1);
                if (codeA == codeB) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + codeA, dp[i][j - 1] + codeB);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "sea", s2 = "eat";
        MinUnicodeCount muc = new MinUnicodeCount();
        System.out.println(muc.minimumDeleteSum(s1, s2));
    }
}
