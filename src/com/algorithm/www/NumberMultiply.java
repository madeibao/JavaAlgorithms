package com.algorithm.www;

import java.util.Arrays;

/**
 * @ClassName NumberMultiply
 * @Author：Mayuan
 * @Date 2021/3/20/0020 16:21
 * @Description TODO
 * @Version 1.0
 *
 * 两个超大的数字相乘。
 **/
public class NumberMultiply {
    static String Multiply(String stra,String strb) {
        int lena = stra.length();
        int lenb = strb.length();

        int[] numa = new int[lena];
        int[] numb = new int[lenb];

        for(int i=0;i<lena;i++) {
            numa[i] = stra.charAt(i)-'0';
        }

        for(int j=0;j<lenb;j++) {
            numb[j] = strb.charAt(j)-'0';
        }

        // 两个数字相乘，最大乘积结果为两个数字加和
        // 99*99 = 9801
        // 则一共四位。
        int[] res = new int[lena+lenb];
        for(int i=0;i<lena;i++) {
            for(int j=0;j<lenb;j++) {
                res[i+j]+= numa[i]*numb[j];
            }
        }
        System.out.println(Arrays.toString(res));
        // 从后面对前面来进行相加,求和。
        for(int k = res.length-1;k>0;k--) {
            res[k-1] += res[k]/10;
            res[k] =res[k]%10;
        }

        StringBuilder sb =new StringBuilder();
        for(int i=0;i<res.length-1;i++) {
            sb.append(res[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String stra = "99";
        String strb = "99";
        System.out.println(Multiply(stra, strb));
    }
}


