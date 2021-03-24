package com.shuzu.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName SubSets
 * @Author：Mayuan
 * @Date 2021/3/19/0019 19:21
 * @Description TODO
 * @Version 1.0
 *
 * 数组的子集
 *
 **/

public class SubSets {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {

        // 首先来进行排序。
        Arrays.sort(S);
        ArrayList<ArrayList<Integer>> listlist=new ArrayList<ArrayList<Integer>>();
        dfs(listlist,new ArrayList<Integer>(),S,0);
        return listlist;
    }
    void dfs(ArrayList<ArrayList<Integer>> listlist,ArrayList<Integer> list,int[] S,int index){
        if(index==S.length){
            listlist.add(new ArrayList<Integer>(list));
            return;
        }
        dfs(listlist,list,S,index+1);
        list.add(S[index]);
        dfs(listlist,list,S,index+1);
        list.remove(list.size()-1);
        return;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3};
        List<ArrayList<Integer>> res = new SubSets().subsets(nums);
        res.forEach(System.out::println);
    }
}
