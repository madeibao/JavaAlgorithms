package com.string.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName StringNotRepeat
 * @Author：Mayuan
 * @Date 2021/3/16/0016 22:06
 * @Description TODO
 * @Version 1.0
 *
 * 最长的不重复字符串长度值。
 *
 **/
public class StringNotRepeat {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> hashmap = new HashMap<>();
        int left = 0, maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashmap.containsKey(c)) {
                left = Math.max(left, hashmap.get(c) + 1);
            }
            hashmap.put(c, i);
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcabab"));
    }
}



