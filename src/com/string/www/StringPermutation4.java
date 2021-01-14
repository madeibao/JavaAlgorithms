package com.string.www;

import java.util.ArrayList;

/**
 * @ClassName StringPermutation4
 * @Author：Mayuan
 * @Date 2020/3/17 19:09
 * @Description TODO
 * @Version 1.0
 * <p>
 * 包含有重复的字符串的全排列
 **/
public class StringPermutation4 {

    ArrayList<String> res = new ArrayList<>();

    public String[] permutation(String s) {
        char[] ch = s.toCharArray();
        dfs(ch, 0);
        String[] str = new String[res.size()];
        if (s == null || s.length() == 0) {
            return str;
        }
        for (int i = 0; i < res.size(); i++) {
            str[i] = res.get(i);
        }
        return str;
    }

    private void dfs(char[] ch, int start) {
        if (start == ch.length) {
            res.add(new String(ch));
            return;
        }
        boolean[] used = new boolean[256];
        for (int i = start; i < ch.length; i++) {
            if (used[ch[i]]) {
                continue;
            }
            used[ch[i]] = true;
            swap(ch, start, i);
            dfs(ch, start + 1);
            swap(ch, start, i);
        }
    }

    private void swap(char[] ch, int i, int j) {
        char tmp = ch[i];
        ch[i] = ch[j];
        ch[j] = tmp;
    }

    public static void main(String[] args) {
        String[] res = new StringPermutation4().permutation("aab");
        for (String c : res) {
            System.out.print(c + " ");
        }
    }
}





