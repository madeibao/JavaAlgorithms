package com.string.www;

/**
 * @program: JavaWorkSpace2->LongestPalindrome
 * @description: 最长的回文字符串内容
 * @author: MaYuan
 * @create: 2020-02-13 16:22
 * @version: 1.0
 * <p>
 * 给定一个字符串内容，然后求最长的回文字符串。
 * 这里采用的是中心扩展的算法来解决问题。
 **/

public class LongestPalindrome {

    private static String longestString(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {

            // 以每个字符为中心去扩展，例如"aba"就是以'b'为中心
            int len1 = expandAroundCenter(s, i, i);
            // 以两字母之间为中心去扩展，例如 "abba" 的中心在两个 'b'之间
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {

                // 左面的开始位置加上半个长度的距离。
                start = i - (len - 1) / 2;

                // 右面的位置上加上半个长度的距离。
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
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
        String s = "babad";
        String s2 = longestString(s);
        System.out.println(s2);
    }
}

