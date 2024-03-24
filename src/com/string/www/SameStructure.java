package com.string.www;

/**
 * @ClassName SameStructure
 * @Author：Mayuan
 * @Date 2020/5/3 18:30
 * @Description TODO
 * @Version 1.0
 * 判断是否为同构的字符串的结果值。
 * <p>
 * abb
 * cdd 是同构的字符串。
 **/
public class SameStructure {
    public static boolean isIsomorphic(String s, String t) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (s.indexOf(a) != t.indexOf(b)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("abb", "cdd"));
    }
}
