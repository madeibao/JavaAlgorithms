package com.algorithm.www;

/**
 * @ClassName BigNumberAdd2
 * @Author：Mayuan
 * @Date 2020/3/21 11:03
 * @Description TODO
 * @Version 1.0
 **/
public class BigNumberAdd2 {

    private static String add(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();

        int len = len1 > len2 ? len1 : len2;

        // temp 代表的是进位

        int temp = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {

            int elementA = 0;
            if (i < len1) {
                elementA = Integer.valueOf(String.valueOf(a.charAt(len1 - i - 1)));
            }

            int elementB = 0;

            if (i < len2) {
                elementB = Integer.valueOf(String.valueOf(b.charAt(len2 - i - 1)));
            }

            int value = temp + elementA + elementB;
            if (value > 10) {
                temp = 1;
            } else {
                temp = 0;
            }
            sb.insert(0, value % 10);
        }

        if (temp != 0) {
            sb.insert(0, temp);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String a = "1111";
        String b = "2222";
        System.out.println(add(a, b));
    }
}
