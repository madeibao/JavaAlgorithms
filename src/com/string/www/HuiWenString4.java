package com.string.www;

/**
 * @ClassName HuiWenString4
 * @Author：Mayuan
 * @Date 2020/5/8 20:17
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断是否为回文字符串
 * 最多删除一个字符
 **/
public class HuiWenString4 {
    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String temp = "abac";
        String str2 = "abda";
        System.out.println(validPalindrome(str2));
    }
}
