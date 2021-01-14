package com.string.www;

import java.util.ArrayList;

/**
 * @ClassName StringPermutation9
 * @Author：Mayuan
 * @Date 2020/11/3 9:40
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字母的大小写的全排列的值。
 **/
public class StringPermutation9 {

    private ArrayList<String> permuation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return res;
        }

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
        if (ch[start] < '0' || ch[start] > '9') {
            ch[start] ^= (1 << 5);
            helper(res, ch, start + 1);
        }
    }

    public static void main(String[] args) {

        String str = "a1b2";
        ArrayList<String> res = new StringPermutation9().permuation(str);
        for (String re : res) {
            System.out.println(re);
        }
    }
}
