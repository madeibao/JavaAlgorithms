package com.algorithm.www;

/**
 * @ClassName BigNumberAdd3
 * @Author：Mayuan
 * @Date 2020/3/21 21:42
 * @Description TODO
 * @Version 1.0
 * <p>
 * 两个字符串的内容进行相加和。
 **/
public class BigNumberAdd3 {
    public static String addString(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int flag = 0;
        int lenA = s1.length() - 1;
        int lenB = s2.length() - 1;

        for (int i = lenA, j = lenB; i >= 0 || j >= 0; i--, j--) {
            char c1 = i < 0 ? '0' : s1.charAt(i);
            char c2 = j < 0 ? '0' : s2.charAt(j);
            int num = c1 - '0' + c2 - '0' + flag;
            sb.insert(0, num % 10);
            flag = num / 10;
        }
        // 如果是进位位1，则插入数字1， 否则，插入的是空字符串的值。
        sb.insert(0, flag == 1 ? 1 : "");
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "1111";
        String s2 = "222222222222222323232222";
        System.out.println(addString(s1, s2));
    }
}
