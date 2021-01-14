package com.recursive.www;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: Pro1->ArrayPaiLie2
 * @description: 数组的全排列的内容2
 * @author: MaYuan
 * @create: 2019-12-23 21:20
 * @version: 1.0
 * 列表内容的全排列
 * 1 2 3
 * 1 2 3
 * 1 3 2
 * 2 1 3
 * 2 3 1
 * 3 2 1
 * 3 1 2
 **/
public class ArrayPaiLie2 {
    private void backtrack(int n, ArrayList<Integer> nums, List<List<Integer>> output, int first) {
        // if all integers are used up
        if (first == n) {
            output.add(new ArrayList<Integer>(nums));
        }
        for (int i = first; i < n; i++) {
            // place i-th integer first
            // in the current permutation
            Collections.swap(nums, first, i);
            // use next integers to complete the permutations
            backtrack(n, nums, output, first + 1);
            // backtrack
            Collections.swap(nums, first, i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        // init output list
        List<List<Integer>> output = new LinkedList<List<Integer>>();

        // convert nums into list since the output is a list of lists
        ArrayList<Integer> nums_lst = new ArrayList<Integer>();
        for (int num : nums) {
            nums_lst.add(num);
        }
        int n = nums.length;
        backtrack(n, nums_lst, output, 0);
        return output;
    }

    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        int[] num = {1, 2, 3};
        res = new ArrayPaiLie2().permute(num);
        for (List<Integer> array : res) {
            for (Integer s : array) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
