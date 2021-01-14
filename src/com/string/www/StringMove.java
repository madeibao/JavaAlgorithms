package com.string.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName StringMove
 * @Author：Mayuan
 * @Date 2020/11/2 22:36
 * @Description TODO
 * @Version 1.0
 **/
public class StringMove {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }

    public static void main(String[] args) {
        String[] ch = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res = groupAnagrams(ch);
        res.forEach(System.out::println);
    }
}
