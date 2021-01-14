package com.string.www;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @ClassName StringMatch
 * @Author：Mayuan
 * @Date 2020/7/14 21:15
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的匹配操作。
 **/
public class StringMatch {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        String[] array = str.split(" ");

        if (pattern.length() != array.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            if (!map.containsKey(key)) {
                if (set.contains(array[i])) {
                    return false;
                }
                map.put(key, array[i]);
                set.add(array[i]);
            } else {
                if (!map.get(key).equals(array[i])) {
                    return false;
                }
            }
        }

        // 默认的条件下返回正确的结果值。
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba", str = "dog cat cat dog";
        System.out.println(new StringMatch().wordPattern(pattern, str));


    }
}
