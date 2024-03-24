package com.string.www;

/**
 * @ClassName StringToInteger2
 * @Author：Mayuan
 * @Date 2020/3/2 16:22
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串变成数字的形式来存储。
 **/
public class StringToInteger2 {
    public static int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        String str1 = str.trim();
        //去掉字符串中开始和结尾的空格
        if (str1.length() == 0) {
            return 0;
        }
        //默认正数计算
        int flag = 1;
        //默认无符号从0开始
        int i = 0;
        if (str1.charAt(0) == '-') {
            flag = -1;
            i = 1;
        } else if (str1.charAt(0) == '+') {
            i = 1;
        }
        int ans = 0;
        while (i < str1.length() && str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
            //转化为数字 包括符号
            int n = (str1.charAt(i) - '0') * flag;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && n > 7)) {
                return Integer.MAX_VALUE;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && n < -8)) {
                return Integer.MIN_VALUE;
            }
            ans = ans * 10 + n;
            i++;
        }
        return ans;

    }

    public static void main(String[] args) {
        String str = "-4193 with words";
        System.out.println(myAtoi(str));
    }
}



