package com.string.www;

/**
 * @ClassName RotateString3
 * @Author：Mayuan
 * @Date 2020/10/10 15:22
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的旋转操作。
 **/
public class RotateString3 {

    public static String rotate(String s, int n) {
        return n >= s.length() ? s : s.substring(n) + s.substring(0, n);
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        int k = 2;
        System.out.println(rotate(str, k));
    }
}
