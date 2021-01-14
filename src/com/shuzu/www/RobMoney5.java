package com.shuzu.www;

/**
 * @ClassName RobMoney5
 * @Author：Mayuan
 * @Date 2020/10/12 18:51
 * @Description TODO
 * @Version 1.0
 * 房屋的抢劫。
 **/
public class RobMoney5 {

    public static int rob(int[] arr) {
        if (arr.length == 0 || arr == null) {
            return 0;
        }

        if (arr.length == 1) {
            return arr[0];
        }

        if (arr.length == 2) {
            return Math.max(arr[0], arr[1]);
        }

        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++) {
            dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 1]);
        }
        return dp[arr.length - 1];
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(rob(arr));
    }
}



