package com.shuzu.www;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @ClassName TwoSum2
 * @Author：Mayuan
 * @Date 2020/11/26/0026 19:05
 * @Description TODO
 * @Version 1.0
 **/
public class TwoSum2 {

    private static int[] sum2(int[] nums, int target) {

        int[] res = new int[2];
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map2.containsKey(temp)) {
                res[0] = map2.get(temp);
                res[1] = i;
                break;
            }

            // 默认的条件是第一个放置的是值
            // 第二个放置的是位置。

            map2.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 11};
        int target = 9;
        System.out.println(Arrays.toString(sum2(nums, target)));
    }
}
