package com.string.www;

import java.util.ArrayList;

/**
 * @ClassName StringPermutationAb
 * @Author：Mayuan
 * @Date 2020/11/4 8:32
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的排列组合
 **/
public class StringPermutationAb {
    private static ArrayList<String> permutation(String str) {

        ArrayList<String> res = new ArrayList<>();
        helper(res, str.toCharArray(), 0);
        return res;
    }

    private static void helper(ArrayList<String> res, char[] ch, int start) {
        if (start == ch.length) {
            res.add(String.valueOf(ch));
            return;
        }
        for (int i = start; i < ch.length; i++) {
            if (i != start && ch[i] == ch[start]) {
                continue;
            } else {
                swap(ch, i, start);
                helper(res, ch, start + 1);
                swap(ch, i, start);
            }
        }
    }

    private static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> res = permutation(str);
        res.forEach(System.out::println);
    }
}
