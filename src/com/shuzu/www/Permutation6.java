package com.shuzu.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Permutation6
 * @Author：Mayuan
 * @Date 2020/2/25 21:39
 * @Description TODO
 * @Version 1.0
 * <p>
 * 无重复字符串的排列组合。编写一种方法，计算某字符串的所有排列组合，字符串每个字符均不相同。
 * 示例1:
 * <p>
 * 输入：S = "qwe"
 * 输出：["qwe", "qew", "wqe", "weq", "ewq", "eqw"]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutation-i-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Permutation6 {

    public static void main(String[] args) {
        char[] chars = {'1', '2', '3', '4'};
        List<String> result = new ArrayList<>();
        result = stringFullPermutation(chars, 0, result);
        result.forEach(System.out::println);
    }

    private static List<String> stringFullPermutation(char[] chars, int i, List<String> res) {
        if (i == chars.length) {
            return res;
        }
        List<String> result = new ArrayList<>();
        if (i == 0) {
            result.add(String.valueOf(chars[i]));
        } else {
            for (String s : res) {
                for (int j = 0; j <= s.length(); j++) {
                    result.add(s.substring(0, j) + chars[i] + s.substring(j, s.length()));
                }
            }
        }
        return stringFullPermutation(chars, i + 1, result);
    }
}
