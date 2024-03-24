package com.algorithm.www;

import java.util.Scanner;

/**
 * @program: JavaWorkSpace2->Gcd
 * @description: 最大公约数算法
 * @author: MaYuan
 * @create: 2019-12-25 20:26
 * @version: 1.0
 **/
public class Gcd {
    private static int gcd2(int p, int q) {
        if (q <= 0 || p <= 0) {
            return 0;
        }
        
        if (p < q) {
            int temp = p;
            p = q;
            q = temp;
        }

        if (p % q == 0) {
            return q;
        }
        else {
            return gcd2(q, p % q);
        }
    }

    /**
     * 其中a > b
     *
     * @param a
     * @param b
     * @return
     */
    public static int maxDivisor(int a, int b) {
        int n = a;
        int m = b;
        int r;
        while (m != 0) {
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }


    /**求最大的公约数的一行的写法 */

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        int a = scc.nextInt();
        int b = scc.nextInt();
        System.out.println(gcd2(a, b));
        System.out.println(maxDivisor(a, b));
        System.out.println(gcd(12, 24));
    }
}





