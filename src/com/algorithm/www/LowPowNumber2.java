package com.algorithm.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName LowPowNumber2
 * @Author：Mayuan
 * @Date 2020/4/7 21:24
 * @Description TODO
 * @Version 1.0
 * <p>
 * 小于一个数字的最大的平方数字。
 **/

public class LowPowNumber2 {
    public static void main(String[] args) throws IOException {
        String s;
        long n, i, j = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        s = bufferedReader.readLine();
        n = Integer.parseInt(s);
        for (i = 1; i <= Math.sqrt(n); i++) {
            long square = i * i;
            if (square > n) {
                break;
            }
            if (square > j) {
                j = square;
            }

        }
        System.out.println(j);
    }
}
