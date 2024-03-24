package com.algorithm.www;

/**
 * @ClassName PrimeNumber4
 * @Author：Mayuan
 * @Date 2020/6/23 21:40
 * @Description TODO
 * @Version 1.0
 * <p>
 * 计数质数的问题4
 * 小于非负的整数的n的质数的数量。
 **/
public class PrimeNumber4 {
    private static int countPrimes(int n) {
        int[] a = new int[n + 1];
        int count = 0;
        for (int i = 2; i < n; i++) {
            a[i] = 1;
        }
        for (int i = 2; i < n; i++) {
            if (a[i] != 0) {
                count++;
                for (int j = 2 * i; j < n; j += i) {
                    a[j] = 0;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}
