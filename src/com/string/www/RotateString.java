package com.string.www;

/**
 * @ClassName RotateString
 * @Author：Mayuan
 * @Date 2020/2/21 22:53
 * @Description TODO
 * @Version 1.0
 * <p>
 * 旋转字符串
 **/
public class RotateString {

    private static String rotate(String s, int n) {
        String str1 = s.substring(0, n);
        String str2 = s.substring(n);
        StringBuilder sb = new StringBuilder();
        sb.append(str2).append(str1);
        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "abcdefghijklmn";
        int n = 3;
        System.out.println(rotate(str, n));
    }
}
