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

    private static boolean isVowelChar(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }

    public static boolean isVowel2(char c) {
        char[] ch = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char c1 : ch) {
            if (c == c1) {
                return true;
            }
        }
        return false;
    }

    public static boolean isVowel3(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    static boolean isVowel4(char c) {
        String str = "aeiouAEIOU";
        return str.indexOf(c) != -1;
    }

    static boolean isVowel5(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static boolean isVowelTest(char c) {
        return "aeiouAEIOU".contains(String.valueOf(c));
    }

    public static void main(String[] args) {
        System.out.println(isVowelTest('c'));
        System.out.println(isVowel3('a'));
    }
}
