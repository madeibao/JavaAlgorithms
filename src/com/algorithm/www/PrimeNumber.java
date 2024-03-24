package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->PrimeNumber
 * @description: 小于某一个数的质数的数量
 * @author: MaYuan
 * @create: 2019-12-26 19:57
 * @version: 1.0
 **/
public class PrimeNumber {
    /**
     * 下面的方法会超出时间限制。
     *
     * @param num
     * @return
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

    public int countPrimes(int n) {
        int result = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                result += 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new PrimeNumber().countPrimes(10));
    }
}
