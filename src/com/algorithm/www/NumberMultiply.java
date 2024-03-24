package com.algorithm.www;

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

        // 从后面对前面来进行相加,求和。

        StringBuilder sb =new StringBuilder();
        for(int i=res.length-1;i>0;i--) {
            res[i-1]+=res[i]/10;
            res[i] = res[i]%10;
        }

        for(int j=0;j<res.length-1;j++) {
            sb.append(res[j]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String stra = "12";
        String strb = "34";
        System.out.println(Multiply(stra, strb));
    }
}


