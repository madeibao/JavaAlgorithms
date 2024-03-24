package com.sort.www;

/**
 * @ClassName MergerSort3
 * @Author：Mayuan
 * @Date 2020/12/6/0006 10:19
 * @Description TODO
 * @Version 1.0
 * <p>
 * 数组的归并排序算法。
 * # 稳定的排序算法
 * 时间复杂度（logn)
 **/
public class MergerSort3 {

    static void helper(int[] arr, int[] result, int start, int end) {
        if (start >= end) {
            return;
        }

        int len = end - start, mid = (len >> 1) + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;

        helper(arr, result, start1, end1);
        helper(arr, result, start2, end2);

        int k = start;
        while (start1 <= end1 && start2 <= end2) {
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        }
        while (start1 <= end1) {
            result[k++] = arr[start1++];
        }
        while (start2 <= end2) {
            result[k++] = arr[start2++];
        }

        for (k = start; k <= end; k++) {
            arr[k] = result[k];
        }
    }

    static void mergeSort(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        helper(nums, arr, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2};
        mergeSort(nums);
        for (int j : nums) {
            System.out.print(j + " ");
        }
    }
}
