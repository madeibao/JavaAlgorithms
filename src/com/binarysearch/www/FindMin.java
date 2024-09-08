package com.binarysearch.www;

/**
 * @ClassName FindMin
 * @Author：Mayuan
 * @Date 2024/9/8/星期日 18:05
 * @Description TODO
 * @Version 1.0
 **/
public class FindMin {
    public int findMin(int[] nums) {
        int low = 0, height = nums.length - 1;
        while (low < height) {
            int mid = low + (height - low) / 2;
            if (nums[mid] < nums[height]) {
                height = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(new FindMin().findMin(nums));
    }
}
