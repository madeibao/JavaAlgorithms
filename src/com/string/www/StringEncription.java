package com.string.www;

import java.util.Scanner;

/**
 * @ClassName StringEncription
 * @Author：Mayuan
 * @Date 2020/3/27 17:05
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的加密和解密
 * <p>
 * 题目描述
 * 1、对输入的字符串进行加解密，并输出。
 * <p>
 * 2加密方法为：
 * <p>
 * 当内容是英文字母时则用该英文字母的后一个字母替换，同时字母变换大小写,如字母a时则替换为B；字母Z时则替换为a；
 * <p>
 * 当内容是数字时则把该数字加1，如0替换1，1替换2，9替换0；
 * <p>
 * 其他字符不做变化。
 * <p>
 * 3、解密方法为加密的逆过程。
 * <p>
 * <p>
 * <p>
 * 接口描述：
 * <p>
 * 实现接口，每个接口实现1个基本操作：
 * <p>
 * void Encrypt (char aucPassword[], char aucResult[])：在该函数中实现字符串加密并输出
 * <p>
 * 说明：
 * <p>
 * 1、字符串以\0结尾。
 * <p>
 * 2、字符串最长100个字符。
 * <p>
 * <p>
 * <p>
 * int unEncrypt (char result[], char password[])：在该函数中实现字符串解密并输出
 * <p>
 * 说明：
 * <p>
 * 1、字符串以\0结尾。
 * <p>
 * 2、字符串最长100个字符。
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入描述:
 * 输入说明
 * 输入一串要加密的密码
 * 输入一串加过密的密码
 * <p>
 * 输出描述:
 * 输出说明
 * 输出加密后的字符
 * 输出解密后的字符
 * <p>
 * 示例1
 * 输入
 * 复制
 * abcdefg
 * BCDEFGH
 * 输出
 * 复制
 * BCDEFGH
 * abcdefg
 **/
public class StringEncription {

    public static char encryption(char c) {
        if (c >= 'a' && c < 'z')
            return (char) (c + 1 - 32);
        else if (c == 'z')
            return 'A';
        else if (c >= 'A' && c < 'Z')
            return (char) (c + 1 + 32);
        else if (c == 'Z')
            return 'a';
        else if (c >= '0' && c < '9')
            return (char) (c + 1);
        else if (c == '9')
            return '0';
        else
            return c;
    }

    public static char decryption(char c) {
        if (c > 'a' && c <= 'z')
            return (char) (c - 1 - 32);
        else if (c == 'a')
            return 'Z';
        else if (c > 'A' && c <= 'Z')
            return (char) (c - 1 + 32);
        else if (c == 'A')
            return 'z';
        else if (c > '0' && c <= '9')
            return (char) (c - 1);
        else if (c == '0')
            return '9';
        else
            return c;
    }

    public static String enCryption(String s) {
        char[] cs = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < cs.length; i++) {
            sb.append(encryption(cs[i]));
        }
        return sb.toString();
    }

    public static String deCryption(String s) {
        char[] cs = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < cs.length; i++) {
            sb.append(decryption(cs[i]));
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(enCryption(s1));
            System.out.println(deCryption(s2));
        }
        sc.close();
    }
}

