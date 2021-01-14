package com.shuzu.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PowerSet
 * @Author：Mayuan
 * @Date 2020/2/26 21:18
 * @Description TODO
 * @Version 1.0
 * <p>
 * 数组元素的幂集合。
 **/
public class PowerSet {

    private List<List<Integer>> res;

    /**
     * 幂集合。
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>());
        return res;
    }

    private void backtrack(int[] nums, int index, List<Integer> collector) {
        res.add(new ArrayList<>(collector));
        for (int i = index; i < nums.length; i++) {
            collector.add(nums[i]);
            // 递归调用。
            backtrack(nums, i + 1, collector);
            collector.remove(collector.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> res = new PowerSet().subsets(nums);
        for (List<Integer> list1 : res) {
            for (Integer i : list1) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
