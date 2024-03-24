package com.algorithm.www;

import java.util.Scanner;

/**
 * @program: JavaWorkSpace2->IntegerReverse
 * @description: 整数的逆置
 * @author: MaYuan
 * @create: 2020-01-06 21:42
 * @version: 1.0
 **/
public class IntegerReverse {

    private static int reverseInt(int num) {
        int result = 0;
        while (num != 0) {
            result = result * 10 + num % 10;
            num /= 10;
            if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverseInt(num));
    }
}
