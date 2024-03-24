package com.string.www;

/**
 * @ClassName ComposeWords
 * @Author：Mayuan
 * @Date 2020/4/15 11:19
 * @Description TODO
 * @Version 1.0
 **/
public class ComposeWords {
    public static boolean canConstruct3(String ransomNote, String magazine) {
        int[] countR = new int[26];
        int[] countM = new int[26];
        for (char c : ransomNote.toCharArray())
            countR[c - 'a'] += 1;
        for (char c : magazine.toCharArray())
            countM[c - 'a'] += 1;
        for (int i = 0; i < 26; i++) {
            if (countR[i] > countM[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct3("aa", "aab"));
    }

}
