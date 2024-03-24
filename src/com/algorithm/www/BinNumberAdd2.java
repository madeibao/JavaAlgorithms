package com.algorithm.www;

/**
 * @ClassName BinNumberAdd2
 * @Author：Mayuan
 * @Date 2020/11/15 19:15
 * @Description TODO
 * @Version 1.0
 * <p>
 * 二进制的相加。
 **/
public class BinNumberAdd2 {

    public static String add(String a, String b) {
        if (a == null || a.length() == 0) {
            return b;
        }
        if (b == null || b.length() == 0) {
            return a;
        }

        int c = 0;
        StringBuilder sb = new StringBuilder();
        int len2 = a.length() - 1;
        int len3 = b.length() - 1;
        while (len2 >= 0 || len3 >= 0) {
            if (len2 >= 0) {
                c += a.charAt(len2--) - '0';
            }
            if (len3 >= 0) {
                c += b.charAt(len3--) - '0';
            }
            sb.insert(0, c % 2);
            c >>= 1;
        }

        String res = sb.toString();
        return c > 0 ? '1' + res : res;
    }

    public static void main(String[] args) {
        String str1 = "11";
        String str2 = "11";
        System.out.println(add(str1, str2));
    }
}
