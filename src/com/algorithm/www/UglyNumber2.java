package com.algorithm.www;

import java.util.Arrays;

/**
 * @program: JavaWorkSpace2->UglyNumber2
 * @description: 超级丑数的计算
 * @author: MaYuan
 * @create: 2020-02-14 11:37
 * @version: 1.0
 **/
public class UglyNumber2 {

    public static int nthSuperUglyNumber(int n, int[] primes) {

        if (n <= 0 || primes == null || primes.length == 0) {
            return -1;
        }

        int lengthOfPrime = primes.length;
        //to indicate the location in the uglyNum of each prime
        int[] primeLocation = new int[lengthOfPrime];
        for (int i = 0; i < lengthOfPrime; i++)
            // set all the location to indicate the first location
            primeLocation[i] = 0;
        int[] uglyNum = new int[n];
        uglyNum[0] = 1;

        for (int i = 1; i < n; i++) {

            int min = uglyNum[primeLocation[0]] * primes[0];
            for (int j = 1; j < lengthOfPrime; j++) {
                if (uglyNum[primeLocation[j]] * primes[j] < min) {
                    min = uglyNum[primeLocation[j]] * primes[j];
                }
            }
            for (int j = 0; j < lengthOfPrime; j++) {
                if (uglyNum[primeLocation[j]] * primes[j] == min) {
                    primeLocation[j] += 1;
                }
            }
            uglyNum[i] = min;
        }

        System.out.println(Arrays.toString(uglyNum));
        return uglyNum[n - 1];
    }

    public static void main(String[] args) {

        int n = 12;
        int[] nums = {2, 7, 13, 19};
        System.out.println(nthSuperUglyNumber(n, nums));
    }
}