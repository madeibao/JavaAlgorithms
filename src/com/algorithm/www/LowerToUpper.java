package com.algorithm.www;

/**
 * @ClassName LowerToUpper
 * @Author：Mayuan
 * @Date 2020/8/24 22:09
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符的大小写的转换。
 **/
public class LowerToUpper {

    public static void main(String[] args) {

        // 字符的大小写的转换
        char a = 'a';
        System.out.println((char) (a ^ (1 << 5)));

        char B = 'B';
        System.out.println((char) (B ^ (1 << 5)));
    }
}
