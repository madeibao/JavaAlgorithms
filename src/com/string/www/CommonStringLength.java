package com.string.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName CommonStringLength
 * @Author：Mayuan
 * @Date 2020/4/9 12:27
 * @Description TODO
 * @Version 1.0
 * <p>
 * 题目标题：
 * 有两个字符串（可能包含空格）,请找出其中最长的公共连续子串,输出其长度。
 * 计算两个字符串的最大公共字串的长度，字符不区分大小写
 * <p>
 * 详细描述：
 * <p>
 * 接口说明
 * <p>
 * 原型：
 * <p>
 * int getCommonStrLength(char * pFirstStr, char * pSecondStr);
 * <p>
 * 输入参数：
 * <p>
 * char * pFirstStr //第一个字符串
 * <p>
 * char * pSecondStr//第二个字符串
 * <p>
 * <p>
 * 输入描述:
 * 输入两个字符串
 * <p>
 * 输出描述:
 * 输出一个整数
 * <p>
 * 示例1
 * 输入
 * 复制
 * asdfas werasdfaswer
 * 输出
 * 复制
 * 6
 **/
public class CommonStringLength {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string1 = "";
        while ((string1 = bufferedReader.readLine()) != null) {
            String string2 = bufferedReader.readLine();
            char[] str1 = string1.toCharArray();
            char[] str2 = string2.toCharArray();
            int[][] dp = new int[str1.length][str2.length];
            for (int i = 0; i < str1.length; i++) {
                if (str1[i] == str2[0]) {
                    dp[i][0] = 1;
                }
            }
            for (int j = 1; j < str2.length; j++) {
                if (str2[j] == str1[0]) {
                    dp[0][j] = 1;
                }
            }


            int max = 0;
            for (int i = 1; i < str1.length; i++) {
                for (int j = 1; j < str2.length; j++) {
                    if (str1[i] == str2[j]) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                    max = Math.max(max, dp[i][j]);
                }
            }
            System.out.println(max);
        }
    }
}


