package com.string2.www;

/**
 * @ClassName LongestPalindrome
 * @Author：Mayuan
 * @Date 2021/3/19/0019 12:43
 * @Description TODO
 * @Version 1.0
 *
 * 最长的回文子串
 *
 **/

public class LongestPalindrome {

    public static String longestPalindrome(String str) {
        if(str.length()<2) {
            return str;
        }

        int len= str.length();
        int maxLen = 1;
        String res = str.substring(0, 1);

        for(int i =0;i<len-1;i++) {
            String odd = helper(str, i, i);
            String even = helper(str,i,i+1);
            String temp = odd.length()>even.length()?odd:even;
            if(temp.length()>maxLen) {
                maxLen = temp.length();
                res = temp;
            }
        }
        return res;
    }

    public static String helper(String s, int i, int j)  {

        while(i>=0 && j<s.length()) {
            if(s.charAt(i)==s.charAt(j))  {
                i--;j++;
            }
            else  {
                break;
            }
        }
        //注意：跳出循环的时，要么s.charAt(i)==s.charAt(j)不满足，要么i,j下标越界，因此回文子串不应该包括下表为i,j的字符
        return s.substring(i+1,j);
    }
    public static void main(String[] args) {
        String str ="babad";
        System.out.println(longestPalindrome(str));

    }
}
