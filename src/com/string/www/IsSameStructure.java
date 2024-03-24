package com.string.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName IsSameStructure
 * @Author：Mayuan
 * @Date 2020/3/24 16:45
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断两个字符串的结构是否相同
 **/
public class IsSameStructure {
    public static boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < sc.length; i++) {

            if (!map1.containsKey(sc[i])) {
                map1.put(sc[i], i);
            }
            if (!map2.containsKey(tc[i])) {
                map2.put(tc[i], i);
            }

            if (map1.get(sc[i]).intValue() != map2.get(tc[i]).intValue()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("abb", "egg"));
    }
}



