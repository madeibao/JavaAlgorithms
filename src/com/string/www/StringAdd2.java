package com.string.www;

/**
 * @ClassName StringAdd2
 * @Author：Mayuan
 * @Date 2020/10/26 8:50
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 两个字符串来相加
 **/

public class StringAdd2 {

    public static void main(String[] args) {
        String str2 = "12333";
        String str3 = "2324";

        int len2 = str2.length() - 1;
        int len3 = str3.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = len2, j = len3; i >= 0 || j >= 0; i--, j--) {
            char c2 = i < 0 ? '0' : str2.charAt(i);
            char c3 = j < 0 ? '0' : str3.charAt(j);
            int temp = c2 - '0' + c3 - '0' + carry;
            sb.insert(0, temp % 10);
            carry = temp / 10;
        }

        sb.insert(0, carry == 1 ? '1' : "");
        System.out.println(sb.toString());
    }
}
