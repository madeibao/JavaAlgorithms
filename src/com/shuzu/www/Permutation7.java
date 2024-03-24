package com.shuzu.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Permutation7
 * @Author：Mayuan
 * @Date 2020/6/17 10:26
 * @Description TODO
 * @Version 1.0
 * <p>
 * 有重复元素的全排列内容。
 **/
public class Permutation7 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        // 判断这个节点有没有进行过遍历。
        int[] visited = new int[nums.length];
        backtrack(res, nums, visited, new ArrayList<Integer>());
        return res;
    }

    private void backtrack(List<List<Integer>> res, int[] nums, int[] visited, ArrayList<Integer> tmp) {
        if (tmp.size() == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1 || (i > 0 && visited[i - 1] == 0 && nums[i - 1] == nums[i])) {
                continue;
            }

            visited[i] = 1;
            tmp.add(nums[i]);
            backtrack(res, nums, visited, tmp);
            // 撤销之前的选择结果值。
            tmp.remove(tmp.size() - 1);
            visited[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] res = {1, 1, 2};
        List<List<Integer>> list2 = new Permutation7().permuteUnique(res);
        for (List<Integer> list : list2) {
            for (Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
