package com.sort.www;

/**
 * @ClassName BubbleSortA
 * @Author：Mayuan
 * @Date 2023/8/4/0004 22:44
 * @Description TODO
 * @Version 1.0
 **/
public class BubbleSortA {

    static void sort(int[] nums) {

        int flag = 1;
        for(int i=0;i<nums.length-1;i++) {
            for(int j=0;j<nums.length-1-i;j++) {
                if(nums[j]>nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    flag = 0;
                }
                else {
                    continue;
                }
            }
            if(flag==1) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,1,9,10,12,2,9,30};
        sort(nums);
        for(int i:nums) {
            System.out.print(i+" ");
        }

    }
}
