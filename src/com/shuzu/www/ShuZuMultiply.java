package com.shuzu.www;

/**
 * @ClassName ShuZuMultiply
 * @Author：Mayuan
 * @Date 2020/4/4 22:43
 * @Description TODO
 * @Version 1.0
 * <p>
 * 数组的特殊的乘法内容
 * 构建乘积数组。
 **/


public class ShuZuMultiply {
    public int[] constructArr(int[] a) {
        if (a.length == 0) {
            return new int[]{0};
        }

        int[] left = new int[a.length];
        int[] right = new int[a.length];
        int[] res = new int[a.length];

        // 第一个和最后的一个为1，方便乘积运算。
        left[0] = 1;
        right[a.length - 1] = 1;

        for (int i = 1; i < a.length; i++) {
            left[i] = left[i - 1] * a[i - 1];
        }
        for (int i = a.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * a[i + 1];
        }

        for (int i = 0; i < res.length; i++) {
            res[i] = left[i] * right[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] temp = new ShuZuMultiply().constructArr(nums);
        for (int j : temp) {
            System.out.print(j + " ");
        }
    }
}
