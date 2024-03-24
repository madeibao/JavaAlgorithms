package com.string.www;

/**
 * @ClassName FindChar
 * @Author：Mayuan
 * @Date 2024/3/10/0010 20:43
 * @Description TODO
 * @Version 1.0
 **/
public class FindChar {
    public static char findTheDifference(String s, String t) {

        int a = 0;
        int b = 0;
        for(int i=0;i<s.length();i++) {
            a+=getRes(s.charAt(i));
        }
        for(int i=0;i<t.length();i++) {
            b+=getRes(t.charAt(i));
        }

        return (char) ('a'+(b-a));
    }

    static int getRes(char c) {
        return c - 'a';
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "abcd";

        System.out.println(findTheDifference(s,t));
    }
}
