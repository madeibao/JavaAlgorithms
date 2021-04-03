package com.backtrack.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Permutation
 * @Author：Mayuan
 * @Date 2021/3/31/0031 15:18
 * @Description TODO
 * @Version 1.0
 *
 * 排列。
 **/
public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        dfs(nums,list,list1);
        return list;
    }

    public void dfs(int[] nums,List<List<Integer>> list,List<Integer> list1){
        if(list1.size() == nums.length) {
            list.add(new ArrayList<>(list1));
            return;
        }
        for(int i=0;i<nums.length;i++) {
            if(list1.contains(nums[i]))  {
                continue;
            }

            // 首先添加，然后删除掉。
            list1.add(nums[i]);
            dfs(nums,list,list1);
            list1.remove(list1.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> list2= new Permutation().permute(nums);
        list2.forEach(System.out::println);
    }
}
