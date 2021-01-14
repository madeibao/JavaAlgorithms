package com.string.www;

/**
 * @ClassName LongestContinuousPalindrome
 * @Author：Mayuan
 * @Date 2020/3/29 16:11
 * @Description TODO
 * @Version 1.0
 * <p>
 * 最长的连续字符的回文字符串
 * 动态规划的思想。
 **/
public class LongestContinuousPalindrome {

    public static int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] f = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            f[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    f[i][j] = f[i + 1][j - 1] + 2;
                } else {
                    f[i][j] = Math.max(f[i + 1][j], f[i][j - 1]);
                }
            }
        }
        return f[0][n - 1];
    }

    public static void main(String[] args) {

        String s = "bbbab";
        System.out.println(longestPalindromeSubseq(s));
    }
}
