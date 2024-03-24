package com.string.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GenerateBracket
 * @Author：Mayuan
 * @Date 2020/5/1 22:55
 * @Description TODO
 * @Version 1.0
 * <p>
 * 给定一个数字来生成一个合法的括号结果
 **/
public class GenerateBracket {

    private static List<String> generate(int n) {

        List<String> res = new ArrayList<>();
        if (n < 0) {
            return res;
        }

        helper(n, n, "", res);
        return res;
    }

    private static void helper(int left, int right, String temp, List<String> list) {
        if (left < 0 || right < 0 || left > right) {
            return;
        }
        if (left == 0 && right == 0) {
            list.add(temp);
        }

        helper(left - 1, right, temp + "(", list);
        helper(left, right - 1, temp + ")", list);
    }

    public static void main(String[] args) {
        List<String> temp = generate(3);
        temp.forEach(System.out::println);
    }
}
