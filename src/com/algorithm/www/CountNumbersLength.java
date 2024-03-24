package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->CountNumbersLength
 * @description: 统计一个数字的长度
 * @author: MaYuan
 * @create: 2019-12-28 19:49
 * @version: 1.0
 **/
public class CountNumbersLength {
    public static void main(String[] args) {
        int num = 2323;
        int n = 0;
        while (num > 0) {
            num /= 10;
            n++;
        }
        System.out.println(n);
    }
}







