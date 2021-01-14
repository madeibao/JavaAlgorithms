package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->InterBinNumber
 * @description: 给定相同的个数的二进制表示中1，两个数字
 * @author: MaYuan
 * @create: 2019-12-25 21:40
 * @version: 1.0
 **/
public class InterBinNumber {
    public static int[] getCloseNumber(int x) {
        // write code here
        int min = x - 1, max = x + 1;
        while (Integer.bitCount(x) != Integer.bitCount(min) && min >= 0) {
            min--;
        }
        while (Integer.bitCount(x) != Integer.bitCount(max)) {
            max++;
        }

        // 返回这个数组的内容。
        int[] arr = {min, max};
        return arr;
    }

    public static void main(String[] args) {
        int[] a;
        a = getCloseNumber(13);
        for (int k : a) {
            System.out.println(k + " ");
        }
    }
}

