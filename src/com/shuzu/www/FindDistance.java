package com.shuzu.www;

import java.util.HashMap;

/**
 * @ClassName FindDistance
 * @Author：Mayuan
 * @Date 2020/11/12 8:32
 * @Description TODO
 * @Version 1.0
 **/
public class FindDistance {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {


        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                if (k >= i - hashMap.get(nums[i])) {
                    return true;
                }
            }
            hashMap.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
