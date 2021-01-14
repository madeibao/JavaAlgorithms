package com.algorithm.www;

/**
 * @ClassName ReverseWords
 * @Author：Mayuan
 * @Date 2020/3/26 16:58
 * @Description TODO
 * @Version 1.0
 * <p>
 * 翻转单词的顺序，
 **/
public class ReverseWords {
    public static String reverseWords(String s) {
        String[] a = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = a.length - 1; i >= 0; i--) {
            if (!a[i].equals("")) {
                sb.append(a[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();

    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }

}
