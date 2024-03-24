package com.shuzu.www;

/**
 * @ClassName SameStructure
 * @Author：Mayuan
 * @Date 2020/10/28 9:38
 * @Description TODO
 * @Version 1.0
 * <p>
 * 相同的结构，字符串。
 **/
public class SameStructure {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
            map[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (map[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        String s2 = "abb";
        String s3 = "bcc";
        System.out.println(isAnagram(s2, s3));
        System.out.println(isAnagram(s, t));
    }
}
