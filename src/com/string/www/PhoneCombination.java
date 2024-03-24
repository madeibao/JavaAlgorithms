package com.string.www;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName PhoneCombination
 * @Author：Mayuan
 * @Date 2020/11/4 19:44
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的电话号码的组合。
 **/
public class PhoneCombination {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();

        // 如果字符串为空，长度为0的条件。
        if (digits == null || digits.length() == 0) {
            return list;
        }
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        StringBuilder sb = new StringBuilder();
        backTrack(list, digits, map, 0, sb);
        return list;
    }

    private void backTrack(List<String> list, String digits, Map<Character, String> map, int index, StringBuilder sb) {

        // recursion teminator
        if (sb.length() == digits.length()) {
            list.add(sb.toString());
            return;
        }

        // process current logic

        // 从下标0 开始进行。
        // 获得的是一个字符串。
        String value = map.get(digits.charAt(index));
        for (int j = 0; j < value.length(); j++) {

            // drill down
            backTrack(list, digits, map, index + 1, sb.append(value.charAt(j)));

            // 回退状态值。
            // reverse states
            // 删除最后的一个。
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        String str = "23";
        List<String> res = new PhoneCombination().letterCombinations(str);
        res.forEach(System.out::println);
    }
}
