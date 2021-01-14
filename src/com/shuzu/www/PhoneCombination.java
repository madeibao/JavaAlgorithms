package com.shuzu.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName phoneCombination
 * @Author：Mayuan
 * @Date 2020/9/29 15:59
 * @Description TODO
 * @Version 1.0
 * 电话号码的组合的问题
 * 数字和字母的组合的问题。
 **/
public class PhoneCombination {
    List<String> res = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    int index = 0;

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return res;
        }
        backtrack(digits, 0);
        return res;
    }

    private void backtrack(String digits, int index) {
        if (sb.length() == digits.length()) {
            res.add(sb.toString());
            return;
        }

        // 回溯法来进行查找。
        char c = digits.charAt(index);
        String s = convert(c);
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            backtrack(digits, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    private String convert(char c) {
        if (c == '2') return "abc";
        if (c == '3') return "def";
        if (c == '4') return "ghi";
        if (c == '5') return "jkl";
        if (c == '6') return "mno";
        if (c == '7') return "pqrs";
        if (c == '8') return "tuv";
        if (c == '9') return "wxyz";
        return "";
    }

    public static void main(String[] args) {
        List<String> res = new PhoneCombination().letterCombinations("23");
        res.forEach(System.out::println);
    }
}
