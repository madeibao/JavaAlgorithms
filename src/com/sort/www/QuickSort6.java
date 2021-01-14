package com.sort.www;

import java.util.Arrays;

/**
 * @ClassName QuickSort6
 * @Author：Mayuan
 * @Date 2020/11/18 16:59
 * @Description TODO
 * @Version 1.0
 * <p>
 * 快速排序算法。
 **/
public class QuickSort6 {

    private static void quickSort(int[] array, int _left, int _right) {
        int left = _left;
        int right = _right;

        // 排序基准线
        int pivot;//基准线
        if (left < right) {
            pivot = array[left];
            while (left != right) {
                //从右往左找到比基准线小的数
                while (left < right && pivot <= array[right]) {
                    right--;
                }
                //将右边比基准线小的数换到左边
                array[left] = array[right];
                //从左往右找到比基准线大的数
                while (left < right && pivot >= array[left]) {
                    left++;
                }
                //将左边比基准线大的数换到右边
                array[right] = array[left];
            }
            //此时left和right指向同一位置
            array[left] = pivot;
            quickSort(array, _left, left - 1);
            quickSort(array, left + 1, _right);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 1, 4, 5, 9, 2, 12, 15, 16};
        int left = 0;
        int right = nums.length - 1;
        quickSort(nums, left, right);
        System.out.println(Arrays.toString(nums));
    }
}
