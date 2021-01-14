package com.algorithm.www;

/**
 * @ClassName UglyNumber4
 * @Author：Mayuan
 * @Date 2020/5/6 11:58
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个数字只有3，5，7 这三个因子，求第n个数字。
 **/
public class UglyNumber4 {

    public static int findKth(int k) {
        int[] array = new int[k];
        int num3 = 0;
        int num5 = 0;
        int num7 = 0;
        array[0] = 3;
        array[1] = 5;
        array[2] = 7;
        for (int i = 3; i < k; i++) {
            array[i] = Math.min(Math.min(array[num3] * 3, array[num5] * 5), array[num7] * 7);
            if (array[i] == array[num3] * 3) {
                num3++;
            }
            if (array[i] == array[num5] * 5) {
                num5++;
            }
            if (array[i] == array[num7] * 7) {
                num7++;
            }
        }
        return array[k - 1];
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(findKth(n));
    }
}
