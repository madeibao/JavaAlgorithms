package com.algorithm.www;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @program: JavaWorkSpace2->AppearOnceNumber
 * @description: 只是出现一次的数字
 * @author: MaYuan
 * @create: 2020-01-28 11:53
 * @version: 1.0
 * <p>
 * 一个数组中，求只出现一次的数字内容。
 * 下面用三种方法来解决。
 *
 **/
public class AppearOnceNumber {

    private static int singleNumber(int[] nums) {
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];
            }
        }
        return ans;
    }

    static int getOne2(int[] nums) {
        HashMap<Integer,Integer> map2= new HashMap<>();
        for(int i:nums) {
            if(map2.containsKey(i)) {
                map2.put(i, map2.get(i)+1);
            }
            else {
                map2.put(i, 1);
            }
        }
        for(int j:map2.keySet()) {
            if(map2.get(j)==1) {
                return j;
            }
        }
        return -1;
    }


    /**
     * 第三种方法。
     * @param args
     */
    public static int singleNumber2(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i=0;i<nums.length-1;i=i+2)
        {
            if(nums[i]!=nums[i+1])
            {
                return nums[i];
            }
        }
        return nums[i];
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(singleNumber(nums));
    }
}






