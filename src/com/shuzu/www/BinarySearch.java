package com.shuzu.www;

/**
 * @ClassName BinarySearch
 * @Author：Mayuan
 * @Date 2020/3/16 11:07
 * @Description TODO
 * @Version 1.0
 * <p>
 * 数组的二分查找
 * <p>
 * 给定一个数组和一个目标值，然后找出数组中的目标值的位置，否则，返回-1.
 **/


public class BinarySearch {

    static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(binarySearch(nums, target));
    }
}


