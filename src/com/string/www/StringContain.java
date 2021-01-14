package com.string.www;

import java.util.Scanner;

/**
 * @ClassName StringContain
 * @Author：Mayuan
 * @Date 2020/4/14 11:46
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断一个字符串中的所有的字符是否包含在另一个字符串中
 * 默认的输入是通过大写来进行。
 * BBDDCFFEL
 * LCEFB
 * true
 * <p>
 * 第二个字符串中的所有的字符均包含在第一个字符串中
 **/
public class StringContain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int[] arr = new int[26];
        boolean flag = true;
        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i) - 'A'] = 1;
        }

        for (int i = 0; i < str2.length(); i++) {
            int temp2 = str2.charAt(i) - 'A';
            if (arr[temp2] != 1) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
        sc.close();
    }
}
