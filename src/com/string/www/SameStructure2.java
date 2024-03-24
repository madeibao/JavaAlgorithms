package com.string.www;

import java.util.Arrays;

/**
 * @ClassName SameStructure2
 * @Author：Mayuan
 * @Date 2020/10/16 19:41
 * @Description TODO
 * @Version 1.0
 * 判断两个字符串是否可以通过位置的移动来实现变换。
 **/
public class SameStructure2 {

    public static boolean isSameStructure(String t, String s) {
        char[] strt = t.toCharArray();
        char[] strs = s.toCharArray();
        Arrays.sort(strt);
        Arrays.sort(strs);
        return Arrays.equals(strt, strs);

    }

    public static void main(String[] args) {

        String s = "anagram", t = "nagaram";
        System.out.println(isSameStructure(s, t));
    }
}
