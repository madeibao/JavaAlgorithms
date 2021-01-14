package com.string.www;

/**
 * @ClassName CommonString
 * @Author：Mayuan
 * @Date 2020/6/10 21:11
 * @Description TODO
 * @Version 1.0
 * <p>
 * 两个字符串的最大的公因子。
 * <p>
 * 两个字符串的，一个可能由另外的一个拼接多次组成。
 * 例如ABCABC ABC
 **/
public class CommonString {
    public static String gcdOfStrings(String str1, String str2) {
        // 假设str1是N个x，str2是M个x，那么str1+str2肯定是等于str2+str1的。
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        // 辗转相除法求gcd。
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        String a = "ABCABC";
        String b = "ABC";

        System.out.println(gcdOfStrings(a, b));
    }
}
