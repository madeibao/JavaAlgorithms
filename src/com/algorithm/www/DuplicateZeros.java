package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->DuplicateZeros
 * @description: 复写数字0
 * @author: MaYuan
 * @create: 2020-02-05 21:08
 * @version: 1.0
 * 数组中出现0，然后复制一个0的内容。
 * 题目的明确的规定是要求数组中原地进行更改内容。
 **/
public class DuplicateZeros {

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i + 1; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i + 1] = 0;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 3, 0, 2, 3, 0, 4, 4};
        duplicateZeros(nums);
        for (int j : nums) {
            System.out.print(j + " ");
        }
    }
}




