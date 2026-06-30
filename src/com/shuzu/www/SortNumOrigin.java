package com.shuzu.www;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * https://leetcode.cn/problems/sort-the-jumbled-numbers/submissions/733329428/
 *
 *
 * @ClassName SortNumOrigin
 * @Author Mayuan
 * @Date 2026/6/30/星期二 11:09
 * @Version 1.0
 **/
public class SortNumOrigin {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < mapping.length; i++) {
            map.put(i, mapping[i]);
        }
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            // 添加元素， 原始内容，映射内容，下标
            list.add(new int[]{nums[i], getMapNum(nums[i], map), i});
        }
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] != o2[1]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[2] - o2[2];
                }
            }
        });
        int[] res = new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i)[0];
        }
        return res;
    }

    public int getMapNum(int num, Map<Integer, Integer> map) {
        String res = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        for (char c : res.toCharArray()) {
            sb.append(map.get(c - '0'));
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        int[] map = {8, 9, 4, 0, 2, 1, 3, 5, 7, 6};
        int[] nums = {991, 338, 38};
        SortNumOrigin sortNumOrigin = new SortNumOrigin();
        int[] res = sortNumOrigin.sortJumbled(map, nums);
        for (int j : res) {
            System.out.print(j + " ");
        }
    }
}
