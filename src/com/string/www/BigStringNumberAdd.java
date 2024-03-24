package com.string.www;

/**
 * @program: JavaWorkSpace2->BigStringNumberAdd
 * @description: 两个超大的数字求和
 * @author: MaYuan
 * @create: 2019-12-28 09:35
 * @version: 1.0
 * <p>
 * 字符串加法、链表加法以及二进制加法之类的都可以这么写
 **/
public class BigStringNumberAdd {
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                carry += num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += num2.charAt(j--) - '0';
            }
            sb.append(carry % 10);
            carry /= 10;
        }
        return sb.reverse().toString();
    }

    // 插入到第一个的位置。
    public static String addStrings2(String num1, String num2) {
        StringBuilder s = new StringBuilder();
        int carry = 0, i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            int x = i < 0 ? 0 : num1.charAt(i--) - '0';
            int y = j < 0 ? 0 : num2.charAt(j--) - '0';
            int sum = x + y + carry;
            //插入到s字符串的第一个位置
            s.insert(0, sum % 10);
            carry = sum / 10;
        }
        return s.toString();
    }


    public static void main(String[] args) {
        String str1 = "12345678";
        String str2 = "12345678";
        System.out.println(addStrings(str1, str2));
    }
}
