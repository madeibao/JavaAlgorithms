package com.string.www;

import java.util.Scanner;

/**
 * @ClassName CommonString5
 * @Author：Mayuan
 * @Date 2020/6/16 20:44
 * @Description TODO
 * @Version 1.0
 * <p>
 * 最长的公共子串。
 **/
public class CommonString5 {
    public static String common(String s1, String s2) {
        int[][] dp = new int[s1.length()][s2.length()];

        for (int j = 0; j < s2.length(); j++) {
            if (s1.charAt(0) == s2.charAt(j)) {
                dp[0][j] = 1;
            }
        }

        for (int j = 0; j < s1.length(); j++) {
            if (s1.charAt(j) == s2.charAt(0)) {
                dp[j][0] = 1;
            }
        }

        int maxLen = 0, maxEnd = 0;

        for (int i = 1; i < s1.length(); i++) {
            for (int j = 1; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }

                if (dp[i][j] > maxLen) {
                    maxLen = dp[i][j];
                    maxEnd = i;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        if (maxLen == 0) {
            return "-1";
        } else {
            for (int i = maxEnd - maxLen + 1; i <= maxEnd; i++) {
                sb.append(s1.charAt(i));
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(common(str1, str2));
    }
}
