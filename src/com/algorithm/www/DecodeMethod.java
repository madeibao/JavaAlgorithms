package com.algorithm.www;

import java.util.Scanner;

/**
 * @program: JavaWorkSpace2->DecodeMethod
 * @description: 解码方法
 * @author: MaYuan
 * @create: 2020-02-06 16:52
 * @version: 1.0
 **/
public class DecodeMethod {

    public static int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int len = s.length();

        int help = 1;
        int res = 0;
        if (s.charAt(len - 1) != '0') {
            res = 1;
        }
        for (int i = len - 2; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                help = res;
                res = 0;
                continue;
            }
            if ((s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0') <= 26) {
                res += help;
                //help用来存储res以前的值
                help = res - help;
            } else {
                help = res;
            }
        }
        return res;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(numDecodings(str));
    }

}
