package com.string.www;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @ClassName ExchangeVowels
 * @Author：Mayuan
 * @Date 2020/5/8 20:31
 * @Description TODO
 * @Version 1.0
 * 交换字符串中的元音字母
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "hello"
 * 输出: "holle"
 **/
public class ExchangeVowels {

    private final static HashSet<Character> vowel = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public static String reverseVowels(String s) {
        if (s == null) {
            return null;
        }
        char[] res = new char[s.length()];
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            char s1 = s.charAt(i);
            char s2 = s.charAt(j);

            // 如果左面的不是元音字母
            if (!vowel.contains(s1)) {
                res[i++] = s1;
            }

            // 如果右面的不是元音字母
            else if (!vowel.contains(s2)) {
                res[j--] = s2;
            } else {
                res[i++] = s2;
                res[j--] = s1;
            }
        }
        return new String(res);
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}
