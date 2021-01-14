package com.string.www;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName UniqueChar
 * @Author：Mayuan
 * @Date 2020/2/18 14:31
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断字符串中的字符是否为独一无二的内容
 **/
public class UniqueChar {

    private static boolean isUnique(String s) {
        Set<Character> set2 = new HashSet<>();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            set2.add(c);
        }
        return set2.size() == s.length();
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(isUnique(s));
    }
}
