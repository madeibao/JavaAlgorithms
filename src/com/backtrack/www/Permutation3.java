package com.backtrack.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Permutation3
 * @Author：Mayuan
 * @Date 2023/9/22/0022 18:28
 * @Description TODO
 * @Version 1.0
 **/
public class Permutation3 {
    private int[] nums;
    private List<Integer> path;
    private boolean[] onPath;
    private final List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        path = Arrays.asList(new Integer[nums.length]);
        onPath = new boolean[nums.length];
        dfs(0);
        return ans;
    }

    private void dfs(int i) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int j = 0; j < nums.length; ++j) {
            if (!onPath[j]) {
                path.set(i, nums[j]);
                onPath[j] = true;
                dfs(i + 1);
                // 恢复现场
                onPath[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Permutation3 p = new Permutation3();
        List<List<Integer>> list2;
        list2 = p.permute(new int[]{1,2,3});
        for(var i:list2) {
            for(var j:i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}



