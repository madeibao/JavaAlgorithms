package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->TwoOrderNumbersMid
 * @description: 两个排序数组的中位数字内容
 * @author: MaYuan
 * @create: 2020-01-10 16:56
 * @version: 1.0
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * 中位数是 2.0
 * *********************************************
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * 中位数是 (2 + 3)/2 = 2.5
 **/
public class TwoOrderNumbersMid {

    private static double getResult(int[] nums) {
        double result = 0.0;
        if (nums.length % 2 == 0) {
            result = (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0;
        } else {
            result = nums[nums.length / 2];
        }
        return result;
    }

    private static double medianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0.0;
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        int[] nums = new int[nums1.length + nums2.length];
        if (nums1.length == 0 && nums2.length == 0) {
            return result;
        }

        if (nums1.length == 0) {
            return getResult(nums2);
        }

        if (nums2.length == 0) {
            return getResult(nums1);
        }

        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] < nums2[index2]) {
                nums[index] = nums1[index1++];
            } else {
                nums[index] = nums2[index2++];
            }
            index++;
        }

        while (index1 < nums1.length) {
            nums[index++] = nums1[index1++];
        }

        while (index2 < nums2.length) {
            nums[index++] = nums2[index2++];
        }

        if (nums.length % 2 == 0) {
            result = (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0;
        } else {
            result = nums[(nums.length) / 2];
        }
        return result;
    }

    public int getSum2(int a, int b) {
        return Math.addExact(a, b);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(medianSortedArrays(nums1, nums2));
    }
}




