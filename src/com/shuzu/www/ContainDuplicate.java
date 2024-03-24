package com.shuzu.www;

import java.util.HashSet;

/**
 * @program: JavaWorkSpace2->ContainDuplicate
 * @description: 包含有重复的元素内容
 * @author: MaYuan
 * @create: 2020-02-09 17:55
 * @version: 1.0
 **/
public class ContainDuplicate {

    private static boolean duplicateNumber(int[] nums) {
        HashSet<Integer> set2 = new HashSet<>();
        for (int j : nums) {
            if (set2.contains(j)) {
                return true;
            }
            set2.add(j);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2};
        System.out.println(duplicateNumber(nums));
    }
}
