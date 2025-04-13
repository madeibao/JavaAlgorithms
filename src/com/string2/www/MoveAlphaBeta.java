package com.string2.www;

/**
 * 有效的字母异位词
 *
 * @ClassName MoveAlphaBeta
 * @Author：Mayuan
 * @Date 2025/4/13/星期日 10:19
 * @Description TODO
 * @Version 1.0
 **/
public class MoveAlphaBeta {
    public static boolean isAnagram(String s, String t) {
        int[] chs = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chs[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            chs[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (chs[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagara";
        System.out.println(isAnagram(s, t));
    }
}
