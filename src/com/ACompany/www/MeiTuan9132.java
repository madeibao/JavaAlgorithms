package com.ACompany.www;

import java.util.Scanner;

/**
 * @ClassName MeiTuan9132
 * @Author：Mayuan
 * @Date 2020/9/13 14:26
 * @Description TODO
 * @Version 1.0
 **/

public class MeiTuan9132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        int[][] array;

        while (sc.hasNext()) {
            n = sc.nextInt();
            m = sc.nextInt();
            array = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = sc.nextInt();
                }
            }
            method(n, m, array);
        }
    }

    public static void method(int n, int m, int[][] array) {
        int num = n;
        while (num > 0) {
            if (num % 2 == 1) {
                print1(num, m, array);
                break;
            }

            int left = 0;
            int right = num - 1;
            boolean flag = true;
            while (left < right) {
                if (!isMatch(left, right, array)) {
                    flag = false;
                    break;
                }
                left++;
                right--;
            }
            if (flag) {
                num /= 2;
            } else {
                print1(num, m, array);
                break;
            }
        }
    }

    public static boolean isMatch(int i, int j, int[][] array) {
        for (int k = 0; k < array[0].length; k++) {
            if (array[i][k] != array[j][k]) {
                return false;
            }
        }
        return true;
    }

    public static void print1(int n, int m, int[][] array) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
