package com.sort.www;

/**
 * @ClassName SelectSort
 * @Author：Mayuan
 * @Date 2020/2/24 21:08
 * @Description TODO
 * @Version 1.0
 * <p>
 * java选择排序，每次选择一个最小的放在前面
 **/
public class SelectSort {
    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {23, 2, 2, 34, 5, 6, 7, 8, 3, 2, 9, 39, 45, 56, 7, 8,};
        selectionSort(nums);
        for (int j : nums) {
            System.out.print(j + " ");
        }
    }
}
