package com.binarysearch.www;

/**
 *  二分查找的定义内容
 *
 * @ClassName Search
 * @Author：Mayuan
 * @Date 2024/9/8/星期日 17:49
 * @Description TODO
 * @Version 1.0
 **/
public class Search {

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // 计算中间元素的索引
            if (nums[mid] == target) {
                return mid; // 找到目标值，返回索引
            } else if (nums[mid] < target) {
                left = mid + 1; // 目标值在右半部分
            } else {
                right = mid - 1; // 目标值在左半部分
            }
        }
        return -1; // 目标值不存在
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 6;
        System.out.println(binarySearch(nums,target));
    }
}
