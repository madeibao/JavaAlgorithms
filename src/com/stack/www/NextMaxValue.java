package com.stack.www;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

/**
 * 下一个更大的元素
 *
 * @ClassName NextMaxValue
 * @Author：Mayuan
 * @Date 2024/12/8/星期日 18:44
 * @Description TODO
 * @Version 1.0
 **/
public class NextMaxValue {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];

        int lena = nums1.length;
        int lenb = nums2.length;

        Deque<Integer> stack = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < lenb; i++) {
            while (!stack.isEmpty() && stack.peekLast() < nums2[i]) {
                map.put(stack.pollLast(), nums2[i]);
            }
            stack.add(nums2[i]);
        }
        for (int i = 0; i < lena; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] res = new NextMaxValue().nextGreaterElement(nums1, nums2);
        for (int re : res) {
            System.out.println(re);
        }
    }
}


