package com.string.www;

import java.util.HashMap;

/**
 * @ClassName LongestPalindrome2
 * @Author：Mayuan
 * @Date 2020/3/19 18:32
 * @Description TODO
 * @Version 1.0
 * <p>
 * 最长的回文字符串长度
 * 一个字符串中的最长的回文字符串的长度值。
 **/
public class LongestPalindrome2 {
    /**
     * 下面的方法是使用数组实现的，
     * 我们首先定义一个大小为58的数组(58 = 122 - 65 + 1 | 122是z, 65是A) 之后按照我们的思路进行书写即可
     *
     * @param s
     * @return
     */
    public static int longestPalindrome2(String s) {
        int[] character = new int[58];
        int result = 0;
        for (char c : s.toCharArray()) {
            character[c - 'A']++;
        }

        for (int i = 0; i < 58; i++) {
            if (character[i] % 2 == 0)
                result += character[i];
            else
                result += character[i] - 1;
        }

        return result >= s.length() ? result : result + 1;
    }

    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0;
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character key : map.keySet()) {
            int count = map.get(key);
            if (count % 2 == 0)
                result += map.get(key);
            else
                result += map.get(key) - 1;
        }

        return result < s.length() ? result + 1 : result;
    }

    public static void main(String[] args) {
        String s = "abccccdddd";
        System.out.println(longestPalindrome(s));
    }
}
