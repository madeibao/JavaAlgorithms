package com.recursive.www;

/**
 * @program: Pro1->QuanPaiLie
 * @description: 数组的全排列
 * @author: MaYuan
 * @create: 2019-12-23 20:48
 * @version: 1.0
 **/
public class QuanPaiLie {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        getArray(arr, 0);
        System.out.println(count);
    }

    private static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void getArray(int[] a, int b) {
        if (b >= a.length) {
            count += 1;
            System.out.println(java.util.Arrays.toString(a));
        }

        for (int i = b; i < a.length; i++) {
            exchange(a, i, b);
            getArray(a, b + 1);
            exchange(a, i, b);
        }
    }
}
