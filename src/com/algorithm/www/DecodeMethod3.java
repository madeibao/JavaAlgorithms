package com.algorithm.www;

/**
 * @ClassName DecodeMethod3
 * @Author：Mayuan
 * @Date 2020/11/6 16:23
 * @Description TODO
 * @Version 1.0
 **/
public class DecodeMethod3 {
    public static int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n];
        if (s.charAt(0) == '0') {
            return 0;
        }
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != '0') {
                dp[i] += dp[i - 1];
            }
            if (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) <= '6')) {
                if (i - 2 >= 0) {
                    dp[i] += dp[i - 2];
                } else {
                    dp[i] += 1;
                }
            }
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        String str = "13";
        System.out.println(numDecodings(str));
    }
}
