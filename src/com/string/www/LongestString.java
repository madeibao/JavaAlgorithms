package com.string.www;

import java.util.Arrays;

/**
 * @program: JavaWorkSpace2->LongestString
 * @description: 最长的字符串内容，不含重复的字符
 * @author: MaYuan
 * @create: 2020-02-09 16:54
 * @version: 1.0
 * 不含有重复字符的最长的字符串长度值。
 **/
public class LongestString {

    public static int lengthOfLongestSubstring(String s) {
        int[] m = new int[256];
        Arrays.fill(m, -1);
        int res = 0, left = -1;
        for (int i = 0; i < s.length(); ++i) {
            left = Math.max(left, m[s.charAt(i)]);
            m[s.charAt(i)] = i;
            res = Math.max(res, i - left);
        }
        return res;
    }

    public static void main(String[] args) {

        String s = "leetcode";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
