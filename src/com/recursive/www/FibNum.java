package com.recursive.www;

import java.util.Scanner;

/**
 * @program: Pro1->Fibona
 * @description: 斐波那契数列
 * @author: MaYuan
 * @create: 2019-12-23 20:30
 * @version: 1.0
 **/
public class FibNum {

    private static int getNum(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else {
            return getNum(num - 1) + getNum(num - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(getNum(num));
        System.out.println("斐波那契数列的前面的20项目");
        for (int j = 1; j <= 20; j++) {
            System.err.print(getNum(j) + " ");
            if (j % 5 == 0) {
                System.out.print("\n");
            }
        }
        sc.close();
    }
}
