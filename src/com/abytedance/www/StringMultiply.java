package com.abytedance.www;

/**
 * @ClassName StringMultiply
 * @Author：Mayuan
 * @Date 2021/3/31/0031 20:01
 * @Description TODO
 * @Version 1.0
 *
 * 两个字符串相乘。
 **/
public class StringMultiply {
    public static String multiply(String stra, String strb) {
        if (stra.equals("0") || strb.equals("0")) {
            return "0";
        }
        int lena = stra.length();
        int lenb = strb.length();
        int len = lena + lenb;

        int[] cha = new int[lena];
        int[] chb = new int[lenb];

        for (int i = 0; i < lena; i++) {
            cha[i] = stra.charAt(i) - '0';
        }

        for (int j = 0; j < lenb; j++) {
            chb[j] = strb.charAt(j) - '0';
        }

        int[] res = new int[len];

        for (int i = 0; i < lena; i++) {
            for (int j = 0; j < lenb; j++) {
                res[i + j] += cha[i] * chb[j];
            }
        }
        return getString(res);
    }

    public static String getString(int[] res) {
        for (int i = res.length - 1; i > 0; i--) {
            res[i - 1] += res[i] / 10;
            res[i] = res[i] % 10;
        }
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < res.length - 1; j++) {
            if (j == 0 && res[j] == 0) {
                continue;
            }
            sb.append(res[j]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("12","34"));
    }

}
