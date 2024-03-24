package com.string.www;

import java.util.ArrayList;

/**
 * @ClassName StringPermutationAa
 * @Author：Mayuan
 * @Date 2020/11/3 10:56
 * @Description TODO
 * @Version 1.0
 **/
public class StringPermutationAa {


    private ArrayList<String> permuation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return res;
        }
        helper(res, str.toCharArray(), 0);
        return res;
    }

    private void helper(ArrayList<String> res, char[] ch, int start) {
        if (start == ch.length) {
            res.add(String.valueOf(ch));
            return;
        }

        helper(res, ch, start + 1);
        if (Character.isLetter(ch[start])) {
            ch[start] ^= (1 << 5);
            helper(res, ch, start + 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> res = new StringPermutationAa().permuation("A1b2");
        res.forEach(System.out::println);

    }
}
