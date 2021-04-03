package com.string2.www;

/**
 * @ClassName LongestPalindrome2
 * @Author：Mayuan
 * @Date 2021/3/30/0030 14:30
 * @Description TODO
 * @Version 1.0
 **/
public class LongestPalindrome2 {

    static String longest(String str) {
        if(str==null||str.length()==0) {
            return null;
        }

        if(str.length()==1) {
            return str;
        }

        String res = str.substring(0,1);
        int maxLen = 1;
        for(int i=0;i<str.length()-1;i++) {
            String odd = helper(str,i,i);
            String even = helper(str,i,i+1);
            String temp = odd.length()>even.length()?odd:even;
            if(temp.length()>maxLen) {
                maxLen = temp.length();
                res = temp;
            }
        }
        return res;
    }

    static String helper(String str, int left, int right) {

        while (left>=0&&right<str.length()) {
            if(str.charAt(left)==str.charAt(right)) {
                left--;
                right++;
            }
            else {
                break;
            }
        }
        return str.substring(left+1,right);
    }
    public static void main(String[] args) {
        String str = "babad";
        System.out.println(longest(str));
    }
}
