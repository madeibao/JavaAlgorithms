package com.string.www;

/**
 * @ClassName LongestContinuousPalindrome2
 * @Author：Mayuan
 * @Date 2020/3/29 16:17
 * @Description TODO
 * @Version 1.0
 * <p>
 * 求最长的回文子序列的长度
 * 通过转化为求最长的公共子序列
 **/
public class LongestContinuousPalindrome2 {

    public static int Lcs(String s1, int n1, String s2, int n2) {
        int[][] dp = new int[n1 + 1][n2 + 1];
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[n1][n2];
    }

    public static int longestPalindromeSubseq(String s) {
        int len = s.length();
        String _s = new StringBuffer(s).reverse().toString();
        return Lcs(s, len, _s, len);
    }

    public static void main(String[] args) {
        String s = "bbbab";
        System.out.println(longestPalindromeSubseq(s));

    }
}
