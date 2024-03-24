package com.string.www;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName LongestSubString2
 * @Author：Mayuan
 * @Date 2021/3/31/0031 19:26
 * @Description TODO
 * @Version 1.0
 *
 * 最长的无重复字符的子串
 *
 **/
public class LongestSubString2 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        int end=0,start=0;
        Set<Character> set=new HashSet<>();
        while(start<n && end<n){
            if(set.contains(s.charAt(end))){
                set.remove(s.charAt(start++));
            }else{
                set.add(s.charAt(end++));
                res=Math.max(res,end-start);
            }

        }
        return res;
    }

    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(new LongestSubString2().lengthOfLongestSubstring(str));
    }
}
