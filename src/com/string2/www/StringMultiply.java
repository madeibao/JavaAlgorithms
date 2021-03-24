package com.string2.www;

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

    public static String solve(String s, String t) {

        int lens = s.length();
        int lent = t.length();

        int[] nums = new int[lens];
        int[] numt = new int[lent];

        for(int i=0;i<lens;i++) {
            nums[i] = s.charAt(i)-'0';
        }
        for(int j=0;j<lent;j++) {
            numt[j] = t.charAt(j)-'0';
        }

        int[] res = new int[lens+lent];
        // 模拟乘法运算。
        for(int i=0;i<lens;i++) {
            for(int j=0;j<lent;j++) {
                res[i+j] += nums[i]*numt[j];
            }
        }

        for(int k= res.length-1;k>0;k--) {
            res[k-1] += res[k]/10;
            res[k] =res[k]%10;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<res.length-1;i++) {
            sb.append(res[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solve("12","34"));
    }
}
