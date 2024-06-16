package com.AAAA.www;

import java.util.*;

/**
 * @author ASUS
 */
public class Main {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            String sort = sort(s);
            if (!map.containsKey(sort)) {
                map.put(sort, new ArrayList<>());
            }
            map.get(sort).add(s);
        }

        for (var j : map.keySet()) {
            result.add(map.get(j));
        }
        return result;
    }

    static String sort(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        result.forEach(System.out::println);
    }
}