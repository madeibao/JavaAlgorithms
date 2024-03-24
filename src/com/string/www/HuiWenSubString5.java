package com.string.www;

/**
 * @ClassName HuiWenSubString5
 * @Author：Mayuan
 * @Date 2020/5/12 21:35
 * @Description TODO
 * @Version 1.0
 * <p>
 * 给定一个字符串，判断出其中的回文子字符串
 * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 * <p>
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abc"
 * 输出: 3
 * 解释: 三个回文子串: "a", "b", "c".
 * 示例 2:
 * <p>
 * 输入: "aaa"
 * 输出: 6
 * 说明: 6个回文子串: "a", "a", "a", "aa", "aa", "aaa".
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindromic-substrings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class HuiWenSubString5 {
    int num = 0;

    public int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            //回文串长度为奇数
            count(s, i, i);
            //回文串长度为偶数
            count(s, i, i + 1);
        }
        return num;
    }

    public void count(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            num++;
            start--;
            end++;
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(new HuiWenSubString5().countSubstrings(str));
    }
}
