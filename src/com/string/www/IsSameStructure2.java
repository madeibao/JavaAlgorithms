package com.string.www;

/**
 * @ClassName IsSameStructure2
 * @Author：Mayuan
 * @Date 2020/10/10 21:43
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断字符串是否为相同的结构。
 * abb 和cdd 是相同的构造的结构。
 **/
public class IsSameStructure2 {

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
        String a = "abb";
        String b = "cdd";
        System.out.println(isIsomorphic(a, b));
    }
}
