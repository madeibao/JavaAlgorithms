package com.shuzu.www;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName Permutation4
 * @Author：Mayuan
 * @Date 2020/2/24 17:38
 * @Description TODO
 * @Version 1.0
 * <p>
 * 包含有重复的内容的全排列的写法。
 * <p>
 * 如  1 1 2
 **/
public class Permutation4 {

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> output = new LinkedList<>();
        ArrayList<Integer> nums_list = new ArrayList<>();
        for (int num : nums) {
            nums_list.add(num);
        }
        int n = nums.length;
        backTrack(n, nums_list, output, 0);
        return output;
    }

    private static void backTrack(int n, ArrayList<Integer> nums, List<List<Integer>> output, int first) {
        if (first == n) {
            output.add(new ArrayList<>(nums));
            return;
        }
        for (int i = first; i < n; i++) {
            if (!isRepeat(nums, first, i)) {
                Collections.swap(nums, first, i);
                backTrack(n, nums, output, first + 1);
                Collections.swap(nums, first, i);
            }
        }
    }

    private static boolean isRepeat(ArrayList<Integer> nums, int first, int n) {
        int temp = nums.get(n);
        for (int i = first; i < n; i++) {
            if (nums.get(i) == temp) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3};
        List<List<Integer>> list2 = permuteUnique(nums);
        for (List<Integer> list : list2) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
