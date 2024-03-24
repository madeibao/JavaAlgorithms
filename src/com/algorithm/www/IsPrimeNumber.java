package com.algorithm.www;

/**
 * @program: Pro1->IsPrimeNumber
 * @description: 判断是否为素数
 * @author: MaYuan
 * @create: 2019-12-25 20:03
 * @version: 1.0
 * 给定一个数字，判断是否为素数。
 **/
public class IsPrimeNumber {

    /**
     * 常规的方法1的内容。
     */
    private static boolean isPrime(int num) {
        int temp = (int) Math.sqrt(num);
        for (int i = 2; i <= temp; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int num) {
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime2(13));
    }
}
