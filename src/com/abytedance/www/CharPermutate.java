package com.abytedance.www;

import java.util.Arrays;

/**
 * @ClassName CharPermutate
 * @Author：Mayuan
 * @Date 2021/4/1/0001 14:31
 * @Description TODO
 * @Version 1.0
 *
 * 字符串的全排列值。
 *
 **/
public class CharPermutate {
    static void permutate(char[]ch, int left, int right) {
        if(right<=1) {
            return;
        }
        if(left==right) {
            System.out.println(Arrays.toString(ch));
        }

        for(int i=left;i<=right;i++) {
            swap(ch,i,left);
            permutate(ch,left+1, right);
            swap(ch,i,left);
        }
    }

    static void swap(char[] ch, int i, int j) {
        char c = ch[i];
        ch[i] = ch[j];
        ch[j] = c;
    }

    public static void main(String[] args) {
        char[] ch ={'a','b','c'};
        permutate(ch, 0, 2);
    }
}
