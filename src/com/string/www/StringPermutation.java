package com.string.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StringPermutation
 * @Author：Mayuan
 * @Date 2020/2/25 20:31
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串内容的全排列
 * 无重复字符串的排列组合。编写一种方法，计算某字符串的所有排列组合，字符串每个字符均不相同。
 * <p>
 * 示例1:
 * <p>
 * 输入：S = "qwe"
 * 输出：["qwe", "qew", "wqe", "weq", "ewq", "eqw"]
 * 示例2:
 * <p>
 * 输入：S = "ab"
 * 输出：["ab", "ba"]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutation-i-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class StringPermutation {
    public static String[] permutation(String S) {
        if (S.length() == 0) {
            return new String[0];
        }
        List<String> list = new ArrayList<>();
        backtrack("", S, list);
        return list.toArray(new String[list.size()]);
    }

    private static void backtrack(String combination, String str, List<String> list) {
        if (combination.length() == str.length()) {
            list.add(combination);
            return;
        }
        for (int i = 0; i < str.length(); ++i) {
            if (combination.indexOf(str.charAt(i)) < 0) {
                backtrack(combination + str.charAt(i), str, list);
            }
        }
    }

    public static void main(String[] args) {
        String s = "qwe";
        String[] s2 = permutation(s);
        for (String s3 : s2) {
            System.out.print(s3 + " ");
        }
    }
}
