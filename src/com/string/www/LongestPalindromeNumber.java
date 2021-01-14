package com.string.www;

import java.util.Scanner;

/**
 * @ClassName LongestPalindromeNumber
 * @Author：Mayuan
 * @Date 2020/4/8 16:28
 * @Description TODO
 * @Version 1.0
 * <p>
 * 获取的式最大的回文字符串的长度值
 **/
public class LongestPalindromeNumber {

    private static int longestString(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {

            // 以每个字符为中心去扩展，例如"aba"就是以'b'为中心
            int len1 = expandAroundCenter(s, i, i);
            // 以两字母之间为中心去扩展，例如 "abba" 的中心在两个 'b'之间
            int len2 = expandAroundCenter(s, i, i + 1);

            // 求两个数字的最大值。
            int len = Math.max(len1, len2);
            if (len > end - start) {

                // 左面的开始位置加上半个长度的距离。
                start = i - (len - 1) / 2;
                // 右面的位置上加上半个长度的距离。
                end = i + len / 2;
            }
        }
        return end + 1 - start;
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(longestString(s));

        }
    }
}