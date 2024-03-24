package com.string.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Generate
 * @Author：Mayuan
 * @Date 2020/10/30 14:14
 * @Description TODO
 * @Version 1.0
 * <p>
 * 用来生成字符串的值。
 * n =2
 * (())
 * ()()
 **/
public class Generate {
    static List<String> list = new ArrayList<>();

    private static List<String> generate(int n) {
        helper("", n, n);
        return list;
    }

    private static void helper(String s, int left, int right) {
        if (left == 0 && right == 0) {
            list.add(s);
            return;
        }
        if (left > right) {
            return;
        }
        if (left < 0 || right < 0) {
            return;
        }
        helper(s + "(", left - 1, right);
        helper(s + ")", left, right - 1);
    }

    public static void main(String[] args) {
        int n = 2;
        List<String> res = generate(n);
        for (String re : res) {
            System.out.println(re);
        }
    }
}
