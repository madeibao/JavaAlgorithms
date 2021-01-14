package com.string.www;

/**
 * @ClassName StringCompareTo
 * @Author：Mayuan
 * @Date 2020/5/8 20:58
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的比较方法
 **/
public class StringCompareTo {

    public static void main(String[] args) {
        String s2 = "abc";
        String s3 = "ILoveU";
        // 24
        System.out.println(s2.compareTo(s3));

        String str1 = "aIloveU520";
        String str2 = "abc";
        System.out.println(str1.compareTo(str2));

        String str3 = "ljj";
        String str4 = "ljjLovexql";
        System.out.println(str3.compareTo(str4));
    }
}
