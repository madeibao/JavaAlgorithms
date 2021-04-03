package com.shuzu.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName SumOfThree
 * @Author：Mayuan
 * @Date 2020/4/4 11:56
 * @Description TODO
 * @Version 1.0
 * <p>
 * 三个数字的和
 **/

public class SumOfThree {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        // 首先来进行排序。
        Arrays.sort(nums);
        if (nums.length < 3) {
            return res;
        }
        final int target = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {

                if (nums[i] + nums[j] + nums[k] < target) {

                    ++j;
                    while (nums[j] == nums[j - 1] && j < k) {
                        j++;
                    }
                }
                else if (nums[i] + nums[j] + nums[k] > target) {
                    --k;
                    while (nums[k] == nums[k + 1]) {
                        --k;
                    }
                }
                else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    ++j;
                    --k;
                    while (nums[j] == nums[j - 1]) {
                        ++j;
                    }
                    while (nums[k] == nums[k + 1]) {
                        --k;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums2 = {-2,0,1,1,2};
        List<List<Integer>> res = threeSum(nums2);
        for (List<Integer> t : res) {
            for (Integer i : t) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
