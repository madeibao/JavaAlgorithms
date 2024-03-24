package com.algorithm.www;

/**
 * @ClassName BinarySearch
 * @Author：Mayuan
 * @Date 2020/5/31 19:56
 * @Description TODO
 * @Version 1.0
 * <p>
 * Java实现二分查找。
 **/
public class BinarySearch {
    /**
     * 使用递归的二分查找
     * title:recursionBinarySearch
     *
     * @param arr 有序数组
     * @param key 待查找关键字
     * @return 找到的位置
     * 时间复杂度是 O(Log2N)
     */
    public static int recursionBinarySearch(int[] arr, int key, int low, int high) {

        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }
        //初始中间位置
        int middle = (low + high) / 2;
        if (arr[middle] > key) {
            //比关键字大则关键字在左区域
            return recursionBinarySearch(arr, key, low, middle - 1);
        }
        else if (arr[middle] < key) {
            //比关键字小则关键字在右区域
            return recursionBinarySearch(arr, key, middle + 1, high);
        }
        else {
            return middle;
        }
    }

    /**
     * 不使用递归的二分查找
     * title:commonBinarySearch
     *
     * @param arr
     * @param key
     * @return 关键字位置
     */
    public static int commonBinarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        //定义middle
        int middle = 0;

        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }

        while (low <= high) {
            middle = (low + high) / 2;
            if (arr[middle] > key) {
                //比关键字大则关键字在左区域
                high = middle - 1;
            } else if (arr[middle] < key) {
                //比关键字小则关键字在右区域
                low = middle + 1;
            } else {
                return middle;
            }
        }
        //最后仍然没有找到，则返回-1
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 17, 20, 22};
        int target = 12;
        int low = 0;
        int high = nums.length - 1;
        System.out.println(recursionBinarySearch(nums, target, low, high));
    }
}
