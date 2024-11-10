package com.string2.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName FindIndexTarget
 * @Author：Mayuan
 * @Date 2024/11/9/星期六 20:19
 * @Description TODO
 * @Version 1.0
 **/
public class FindIndexTarget {

    public static List<Integer> findAnagrams(String s, String p) {

        int m = s.length();
        int n = p.length();

        if (m < n) {
            return new ArrayList<>();
        }
        int[] sCount = new int[26];
        int[] pCount = new int[26];

        for (int i = 0; i < n; i++) {
            ++sCount[s.charAt(i) - 'a'];
            ++pCount[p.charAt(i) - 'a'];
        }

//        for(int i=0;i<sCount.length;i++) {
//            System.out.print(sCount[i]+" ");
//        }
//        System.out.println();
//        for(int i=0;i<sCount.length;i++) {
//            System.out.print(pCount[i]+" ");
//        }
        ArrayList<Integer> result = new ArrayList<>();
        if (Arrays.equals(sCount, pCount)) {
            result.add(0);
        }
        for (int i = 0; i < m - n; i++) {
            // 移除第一个字母
            --sCount[s.charAt(i) - 'a'];
            // 尾部添加字母
            ++sCount[s.charAt(i + n) - 'a'];
            if (Arrays.equals(sCount, pCount)) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacdabcabcabc", p = "abc";
        System.out.println(findAnagrams(s, p));
    }
}
