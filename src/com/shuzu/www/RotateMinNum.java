package com.shuzu.www;

/**
 * @ClassName RotateMinNum
 * @Author：Mayuan
 * @Date 2021/1/26/0026 18:02
 * @Description TODO
 * @Version 1.0
 * 旋转数组的最小值。
 **/
public class RotateMinNum {

    private static int minNum(int[] nums) {
        int i =0, j= nums.length-1;
        while (i<j) {
            int mid = (i+j)/2;
            if(nums[mid]>nums[j]) {
                i= mid+1;
            }
            else if(nums[mid]<nums[j]) {
                j = mid;
            }
            else {
                j-=1;
            }
        }
        return nums[i];
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,1,2};
        System.out.println(minNum(nums));
    }
}
