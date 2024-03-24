package com.sort.www;

/**
 * @program: Pro1->BubbleSort2
 * @description: 冒泡排序
 * @author: MaYuan
 * @create: 2019-12-24 19:34
 * @version: 1.0
 **/
public class BubbleSort2 {
    /**
     * 最简单的实现方法
     */
    public static void bubbleSort(int[] a) {
        int n = a.length;
        // 一共n-1趟排序
        for (int i = 1; i < n; i++) {
            // 第i趟排序从第0个元素到第n-i个元素
            for (int j = 0; j < n - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    //冒泡排序的优化的算法1

    /**
     * 优化一：设置了一个boolean的标志flag，如果这趟排序发生了数据的交换，则flag置为true，否则flag置为false。
     *
     * @param a
     */
    public static void bubbleSort1(int[] a) {
        int n = a.length;
        // 第一次判断时，将flag置为true
        boolean flag = true;
        for (int i = 1; i < n && flag; i++) {
            // 每趟排序前先将flag置为false
            flag = false;
            for (int j = 0; j < n - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    // 表示有数据交换
                    flag = true;
                }
            }
        }
    }
    //冒泡排序的优化的算法二:

    /**
     * 优化二：在优化一的基础上增加了一个位置变量pos，用于记录这趟排序最后发生交换的位置，然后作为下一趟排序比较结束的位置
     *
     * @param a
     */
    public static void bubbleSort2(int[] a) {
        int n = a.length;
        boolean flag = true;
        // 最后一次发生交换的位置
        int rightPos = n;
        int right = n - 1;
        for (int i = 1; i < n && flag; i++) {
            flag = false;
            for (int j = 0; j < right; j++) {
                if (a[j] > a[j + 1]) {

                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                    // 记录发生交换的位置
                    rightPos = j;
                }
            }
            // 下一次只需比较到pos的位置即可
            right = rightPos;
        }
    }

    /**
     * 冒泡排序的优化算法3
     */
    public static void bubbleSort3(int[] a) {
        int n = a.length;
        boolean flag = true;
        // 左部分最后发生交换的位置
        int leftPos = 0;
        int left = 0;
        // 右部分最后一次发生交换的位置
        int rightPos = n;
        int right = n - 1;
        for (int i = 1; i < n; i++) {
            flag = false;
            // 从左向右扫描将最大值移到最后
            for (int j = 0; j < right; j++) {
                if (a[j] > a[j + 1]) {
                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                    // 记录发生交换的位置
                    rightPos = j;
                }
            }
            if (flag) {
                flag = false;
            } else {
                break;
            }
            right = rightPos;
            // 从右到左扫描将最小值移到最前面
            for (int j = right; j > left; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    flag = true;
                    leftPos = j;
                }
            }
            left = leftPos;
            if (!flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] num = {23, 2, 2, 34, 5, 6, 7, 8, 3, 2, 9, 39, 45, 56, 7, 8,};
        //调用方法。
        bubbleSort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
