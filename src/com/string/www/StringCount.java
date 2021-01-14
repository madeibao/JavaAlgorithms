package com.string.www;

import java.util.Scanner;

/**
 * @ClassName StringCount
 * @Author：Mayuan
 * @Date 2020/10/24 20:22
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的计数
 * 计算一个字符串在另一个字符串中的出现的次数
 **/
public class StringCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str2 = sc.next();
        String str3 = sc.next();
        System.out.println(cha(str2, str3));
    }

    private static int cha(String s, String a) {

        int count = 0;
        int index = s.indexOf(a);
        while (index != -1) {
            count++;
            index = index + a.length();
            index = s.indexOf(a, index);
        }
        return count;
    }
}
