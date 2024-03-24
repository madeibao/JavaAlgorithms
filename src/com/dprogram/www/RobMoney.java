package com.dprogram.www;

/**
 * @ClassName RobMoney
 * @Author：Mayuan
 * @Date 2023/9/26/0026 18:31
 * @Description TODO
 * @Version 1.0
 **/
public class RobMoney {

    static int rob(int[] nums) {

        if(nums.length==0) {
            return 0;
        }

        if(nums.length==1) {
            return nums[0];
        }

        if(nums.length==2) {
            return Math.max(nums[0],nums[1]);
        }

        int a= nums[0];
        int b= Math.max(nums[0],nums[1]);
        int c=0;
        for(int i=2;i<nums.length;++i) {
            c = Math.max(a+nums[i],b);
            a = b;
            b = c;
        }

        return b;
    }
    public static void main(String[] args) {

        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));

    }
}
