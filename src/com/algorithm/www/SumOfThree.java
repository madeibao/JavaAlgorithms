package com.algorithm.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: JavaWorkSpace2->SumOfThree
 * @description: 三个数字的和
 * @author: MaYuan
 * @create: 2020-02-13 17:36
 * @version: 1.0
 **/

public class SumOfThree {
    static List<List<Integer>> res = new ArrayList();

    public static List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            //简化，如果>0则说明该三数之和不可能为0
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i];
            //此处必须对i后面的数字进行筛选，不能重复
            int l = i + 1, r = len - 1;
            while (l < r) {

                List<Integer> list = new ArrayList();
                if (nums[l] + nums[r] == target) {
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    //这个地方改成l-1只会出现一个结果了
                    while (r > l && nums[l + 1] == nums[l]) {
                        l++;
                    }
                    while (r > l && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    l++;
                    r--;
                } else {
                    if (nums[l] + nums[r] > target) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = threeSum(nums);
        for (List<Integer> t : res) {
            for (Integer i : t) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}




