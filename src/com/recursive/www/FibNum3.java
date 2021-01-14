package com.recursive.www;

/**
 * @program: Pro1->FibNum3
 * @description: 利用数组的形式来获得斐波那契数列
 * @author: MaYuan
 * @create: 2019-12-23 20:45
 * @version: 1.0
 **/

public class FibNum3 {
    static int solutionFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else {
            if (n == 1) {
                return 1;
            } else {
                int[] result = new int[n + 1];
                result[0] = 0;
                result[1] = 1;
                for (int i = 2; i <= n; i++) {
                    result[i] = result[i - 1] + result[i - 2];
                }
                return result[n];
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solutionFibonacci(5));
    }
}



