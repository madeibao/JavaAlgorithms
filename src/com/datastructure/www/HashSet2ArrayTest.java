package com.datastructure.www;

import java.util.HashSet;

/**
 * @ClassName HashSet2ArrayTest
 * @Author：Mayuan
 * @Date 2020/2/27 15:47
 * @Description TODO
 * @Version 1.0
 * <p>
 * 哈希集合中的元素来变成数组
 **/
public class HashSet2ArrayTest {

    public static void main(String[] args) {
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(9);
        set2.add(33);
        set2.add(4);
        set2.add(8);

        int[] nums;
        nums = set2.stream().mapToInt(Integer::intValue).toArray();

        for (int j : nums) {
            System.out.print(j + " ");
        }
    }
}




