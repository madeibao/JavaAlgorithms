package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->ArraySortOuJi
 * @description: 数组的奇数和偶数来进行排序
 * @author: MaYuan
 * @create: 2020-02-04 21:13
 * @version: 1.0
 * 数组按照奇偶的顺序来进行排序。
 **/
public class ArraySortOuJi {

    private static int[] sortArrayByParity(int[] A) {

        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            if (A[left] % 2 == 0) {
                left += 1;
            } else {
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                right -= 1;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 4};
        int[] num2 = sortArrayByParity(nums);
        for (int j : num2) {
            System.out.print(j + " ");
        }
    }
}
