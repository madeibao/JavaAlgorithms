package com.string.www;

/**
 * @ClassName buddyString
 * @Author：Mayuan
 * @Date 2020/4/17 21:13
 * @Description TODO
 * @Version 1.0
 * <p>
 * 两个亲密的字符串的结果值
 * 如果一个字符串中的两个字符交换可以得到另外的一个字符，则为亲密字符串。
 * 判断是否为亲密的字符串。
 **/
public class BuddyString {
    public static boolean buddyStrings(String A, String B) {
        int[] cnt = new int[26];
        if (A.length() != B.length()) {
            return false;
        }
        //两个字符串内容相等
        if (A.equals(B)) {
            for (int i = 0; i < A.length(); i++) {
                cnt[A.charAt(i) - 'a']++;
                if (cnt[A.charAt(i) - 'a'] >= 2) {
                    return true;
                }
            }
            return false;
        }
        //两个字符串内容不相等
        int diffCnt = 0;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                diffCnt++;
                index1 = A.charAt(i) - 'a';
                index2 = B.charAt(i) - 'a';
            }
            if (diffCnt > 2) {
                return false;
            }
            cnt[A.charAt(i) - 'a']++;
            cnt[B.charAt(i) - 'a']--;
        }

        if (cnt[index1] != 0 || cnt[index2] != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "aaaaaaabc";
        String s2 = "aaaaaaacb";
        System.out.println(buddyStrings(s1, s2));
    }
}
