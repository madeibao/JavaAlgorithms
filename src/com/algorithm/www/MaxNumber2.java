package com.algorithm.www;

/**
 * @ClassName MaxNumber2
 * @Author：Mayuan
 * @Date 2020/9/16 21:04
 * @Description TODO
 * @Version 1.0
 * <p>
 * 数字的最大的交换2
 **/
public class MaxNumber2 {
    public static int maximumSwap(int num) {
        int[] count = new int[10];
        char[] chs = String.valueOf(num).toCharArray();
        for (int i = 0; i < chs.length; i++) {
            count[(chs[i] - '0')] = i;
        }

        for (int j : count) {
            System.out.print(j + " ");
        }

        System.out.println();
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < chs.length; i++) {
            int cur = (chs[i] - '0');
            int j = 9;
            for (; j > cur; j--) {
                if (count[j] > i) {
                    break;
                }
            }
            if (j != cur) {
                swap(chs, i, count[j]);
                return Integer.valueOf(String.valueOf(chs));
            }
        }
        return num;
    }

    public static void swap(char[] chs, int i, int j) {
        char tmp = chs[i];
        chs[i] = chs[j];
        chs[j] = tmp;
    }

    public static void main(String[] args) {
        System.out.println(maximumSwap(32124));
    }
}