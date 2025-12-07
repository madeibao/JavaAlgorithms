package com.string2.www;

/**
 * java的split 算法介绍
 *
 * @ClassName SplitTest
 * @Author Mayuan
 * @Date 2025/12/7/星期日 17:32
 * @Version 1.0
 **/
public class SplitTest {

    public static void main(String[] args) {
        String str = "1+-1i";

        String[] strs = str.split("\\+|i");
        // 首先按照”+“ 号来分割，然后按照 i 字符来分割
        //  \\ 表示转义， 后面有 + 和 i 两个分隔符

        System.out.println(strs[0]);  // 1
        System.out.println(strs[1]);  // -1
    }
}
