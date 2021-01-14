package com.string.www;

/**
 * @ClassName FindDifference
 * @Author：Mayuan
 * @Date 2020/3/21 18:05
 * @Description TODO
 * @Version 1.0
 * <p>
 * 找出两个字符串中的不同的一个字符
 **/
public class FindDifference {

    public static char findTheDifference(String s, String t) {
        int res = 0;
        for (char c : s.toCharArray()) {
            res ^= c;
        }

        for (char c : t.toCharArray()) {
            res ^= c;
        }
        return (char) res;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcde";
        System.out.println(findTheDifference(s1, s2));
    }
}


