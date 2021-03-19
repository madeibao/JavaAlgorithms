package com.string.www;

/**
 * @ClassName LongestPalindromeTest
 * @Author：Mayuan
 * @Date 2021/3/17/0017 20:35
 * @Description TODO
 * @Version 1.0
 *
 * 最长的回文子串测试。
 *
 **/
public class LongestPalindromeTest {

    public static String longestPalindrome(String s) {
        int len = s.length();

        // 代表本身就一个字符。
        if(len <2) {
            //特判
            return s;
        }

        int maxLen = 1;
        String res = s.substring(0, 1);

        //i为回文字符串中心 只要遍历到len-2这个位置
        for(int i=0; i<len-1; i++) {
            //中心位置为i位置字符的回文子串
            String oddString = palindrome(s,i,i);
            //中心位置为i与i+1位置字符的回文子串
            String evenString = palindrome(s,i,i+1);
            //确定以哪个长度更长
            String str = oddString.length() > evenString.length()?oddString: evenString;
            if(str.length() > maxLen){
                maxLen = str.length();
                res = str;
            }
        }

        // 返回结果指。
        return res;
    }
    static String palindrome(String s, int i, int j){ //以i,j为中心，向左右两端扩散
        while(i>=0 && j<s.length()) {
            if(s.charAt(i)==s.charAt(j)) {
                i--;
                j++;
            }
            else  {
                break;
            }
        }
        //注意：跳出循环的时，要么s.charAt(i)==s.charAt(j)不满足，要么i,j下标越界，因此回文子串不应该包括下表为i,j的字符
        return s.substring(i+1,j);
    }

    public static void main(String[] args) {
        String str = "babad";
        System.out.println(longestPalindrome(str));
    }



}
