package com.string.www;

/**
 * @program: JavaWorkSpace2->StringFirstChar
 * @description: 第一个只出现一次的字符内容
 * @author: MaYuan
 * @create: 2020-02-14 14:55
 * @version: 1.0
 **/
public class StringFirstChar {
    public static char findFirstNoRepeatChar(String str) {
        if (str == null || str.trim().length() == 0) {
            return '0';
        }
        int[] counts = new int[26];
        // 统一一个字符，防止出现大小写的混乱。
        str = str.toLowerCase();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            counts[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < len; i++) {
            if (counts[str.charAt(i) - 'a'] == 1) {
                return str.charAt(i);
            }
        }
        return '0';
    }

    /**
     * 在一个字符串寻找第一次出现的字符内容。
     *
     * @param s
     * @return
     */
    public static char firstUniqueChar(String s) {
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                temp = i;
                // 如果找到的话，就立刻进行终止。
                break;
            }
        }
        return s.charAt(temp);
    }

    /** leetcode通过的版本**/
    public static char firstUniqChar2(String s) {
        int[] tmp = new int[26];
        char[] c = s.toCharArray();
        for(char ch : c) {
            tmp[ch - 'a']++;
        }
        for(char ch : c){
            if(tmp[ch - 'a'] == 1) {
                return ch;
            }
        }
        return ' ';
    }
    public static void main(String[] args) {
        System.out.println(findFirstNoRepeatChar("abaccdeff"));
        System.out.println(firstUniqueChar("abaccdeff"));
    }
}
