package com.string2.www;

import java.util.Arrays;

/**
 * @ClassName StringMultiply
 * @Author：Mayuan
 * @Date 2021/3/19/0019 16:32
 * @Description TODO
 * @Version 1.0
 *
 * 字符串的乘法运算。
 **/
public class StringMultiply {

    public static String solve (String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        int[] nums1 = new int[len1];
        int[] nums2 = new int[len2];

        //将字符串的每位取出来，存放在数组中
        for(int i = 0; i < len1; i++) {
            nums1[i] = s.charAt(i) - '0';
        }
        for(int i = 0; i < len2; i++) {
            nums2[i] = t.charAt(i) - '0';
        }

        int[] result = new int[len1 + len2];

        //1. 逐位相乘
        for(int i = 0; i < len1; i++) {
            for(int j = 0; j < len2; j++) {
                result[i + j] += nums1[i] * nums2[j];
            }
        }

        System.out.println(Arrays.toString(result));


        //2. 从后往前进位
        for(int k = result.length - 1; k > 0; k--) {
            result[k - 1] += result[k] / 10;
            result[k] = result[k] % 10;
        }

        // 输出字符串
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < result.length - 1; i++) {
            stringBuilder.append(result[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(solve("1234","34"));

    }
}
