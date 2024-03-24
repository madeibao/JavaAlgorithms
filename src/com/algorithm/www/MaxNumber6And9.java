package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->MaxNumber6And9
 * @description: 6和9的组成的最大的数字
 * @author: MaYuan
 * @create: 2020-01-28 11:58
 * @version: 1.0
 **/
public class MaxNumber6And9 {
    public static int maximum69Number(int num) {
        int res = num;
        char[] chars = String.valueOf(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                res = Math.max(res, Integer.parseInt(String.valueOf(chars)));
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maximum69Number(996));
    }
}




