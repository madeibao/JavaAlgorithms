package com.algorithm.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName SetApple2
 * @Author：Mayuan
 * @Date 2020/4/8 22:30
 * @Description TODO
 * @Version 1.0
 * <p>
 * 放置苹果的算法2
 * <p>
 * 输入 7 3
 * 7个苹果放在3个盘里面的放置方法。
 * 输出 8
 **/
public class SetApple2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = bReader.readLine()) != null) {
            String[] strs = str.split(" ");
            int m = Integer.parseInt(strs[0]);
            int n = Integer.parseInt(strs[1]);
            System.out.println(getResult(m, n));
        }
    }

    private static int getResult(int m, int n) {
        if (m == 0 || n == 1) {
            return 1;
        }
        if (m < n) {
            return getResult(m, m);
        }
        return getResult(m, n - 1) + getResult(m - n, n);
    }
}