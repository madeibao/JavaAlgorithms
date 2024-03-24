package com.string.www;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName StringPermutation6
 * @Author：Mayuan
 * @Date 2020/5/6 9:45
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的排列，字典的逆序方式
 **/
public class StringPermutation6 {
    public ArrayList<String> getPermutation(String A) {
        // write code here
        ArrayList<String> list = new ArrayList<>();
        permutation(list, A.toCharArray(), 0);
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }

    public void permutation(ArrayList<String> list, char[] array, int k) {
        if (k == array.length) {
            list.add(new String(array));
            return;
        }
        for (int i = k; i < array.length; i++) {
            swap(array, i, k);
            permutation(list, array, k + 1);
            swap(array, i, k);
        }
    }

    public void swap(char[] array, int i, int j) {
        if (i != j) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void main(String[] args) {
        String s = "ABC";
        ArrayList<String> res = new StringPermutation6().getPermutation(s);
        res.forEach(System.out::println);
    }
}
