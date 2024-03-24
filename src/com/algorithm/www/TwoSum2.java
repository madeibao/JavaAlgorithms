package com.algorithm.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TwoSum2
 * @Author：Mayuan
 * @Date 2021/5/7/0007 16:09
 * @Description TODO
 * @Version 1.0
 *
 * 给定两个数字之和。
 * leetcode
 *
 **/
public class TwoSum2 {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map2 = new HashMap<>(10);
        for(int i=0;i<nums.length;i++) {
            int element = target-nums[i];
            if(map2.containsKey(element)) {
                return new int[]{map2.get(element),i};
            }
            map2.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }
    public static void main(String[] args) {

        int[] res = {2, 7, 11, 15};
        int target = 9;
        int[] res2 = twoSum(res, target);
        for (int j : res2) {
            System.out.print(j + " ");
        }
    }
}
