package com.string.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StringPermutation5
 * @Author：Mayuan
 * @Date 2020/5/3 10:37
 * @Description TODO
 * @Version 1.0
 * <p>
 * 数字的全排列的结果值。
 **/
public class StringPermutation5 {
    List<List<Integer>> lists = new ArrayList<>();
    boolean[] visted;

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return lists;
        }
        List<Integer> list = new ArrayList<>();
        visted = new boolean[nums.length];
        process(list, nums);
        return lists;
    }

    private void process(List<Integer> list, int[] nums) {
        //终止条件
        if (list.size() == nums.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visted[i]) {
                visted[i] = true;
                //加入
                list.add(nums[i]);
                process(list, nums);
                //回退
                list.remove(list.size() - 1);
                visted[i] = false;

            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        List<List<Integer>> res = new StringPermutation5().permute(nums);
        for (List<Integer> temp : res) {
            for (Integer i : temp) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
