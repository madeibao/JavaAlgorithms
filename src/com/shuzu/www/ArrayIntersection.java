package com.shuzu.www;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ArrayIntersection
 * @Author：Mayuan
 * @Date 2020/3/21 16:54
 * @Description TODO
 * @Version 1.0
 * <p>
 * 两个数组的交集
 **/
public class ArrayIntersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> resList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums1) {
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }
        for (Integer num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                resList.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        // 定义数组，然后返回其中的值。
        int[] resArr = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            resArr[i] = resList.get(i);
        }
        return resArr;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] test = intersect(nums1, nums2);
        for (int j : test) {
            System.out.print(j + " ");
        }
    }
}
