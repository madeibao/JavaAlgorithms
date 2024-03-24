package com.sort.www;

/**
 * @program: Pro1->InsertSort2
 * @description: 直接插入排序
 * @author: MaYuan
 * @create: 2019-12-24 22:00
 * @version: 1.0
 **/

public class InsertSort2 {

    public static void insertSort(int[] arr) {
        int j = 0;
        //临时变量
        int temp = 0;
        //从第二数开始比较
        for (int i = 1; i < arr.length; i++) {
            //将当前数插入到已经有序的数组中
            temp = arr[i];
            for (j = i - 1; j >= 0; j--) {
                //如果前面的数大于当前数,将他后移
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            //将当前轮数的数放到应该在的位置
            arr[j + 1] = temp;
        }
    }

    /**
     * 插入排序算法。
     *
     * @param num
     */
    private static void insertSort3(int[] num) {
        for (int j = 1; j < num.length; j++) {
            int key = num[j];
            int i = j - 1;
            while (i >= 0 && num[i] > key) {
                num[i + 1] = num[i];
                i--;
            }
            num[i + 1] = key;
        }
    }


    static void sort3(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // 把元素来插入到指定的位置上
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] num = {23, 2, 1, 34, 5, 6, 7, 8, 3, 40, 9, 39, 45, 56, 7, 8,};
        //调用方法。
//        insertSort3(num);
//        for (int i : num) {
        sort3(num);
        for(int i:num) {
            System.out.print(i+" ");
        }
    }
}
