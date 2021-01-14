package com.string.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName CommonString3
 * @Author：Mayuan
 * @Date 2020/6/16 20:12
 * @Description TODO
 * @Version 1.0
 * <p>
 * 最长的公共子串。
 * 求公共的子串，不是子序列。
 **/
public class CommonString3 {
    public static String process(String str1, String str2) {
        if (str1 == null || str2 == null || str1.equals("")
                || str2.equals("")) {
            return "";
        }
        char[] chas1 = str1.toCharArray();
        char[] chas2 = str2.toCharArray();
        int row = 0;
        int col = chas2.length - 1;
        int max = 0;
        int end = -1;
        int len = 0;
        while (row < chas1.length) {
            int i = row;
            int j = col;
            len = 0;
            while (i < chas1.length && j < chas2.length) {
                if (chas1[i] == chas2[j]) {
                    len++;
                } else {
                    len = 0;
                }
                if (len > max) {
                    max = len;
                    end = i;
                }
                i++;
                j++;
            }

            if (col > 0) {
                col--;
            } else {
                row++;
            }
        }

        return end == -1 ? "" : str1.substring(end - max + 1, end + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        String res = process(str1, str2);
        if (res.equals("")) {
            System.out.println(-1);
        } else {
            System.out.println(res);
        }
    }
}
