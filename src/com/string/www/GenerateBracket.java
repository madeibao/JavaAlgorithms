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
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        helper(n, n, "", res);
        return res;
    }

    static void helper(int left, int right, String out, List<String> res) {
        if (left < 0 || right < 0 || left > right) {
            return;
        }

        if (left == 0 && right == 0) {
            res.add(out);
            return;
        }
        helper(left - 1, right, out + "(", res);
        helper(left, right - 1, out + ")", res);
    }


    public static void main(String[] args) {
        int num = 4;
        List<String> res = generateParenthesis(num);
        res.forEach(System.out::println);
    }
}
