package com.shuzu.www;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName AppearOnceNumber2
 * @Author：Mayuan
 * @Date 2020/2/18 16:42
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个数组中的只是出现一次的数字的。
 **/
public class AppearOnceNumber2 {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(3);
        for (int i = 0; i < nums.length; i++) {
            Integer j = map.remove(nums[i]);
            if (j != null) {
                map.put(nums[i], j + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue().equals(1)) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 3, 3,};
        int res = singleNumber(nums);
        System.out.println(res);
    }
}


