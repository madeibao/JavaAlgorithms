package com.algorithm.www;

import java.util.Scanner;

/**
 * @ClassName NuberAdd2
 * @Author：Mayuan
 * @Date 2020/6/20 21:56
 * @Description TODO
 * @Version 1.0
 * <p>
 * 两个26进制的数字的值来相加。
 **/

public class NumberAdd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int[] as = charToint(a.toCharArray());
        int[] bs = charToint(b.toCharArray());
        if (as.length >= bs.length) {
            add(as, bs);
        } else {
            add(bs, as);
        }
    }


    /**永远保持的是前面的数组长度比较大。*/
    private static void add(int[] a, int[] b) {
        int jw = 0;
        for (int i = 0; i < b.length; i++) {
            int tmp = a[a.length - i - 1] + b[b.length - i - 1] + jw;
            a[a.length - i - 1] = tmp % 26;
            jw = tmp / 26;
        }

        for (int i = b.length; i < a.length; i++) {
            if (jw == 0) {
                break;
            }
            int tmp = a[a.length - i - 1] + jw;
            a[a.length - i - 1] = tmp % 26;
            jw = tmp / 26;
        }

        if (jw != 0) {
            System.out.print((char) (jw + 'a'));
            syso(a);
        } else {
            syso(a);
        }

    }

    private static void syso(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print((char) (a[i] + 'a'));
        }
    }

    private static int[] charToint(char[] arr1) {
        int[] result = new int[arr1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr1[i] - 'a';
        }
        return result;
    }
}
