package com.string.www;

/**
 * @ClassName ReverseOnlyAlpha
 * @Author：Mayuan
 * @Date 2020/3/30 17:10
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个字符串中，翻转的只是其中的字母
 **/
public class ReverseOnlyAlpha {
    public static String reverseOnlyLetters(String S) {
        StringBuilder ans = new StringBuilder();
        int j = S.length() - 1;
        for (int i = 0; i < S.length(); ++i) {
            if (Character.isLetter(S.charAt(i))) {
                while (!Character.isLetter(S.charAt(j))) {
                    j--;
                }
                ans.append(S.charAt(j--));
            } else {
                ans.append(S.charAt(i));
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));
    }
}

