package com.string.www;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: JavaWorkSpace2->HuiWenPermatation
 * @description: 判断字符串的内容是否能够排列
 * @author: MaYuan
 * @create: 2020-02-06 17:26
 * @version: 1.0
 * <p>
 * 题目描述
 * 给定一个字符串，判断该字符串中是否可以通过重新排列组合，形成一个回文字符串。
 * <p>
 * code 则为false
 * 1313 则为true
 **/
public class HuiWenPermatation {
    public static boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        // 统计每个字符的个数
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer cnt = map.get(c);
            if (cnt == null) {
//                cnt = new Integer(0);
                cnt = 0;
            }
            map.put(c, ++cnt);
        }
        // 判断是否只有不大于一个的奇数次字符
        boolean hasOdd = false;
        for (Character c : map.keySet()) {
            if (map.get(c) % 2 == 1) {
                if (!hasOdd) {
                    hasOdd = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        String str = scc.next();
        System.out.println(canPermutePalindrome(str));
    }
}

