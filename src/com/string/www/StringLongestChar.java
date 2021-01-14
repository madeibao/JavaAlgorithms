package com.string.www;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName StringLongestChar
 * @Author：Mayuan
 * @Date 2021/1/2/0002 10:30
 * @Description TODO
 * @Version 1.0
 *
 * 不包含重复字符的最长的字符串长度。
 * leetcode 3
 *
 *
 **/
public class StringLongestChar {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        int end=0,start=0;
        Set<Character> set=new HashSet<>();
        // 开始和结尾都小于 n 的长度值。
        while(start<n && end<n){
            if(set.contains(s.charAt(end))){
                set.remove(s.charAt(start++));
            }
            else {
                set.add(s.charAt(end++));
                res=Math.max(res,end-start);
            }
        }
        return res;
    }

    public static void main(String[] args) {

        String str2 = "abcabcbb";
        System.out.println(new StringLongestChar().lengthOfLongestSubstring(str2));
    }
}
