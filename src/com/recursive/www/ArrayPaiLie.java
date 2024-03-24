package com.recursive.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Pro1->ArrayPaiLie
 * @description: 数组的全排列
 * @author: MaYuan
 * @create: 2019-12-23 21:04
 * @version: 1.0
 **/

public class ArrayPaiLie {
    private List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, nums, 0);
        return res;
    }

    private void dfs(List<List<Integer>> res, int[] nums, int cur) {
        if (cur == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (Integer item : nums)
                temp.add(item);
            res.add(temp);
        } else {
            for (int i = cur; i < nums.length; i++) {
                swap(nums, cur, i);
                dfs(res, nums, cur + 1);
                swap(nums, cur, i);
                //这里一定要交换回来，因为不是和C++一样是数组的拷贝，Java中是数组的引用，不能改变，不然得不到正确的结果
            }
        }
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        List<List<Integer>> list2 = new ArrayList<List<Integer>>();
        int[] num = {1, 2, 3};
        list2 = new ArrayPaiLie().permute(num);

        for (List<Integer> array : list2) {
            for (Integer s : array) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
