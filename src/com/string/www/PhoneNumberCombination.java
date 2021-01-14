package com.string.www;

/**
 * @ClassName PhoneNumberCombination
 * @Author：Mayuan
 * @Date 2020/4/2 18:21
 * @Description TODO
 * @Version 1.0
 * <p>
 * 电话号码的组合。
 **/

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberCombination {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.equals("") || digits == null) {
            return list;
        }
        String now_str = "";
        addNum(digits, 0, list, now_str);
        return list;
    }

    private static void addNum(String digits, int key, List<String> list, String now_str) {
        if (key == digits.length()) {
            list.add(now_str);
            return;
        }
        char[] values = getValue(digits.charAt(key));
        for (int i = 0; i < values.length; i++) {
            addNum(digits, key + 1, list, now_str + values[i]);
        }
    }


    private static char[] getValue(char num) {
        if (num == '2') {
            char nums[] = {'a', 'b', 'c'};
            return nums;
        } else if (num == '3') {
            char nums[] = {'d', 'e', 'f'};
            return nums;
        } else if (num == '4') {
            char nums[] = {'g', 'h', 'i'};
            return nums;
        } else if (num == '5') {
            char nums[] = {'j', 'k', 'l'};
            return nums;
        } else if (num == '6') {
            char nums[] = {'m', 'n', 'o'};
            return nums;
        } else if (num == '7') {
            char nums[] = {'p', 'q', 'r', 's'};
            return nums;
        } else if (num == '8') {
            char nums[] = {'t', 'u', 'v'};
            return nums;
        } else if (num == '9') {
            char nums[] = {'w', 'x', 'y', 'z'};
            return nums;
        }
        return null;
    }


    public static void main(String[] args) {

        String s = "23";
        List<String> res = new PhoneNumberCombination().letterCombinations(s);
        res.forEach(System.out::println);
    }
}

