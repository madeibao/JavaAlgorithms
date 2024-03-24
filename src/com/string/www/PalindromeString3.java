package com.string.www;

/**
 * @ClassName PalindromeString3
 * @Author：Mayuan
 * @Date 2020/4/15 17:26
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个字符串能否通过删除或者是添加字符串来变成一个回文的字符串的结果
 * 最多增加和删除一个字符来完成。
 *
 **/
public class PalindromeString3 {
    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isValid(s, i + 1, j) || isValid(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isValid(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        String str2 = "abab";
        System.out.println(validPalindrome(str2));

    }
}
