package com.shuzu.www;

/**
 * @ClassName MaxArea
 * @Author：Mayuan
 * @Date 2021/4/3/0003 20:57
 * @Description TODO
 * @Version 1.0
 *
 * 容器盛水
 * 最大的盛水的面积
 *
 *
 **/
public class MaxArea {

    static int maxArea(int[] nums){
        int res=0;
        int i = 0;
        int j = nums.length-1;
        while (i<j) {
            int area = (j-i)*Math.min(nums[i],nums[j]);
            res = Math.max(res, area);
            if(nums[i]<nums[j]) {
                i++;
            }
            else {
                j--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
}
