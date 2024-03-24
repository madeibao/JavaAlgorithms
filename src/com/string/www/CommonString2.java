package com.string.www;

import java.util.Scanner;

/**
 * @ClassName CommonString2
 * @Author：Mayuan
 * @Date 2020/6/15 21:04
 * @Description TODO
 * @Version 1.0
 * <p>
 * 两个字符串的公共字符串内容。
 * 题目描述
 * 查找两个字符串a,b中的最长公共子串。若有多个，输出在较短串中最先出现的那个。
 * 输入描述:
 * 输入两个字符串
 * 输出描述:
 * 返回重复出现的字符
 * 示例1
 * 输入
 * 复制
 * abcdefghijklmnop
 * abcsafjklmnopqrstuvw
 * 输出
 * 复制
 * jklmnop
 //
1AB2345CD
12345EF
2345

 **/
public class CommonString2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            String max = s1.length() >= s2.length() ? s1 : s2;
            String min = s1.length() >= s2.length() ? s2 : s1;
            int l = 0;
            String s = "";


            for (int i = 0; i < min.length(); i++) {
                for (int j = i + 1; j <= min.length(); j++) {
                    if (max.contains(min.substring(i, j)) && j - i > l) {
                        l = j - i;
                        s = min.substring(i, j);
                    }
                }
            }
            System.out.println(s);
        }
    }
}
