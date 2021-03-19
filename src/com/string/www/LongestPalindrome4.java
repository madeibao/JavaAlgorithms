package com.string.www;

/**
 * @ClassName LongestPalindrome4
 * @Author：Mayuan
 * @Date 2020/3/23 18:03
 * @Description TODO
 * @Version 1.0
 **/

public class LongestPalindrome4 {
    public static String longestPalindrome(String s) {
        if (s.equals("")) {
            return "";
        }
        int length = s.length();
        String reversal = new StringBuffer(s).reverse().toString();
        int[][] cell = new int[length][length];

        // 最长的回文字符串长度
        int maxLen = 0;

        // 回文字符串结束位置
        int maxEnd = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (reversal.charAt(i) == s.charAt(j)) {
                    if (i == 0 || j == 0) {
                        cell[i][j] = 1;
                    } else {
                        cell[i][j] = cell[i - 1][j - 1] + 1;
                    }
                }
                /**************相比最长公共子串，修改的地方***************************/
                // 可为空，不用置为0，减少运行时间
//                else {
//                    cell[i][j] = 0;
//                }
                /**************************************************/
                if (cell[i][j] > maxLen) {
                    /**************相比最长公共子串，修改的地方***************************/
                    // 反向子串末尾字符的原始索引
                    int beforeIndex = length - 1 - i;
                    // 子串的首字符索引
                    int firstIndex = j - cell[i][j] + 1;
                    if (beforeIndex == firstIndex) {
                        maxLen = cell[i][j];
                        maxEnd = j;
                    }
                    /**************************************************/
                }
            }
        }

        // 返回截取的字符串长度值。
        return s.substring(maxEnd + 1 - maxLen, maxEnd + 1);
    }

    public static void main(String[] args) {

        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
