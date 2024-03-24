package com.string.www;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName StringPermutation8
 * @Author：Mayuan
 * @Date 2020/11/3 8:50
 * @Description TODO
 * @Version 1.0
 * <p>
 * 有重复字符的全排列的实现
 * <p>
 * "aab";
 * <p>
 * aab
 * aba
 * baa
 **/
public class StringPermutation8 {

    public ArrayList<String> permuaiton(String str) {
        ArrayList<String> res = new ArrayList<String>();
        if (str == null || str.length() == 0) {
            return res;
        }
        helper(res, str.toCharArray(), 0);
        Collections.sort(res);
        return res;
    }

    public void helper(ArrayList<String> res, char[] ch, int start) {
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


    public void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }


    public static void main(String[] args) {
        String str = "aab";
        ArrayList<String> res = new StringPermutation8().permuaiton(str);
        for (String re : res) {
            System.out.println(re);
        }
    }
}
