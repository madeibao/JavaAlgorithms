package com.string.www;

/**
 * @ClassName StringSplit
 * @Author：Mayuan
 * @Date 2020/3/27 15:11
 * @Description TODO
 * @Version 1.0
 **/
public class StringSplit {

    public static void main(String[] args) {

        // IP地址的转换过程中给
        // 10.0.3.193
        // 如果要分割的，需要引用转义字符串的内容
        String s = "10.0.3.193";
        String[] test = s.split("\\.");
        for (String t : test) {
            System.out.print(t + " ");
        }
    }
}
