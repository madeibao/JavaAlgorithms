package com.algorithm.www;

import java.util.Scanner;

/**
 * @program: JavaWorkSpace2->RotateNumber
 * @description: 数字旋转之后仍然相同的内容
 * @author: MaYuan
 * @create: 2020-02-06 15:04
 * @version: 1.0
 **/
public class RotateNumber {
    public static int rotatedDigits(int N) {
        // Count how many n in [1, N] are good.
        int ans = 0;
        for (int n = 1; n <= N; ++n) {
            if (good(n, false)) {
                System.out.println(n);
                ans++;
            }
        }
        return ans;
    }

    // Return true if n is good.
    // The flag is true iff we have an occurrence of 2, 5, 6, 9.

    public static boolean good(int n, boolean flag) {
        if (n == 0) {
            return flag;
        }

        int d = n % 10;
        if (d == 3 || d == 4 || d == 7) return false;
        if (d == 0 || d == 1 || d == 8) return good(n / 10, flag);
        return good(n / 10, true);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(rotatedDigits(num));
    }
}
