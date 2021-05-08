package com.shuzu.www;

import java.util.Arrays;

/**
 * @ClassName CombineTwoArray
 * @Author：Mayuan
 * @Date 2021/4/25/0025 15:19
 * @Description TODO
 * @Version 1.0
 *
合并两个有序的数组值
给出两个有序的整数数组 A和B ，请将数组 B合并到数组A中，变成一个有序的数组
注意：
可以假设 A数组有足够的空间存放 B数组的元素，A 和 B 中初始的元素数目分别为 m 和 n

 **/
public class CombineTwoArray {

    /**
     * 最优解：从后往前处理,不需要开辟额外空间
     * Runtime: 0 ms.Your runtime beats 45.38 % of java submissions.
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, index = m + n - 1;
        while (i >= 0 && j >= 0) {
            nums1[index--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while (j >= 0) {
            nums1[index--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] aa = {1,2,3,0,0,0};
        int m =3;
        int[] bb = {2,5,6};
        int n =3;
        merge(aa, m , bb, n);
        System.out.println(Arrays.toString(aa));
    }
}
