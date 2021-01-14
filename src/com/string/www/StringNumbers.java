package com.string.www;

import java.util.Scanner;

/**
 * @ClassName StringNumbers
 * @Author：Mayuan
 * @Date 2020/6/4 21:39
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的数组表示。
 * 数字阿格雷编码问题总结
 * 每个相邻的编码，总是有一个位置的字符不同。
 **/
public class StringNumbers {

    public static String[] getGray(int n) {
        // write code here
        if (n == 1) {
            String[] result = new String[2];
            result[0] = "0";
            result[1] = "1";
            return result;
        } else {
            String[] temp = getGray(n - 1);
            String[] result = new String[temp.length * 2];
            for (int i = 0; i < temp.length; i++) {
                result[i] = "0" + temp[i];
            }
            for (int i = 0; i < temp.length; i++) {
                result[i + temp.length] = "1" + temp[temp.length - i - 1];
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] res = getGray(sc.nextInt());
        for (String t : res) {
            System.out.println(t);
        }
    }
}
