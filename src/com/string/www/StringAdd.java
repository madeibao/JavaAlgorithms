package com.string.www;

/**
 * @ClassName StringAdd
 * @Author：Mayuan
 * @Date 2020/10/16 20:24
 * @Description TODO
 * @Version 1.0
 * <p>
 * 两个字符串来进行相加求和
 * 两个大数字的相加。
 **/
public class StringAdd {

    public static void main(String[] args) {
        String str2 = "232423";
        String str3 = "93432";

        int len2 = str2.length() - 1;
        int len3 = str3.length() - 1;

        StringBuilder sb = new StringBuilder();
        int carry = 0;

        for (int i = len2, j = len3; i >= 0 || j >= 0; i--, j--) {
            char c2 = i < 0 ? '0' : str2.charAt(i);
            char c3 = j < 0 ? '0' : str3.charAt(j);
            int temp = c2 - '0' + c3 - '0' + carry;
            sb.insert(0, temp % 10);
            carry = temp / 10;
        }

        sb.insert(0, carry == 1 ? "1" : "");
        System.out.println(sb.toString());
    }
}




