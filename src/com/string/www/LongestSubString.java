package com.string.www;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: JavaWorkSpace2->LongestSubString
 * @description: 最长的不含有重复字符的序列内容
 * @author: MaYuan
 * @create: 2020-01-16 18:56
 * @version: 1.0
 **/


public class LongestSubString {

    public static int lengthOfLongestSubstring(String s) {

        int n = s.length(), ans = 0;
        int[] index = new int[128];
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            //（下标 + 1） 代表 i 要移动的下个位置
            index[s.charAt(j)] = j + 1;
        }
        return ans;

    }

    /**
     * 一个字符串中的不包含有重复的字符的最长的内容。
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}