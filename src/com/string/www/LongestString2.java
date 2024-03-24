package com.string.www;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: JavaWorkSpace2->LongestString2
 * @description: 最长的子字符串长度值
 * @author: MaYuan
 * @create: 2020-02-09 17:03
 * @version: 1.0
 **/
public class LongestString2 {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (allUnique(s, i, j)) {
                    ans = Math.max(ans, j - i);
                }
            }
        }
        return ans;
    }


    /**
     * 用来判断字符串内的字符内容是否为互不相同的内容。
     * @param s
     * @param start
     * @param end
     * @return
     */
    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "leetcode";

        // 最长的不重复的子串长度是abc, 长度为3。
        String str2 = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring(str2));

    }
}




