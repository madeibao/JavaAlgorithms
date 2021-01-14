package com.string.www;

/**
 * @ClassName HuiWenString3
 * @Author：Mayuan
 * @Date 2020/3/17 16:11
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断是否为回文字符串
 **/
public class HuiWenString3 {

    static boolean isPalidrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s2 = "a";
        System.out.println(isPalidrome(s2));
    }
}


