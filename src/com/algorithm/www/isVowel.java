package com.algorithm.www;

/**
 * @ClassName isVowel
 * @Author：Mayuan
 * @Date 2020/12/8/0008 20:28
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断是否为元音字母。
 **/
public class isVowel {

    private static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'U' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isVowel('c'));
    }
}
