package com.string.www;

/**
 * @program: JavaWorkSpace2->BasicString
 * @description: 基本的字符串
 * @author: MaYuan
 * @create: 2020-02-11 21:17
 * @version: 1.0
 **/
public class BasicString {

    public static void main(String[] args) {
        String s = "aa";
        // aaaa
        System.out.println((s + s).indexOf(s, 0));

        String str2 = "abcdefg";

        // 包括开始和包括结尾的内容。
        System.out.println(str2.substring(0, 4));
    }
}
