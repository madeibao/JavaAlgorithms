package com.string.www;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName MaxSubStringLen
 * @Author：Mayuan
 * @Date 2021/1/5/0005 11:03
 * @Description TODO
 * @Version 1.0
 *
 *
 * 包含不重复字符的最大的长度。
 *
 **/
public class MaxSubStringLen {

    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        Set<Character> set = new HashSet<>();
        for(int l = 0, r = 0; r < s.length(); r++) {

            // 如果包含有右面的节点的值。
            char c = s.charAt(r);
            while(set.contains(c)) {

                // 左指针不断的向右面移动。
                set.remove(s.charAt(l++));
            }
            set.add(c);
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
