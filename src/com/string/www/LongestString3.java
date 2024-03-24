package com.string.www;

import java.util.Scanner;

/**
 * @ClassName LongestString3
 * @Author：Mayuan
 * @Date 2020/6/19 15:16
 * @Description TODO
 * @Version 1.0
 * <p>
 * 有重复字符的最长的子串。
 * 有重复的字符，并且是连续的，最长的子串，如果多个，输出ascii码最小的那个。
 * 题目：
 * 给定一串字符，里面有些字符有连续出现的特点，请寻找这些连续出现字符中最长的串，
 * 如果最长的串有多个，请输出字符ASCII码最小的那一串。
 * 例如：输入aaabbbbbcccccccczzzzzzzz，输出cccccccc。
 **/

public class LongestString3 {
    public static String maxRepat(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        int start = 0, end = 1, maxStart = 0, maxEnd = 1, len = 0;
        char[] chars = str.toCharArray();
        for (int i = 1; i <= chars.length; i++) {

            if (((i != chars.length) && (chars[i - 1] != chars[i])) || i == chars.length) {
                end = i;
                len = end - start;
                // 如果字符串的截取长度相等，但是ascii码比较小的情况下，那么输出最小的。
                if (len > (maxEnd - maxStart) || ((len == (maxEnd - maxStart)) && ((int) chars[start] < (int) chars[maxStart]))) {
                    maxStart = start;
                    maxEnd = end;
                }
                start = end;
            }
        }
        return str.substring(maxStart, maxEnd);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();
        System.out.println(maxRepat(st));
    }
}