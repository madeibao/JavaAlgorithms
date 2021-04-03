package com.string.www;

import java.util.HashMap;

/**
 * @ClassName TwoSum2
 * @Author：Mayuan
 * @Date 2021/4/1/0001 15:50
 * @Description TODO
 * @Version 1.0
 *
 * leetcode 算法第一题.
 *
 *
 **/
public class TwoSum2 {

    public static int[] twoSum(int[] nums, int target) {
        int[] res= new int[2];
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i =0;i<nums.length;i++) {
            int temp = target - nums[i];
            if(map2.containsKey(temp)) {
                res[0] = map2.get(temp);
                res[1] = i;
                break;
            }

            map2.put(nums[i],i);
        }
        return res;
    }
    public static void main(String[] args) {


        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res= twoSum(nums,target);

        for(int i:res) {
            System.out.println(i);
        }
    }
}
