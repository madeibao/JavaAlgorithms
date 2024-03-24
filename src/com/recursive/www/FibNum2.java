package com.recursive.www;

import java.util.Scanner;

/**
 * @program: Pro1->FibNum2
 * @description: 非递归实现斐波那契数列
 * @author: MaYuan
 * @create: 2019-12-23 20:35
 * @version: 1.0
 * 1 1 2 3 5 8 13 21 34
 **/
public class FibNum2 {
    private static int getFibNum(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        int a, b, v;
        a = 1;
        b = 1;
        v = 0;
        for (int i = 3; i < num + 1; i++) {
            v = a + b;
            a = b;
            b = v;
        }
        return v;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(getFibNum(num));
        sc.close();
    }
}




