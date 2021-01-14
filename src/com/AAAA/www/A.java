package com.AAAA.www;

import java.util.HashSet;

/**
 * @program: Pro1->A
 * @description: 基本测试文件
 * @author: MaYuan
 * @create: 2019-12-21 20:06
 * @version: 1.0
 **/

public class A {

    private static int maxLength(String strs) {
        int left=0, right=0;
        HashSet<Character> set2 = new HashSet<>();
        int res = 0;
        for(left=0,right=0;right<strs.length();right++) {
            char temp = strs.charAt(right);
            while (set2.contains(temp)) {

                // 只要是包含这个内容，就把左面指针来进行移动。
                set2.remove(strs.charAt(left++));
            }
            set2.add(temp);
            res = Math.max(res, right-left+1);
        }
        return res;
    }
    public static void main(String[] args) {
        String str2 ="abcabcbb";
        System.out.println(maxLength(str2));
    }
}
