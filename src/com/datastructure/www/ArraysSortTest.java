package com.datastructure.www;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ClassName ArraysSortTest
 * @Author：Mayuan
 * @Date 2020/6/29 10:02
 * @Description TODO
 * @Version 1.0
 * <p>
 * 利用Arrays实现排序。
 **/
public class ArraysSortTest {

    public static void index4() {
        int[] scores = new int[]{1, 2, 3, 89, 4};
        Arrays.sort(scores);
        for (int i : scores) {
            System.out.print(i + " ");
        }
    }

    /**
     * 如果想降序怎么办呢？
     * 使用：Arrays.sort(scores,Collections.reverseOrder());
     * 需要注意的是 不能使用基本类型（int,double, char），如果是int型需要改成Integer，float要改成Float
     */

    public static void index5() {
        Integer[] scores = {1, 2, 3, 89, 4};
        Arrays.sort(scores, Collections.reverseOrder());
        for (Integer i : scores) {
            System.out.print(i + " ");
        }
    }

    public static void index6() {
        int[] scores = new int[]{1, 2, 3, 89, 4};
        Integer[] newScores = new Integer[5];
        for (int i = 0; i < scores.length; i++) {
            newScores[i] = scores[i];
        }

        Arrays.sort(newScores, Collections.reverseOrder());
        for (Integer i : newScores) {
            System.out.print(i + " ");
        }
    }

    public static void index7() {
        Integer[] nums = {2, 3, 1, 3, 4, 5, 5, 2, 4,};
        Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int j : nums) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        index4();
        System.out.println();
        index5();
        System.out.println();
        index6();
        System.out.println();
        index7();
    }
}
