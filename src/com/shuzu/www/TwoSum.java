package com.shuzu.www;

import java.util.HashMap;

/**
 * @ClassName TwoSum
 * @Author：Mayuan
 * @Date 2020/2/24 17:22
 * @Description TODO
 * @Version 1.0
 * <p>
 * 两个数字的和。
 * 主要是双指针的方法
 **/
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map2.containsKey(temp)) {
                res[0] = map2.get(temp);
                res[1] = i;
                break;
            }
            map2.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] num2 = twoSum(nums, target);
        for (int j : num2) {
            System.out.print(j + " ");
        }
    }
}



