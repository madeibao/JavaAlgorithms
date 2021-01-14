package com.sort.www;

/**
 * @ClassName ShellSort
 * @Author：Mayuan
 * @Date 2020/2/24 21:41
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java希尔排序
 **/
public class ShellSort {

    public static void shellSort(int[] a) {
        int N = a.length;
        // 希尔增量
        for (int h = N / 2; h > 0; h /= 2) {
            for (int i = h; i < N; i++) {
                //将a[i]插入到a[i-h],a[i-2h],a[i-3h]...中
                for (int j = i; j >= h && a[j] < a[j - h]; j -= h) {
                    int temp = a[j];
                    a[j] = a[j - h];
                    a[j - h] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 6, 7, 11, 5, 12, 3, 0, 1};
        shellSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
