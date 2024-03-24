package com.string.www;

/**
 * @ClassName StringAdd4
 * @Author：Mayuan
 * @Date 2020/10/29 21:28
 * @Description TODO
 * @Version 1.0
 * 两个二进制的数字来进行相加。
 **/
public class StringAdd4 {

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int c2 = i < 0 ? 0 : a.charAt(i--) - '0';
            int c3 = j < 0 ? 0 : b.charAt(j--) - '0';
            int temp = c2 + c3 + carry;
            sb.append(temp % 2);
            carry = temp / 2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str2 = "11";
        String str3 = "11";
        System.out.println(addBinary(str2, str3));
    }

}
