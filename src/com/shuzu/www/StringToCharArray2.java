package com.shuzu.www;

/**
 * @ClassName StringToCharArray2
 * @Author：Mayuan
 * @Date 2020/2/25 21:09
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串变成字符数组来进行存储
 **/
public class StringToCharArray2 {

    public static void main(String[] args) {

        String str = "abc";
        char[] ch = str.toCharArray();
        for (char c : ch) {
            System.out.print(c + " ");
        }
    }
}



