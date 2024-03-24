package com.sort.www;

/**
 * @program: JavaWorkSpace2->QuickSort2
 * @description: Java的快速排序
 * @author: MaYuan
 * @create: 2019-12-27 20:40
 * @version: 1.0
 **/
public class QuickSort2 {
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;
    }

    void quicksort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = partition(nums, left, right);

        quicksort(nums, left, mid - 1);
        quicksort(nums, mid + 1, right);
    }

    int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, right);
        return i + 1;
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 1, 2, 8, 10, 3, 19, 32, 34, 57, 84};
        int[] num2 = new QuickSort2().sortArray(nums);
        for (int i : num2) {
            System.out.print(i + " ");
        }
    }
}
