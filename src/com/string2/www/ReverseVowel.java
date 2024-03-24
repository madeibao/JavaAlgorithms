package com.string2.www;

/**
 * @ClassName ReverseVowel
 * @Author：Mayuan
 * @Date 2024/3/17/0017 20:12
 * @Description TODO
 * @Version 1.0
 **/
public class ReverseVowel {
    static String reverseAa(String s) {

        char[] chs = s.toCharArray();
        int n= chs.length;
        int i= 0;
        int j= chs.length-1;

        while (i<j) {
            while (i<n&&!vowel(chs[i])) {
                i++;
            }
            while(j>=0&&!vowel(chs[j])) {
                j--;
            }
            if(i<j) {
                swap(chs, i, j);
                i++;
                j--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c:chs) {
            sb.append(c);
        }
        return sb.toString();
    }

    private static void swap(char[] arr, int a, int b) {
        char tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    static boolean vowel(char c) {
        String str = "AEIOUaeiou";
        return str.indexOf(c)!=-1;
    }

    public static void main(String[] args) {
        String str= "hello";
        System.out.println(reverseAa(str));
    }
}
