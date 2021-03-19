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

        int[] nums = new int[s.length()];
        int[] numt = new int[t.length()];

        for(int i=0;i<nums.length;i++) {
            nums[i] = s.charAt(i)-'0';
        }

        for(int j=0;j<numt.length;j++) {
            nums[j] = t.charAt(j)-'0';
        }

        int[] res =new int[nums.length+numt.length];

        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<numt.length;j++) {
                res[i+j] = nums[i]*numt[j];
            }
        }

        for(int k = res.length-1;k>0;k--) {
            res[k]+=res[k-1]/10;
            res[k-1] = res[k-1]%10;
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
