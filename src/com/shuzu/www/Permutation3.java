package com.shuzu.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Pro1->Permutation3
 * @description: 实现数组全排列
 * @author: MaYuan
 * @create: 2019-12-23 13:39
 * @version: 1.0
 * <p>
 * 给定数组的序列，然后返回全排列的内容。
 **/


public class Permutation3 {
    /**
     * 最终返回的结果集
     */
    List<List<Integer>> res = new ArrayList<List<Integer>>();

    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        if (len == 0 || nums == null) {
            return res;
        }

        // 采用前后元素交换的办法，dfs解题
        exchange(nums, 0, len);
        return res;
    }

    public void exchange(int[] nums, int i, int len) {
        // 将当前数组加到结果集中
        if (i == len - 1) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < len; j++) {
                list.add(nums[j]);
            }
            res.add(list);
            return;
        }
        // 将当前位置的数跟后面的数交换，并搜索解
        for (int j = i; j < len; j++) {
            swap(nums, i, j);
            exchange(nums, i + 1, len);
            swap(nums, i, j);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> list = new Permutation3().permute(nums);
        for (List<Integer> array : list) {
            for (Integer s : array) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}


