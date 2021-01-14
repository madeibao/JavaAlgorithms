package com.string.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StringPermutation2
 * @Author：Mayuan
 * @Date 2020/3/17 18:23
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的全排列
 **/
public class StringPermutation2 {
    List<String> list = new ArrayList<>();

    public String[] permutation(String s) {
        char[] ch = s.toCharArray();
        permutate(ch, 0);
        String[] array = list.toArray(new String[list.size()]);
        return array;
    }

    public void permutate(char[] nums, int first) {
        if (first == nums.length - 1) {
            list.add(new String(nums));
            return;
        }
        for (int i = first; i < nums.length; i++) {
            swap(nums, first, i);
            permutate(nums, first + 1);
            swap(nums, first, i);
        }
    }

    public void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public static void main(String[] args) {
        String s = "qwe";
        String[] ch = new StringPermutation2().permutation(s);
        for (String c : ch) {
            System.out.print(c + " ");
        }
    }
}
