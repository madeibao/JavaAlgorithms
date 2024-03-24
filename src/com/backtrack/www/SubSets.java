package com.backtrack.www;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @ClassName SubSets
 * @Author：Mayuan
 * @Date 2021/3/31/0031 15:17
 * @Description TODO
 * @Version 1.0
 *
 * 子集，通过回溯算法来实现
 *
 * [1,2,3]
 *************************************
 * []
 * [3]
 * [2]
 * [2, 3]
 * [1]
 * [1, 3]
 * [1, 2]
 * [1, 2, 3]
 *
 **/
public class SubSets {

    public static List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        // 构建的一个双端队列。
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums,len,0,res,path);

        return res;
    }

    private static void dfs(int[] nums, int len, int level, List<List<Integer>> res, Deque<Integer> path){
        if (level==len){
            res.add(new ArrayList<>(path));
            return;
        }

        //不选当前数；
        dfs(nums,len,level+1,res,path);
        //选当前数；
        path.add(nums[level]);
        dfs(nums,len,level+1,res,path);
        path.removeLast();
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3};
        int[] nums2 = {1,3,5,7};
        List<List<Integer>> res = subsets(nums2);
        res.forEach(System.out::println);
    }

}
