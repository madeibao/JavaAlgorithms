package com.shuzu.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FindDuplicateNumber
 * @Author：Mayuan
 * @Date 2020/2/21 11:22
 * @Description TODO
 * @Version 1.0
 * 找出一个数组中的重复的元素。
 **/
public class FindDuplicateNumber {

    public static int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int temp = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                temp = entry.getKey();
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int temp = findRepeatNumber(nums);
        System.out.println(temp);
    }
}
