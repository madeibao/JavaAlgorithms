package com.sort.www;

/**
 * @ClassName MergeSort2
 * @Author：Mayuan
 * @Date 2020/7/1 19:18
 * @Description TODO
 * @Version 1.0
 * <p>
 * 归并排序的操作。
 **/
public class MergeSort2 {

    static void merge(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        merge(arr, start, mid);
        merge(arr, mid + 1, end);

        int[] temp = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end)
            temp[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        while (i <= mid)
            temp[k++] = arr[i++];
        while (j <= end)
            temp[k++] = arr[j++];

        System.arraycopy(temp, 0, arr, start, end - start + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 32, 4, 3, 3, 4, 3, 4, 23, 3, 4, 3, 3,};
        merge(arr, 0, arr.length - 1);

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
