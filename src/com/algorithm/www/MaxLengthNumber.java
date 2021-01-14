package com.algorithm.www;

import java.util.Scanner;

/**
 * @ClassName MaxLengthNumber
 * @Author：Mayuan
 * @Date 2020/2/20 22:02
 * @Description TODO
 * @Version 1.0
 * <p>
 * n位数字的最大值的内容
 **/
public class MaxLengthNumber {

    public static int[] printNumbers(int n) {
        if (n == 1) {
            return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        }
        int max = (int) Math.pow(10, n);
        int[] temp = new int[max - 1];
        int maxN = 0;
        while (n != 0) {
            maxN = maxN * 10 + 9;
            n--;
        }

        for (int i = 1; i <= max - 1; i++) {
            temp[i - 1] = i;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temp = printNumbers(n);
        for (int j : temp) {
            System.out.print(j + " ");
        }
    }
}
