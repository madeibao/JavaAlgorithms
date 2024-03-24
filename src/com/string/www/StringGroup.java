package com.string.www;

import java.util.*;

/**
 * @ClassName StringGroup
 * @Author：Mayuan
 * @Date 2020/11/11 21:14
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * java的字母移位分组来实现。
 **/
public class StringGroup {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }
        Map<String, List> ans = new HashMap<String, List>(5);
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList());
            }
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> res = groupAnagrams(strs);
        res.forEach(System.out::println);
    }
}
