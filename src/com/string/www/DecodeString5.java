package com.string.www;

/**
 * @ClassName DecodeString5
 * @Author：Mayuan
 * @Date 2020/6/11 19:37
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的解码方法4
 * <p>
 * 字符串的解码方法2
 **/
public class DecodeString5 {

    public static int translateNum(int num) {

        // 首先解码成为字符串的形式来进行。
        String s = String.valueOf(num);
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= s.length(); i++) {
            String temp = s.substring(i - 2, i);
            if (temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0)
                dp[i] = dp[i - 1] + dp[i - 2];
            else
                dp[i] = dp[i - 1];
        }
        return dp[s.length()];
    }


    public static void main(String[] args) {
        int num = 55;
        System.out.println(translateNum(num));

    }
}
