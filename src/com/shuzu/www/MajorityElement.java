package com.shuzu.www;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @program: JavaWorkSpace2->MajorityElement
 * @description: 多数的元素内容
 * @author: MaYuan
 * @create: 2019-12-29 20:44
 * @version: 1.0
 * <p>
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * 示例 1:
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 **/
public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(10);
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            int ch = nums[i];

            // 如果不曾包含有这个元素的内容。
            if (!hashMap.containsKey(ch)) {
                hashMap.put(ch, 1);
            } else {
                hashMap.put(ch, hashMap.get(ch) + 1);
            }
        }
        for (Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                temp = entry.getKey();
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(new MajorityElement().majorityElement(nums));
    }
}






