package com.recursive.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Pro1->ArrayPowerSet
 * @description: 数组的幂集合
 * @author: MaYuan
 * @create: 2019-12-23 21:08
 * @version: 1.0
 * * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * <p>
 * 说明：解集不能包含重复的子集
 * 示例:   一共是2**3=8
 * <p>
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 * [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 **/
public class ArrayPowerSet {

    private static List<List<Integer>> subSets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        //添加一个空的序列内容。
        res.add(new ArrayList<Integer>());
        for (int i = 0; i < nums.length; i++) {
            int all = res.size();
            for (int j = 0; j < all; j++) {
                List<Integer> tmp = new ArrayList<Integer>(res.get(j));
                tmp.add(nums[i]);
                res.add(tmp);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        List<List<Integer>> res;
        res = subSets(num);
        for (List<Integer> array : res) {
            for (Integer s : array) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}





