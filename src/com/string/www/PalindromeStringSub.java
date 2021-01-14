package com.string.www;

/**
 * @ClassName PalindromeStringSub
 * @Author：Mayuan
 * @Date 2020/7/4 20:00
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的首部和尾部来拼接，求出是否能构成回文。
 **/
public class PalindromeStringSub {

    public static boolean isHui(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (isHuiWen(s.substring(i, s.length()) + s.substring(0, i))) {
                return true;
            }
        }
        return false;
    }

    static boolean isHuiWen(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.toCharArray()[i] != s.toCharArray()[length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHui("aab"));
    }
}
