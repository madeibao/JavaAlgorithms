package com.string2.www;

import java.util.HashMap;

/**
 * @ClassName Permutation3
 * @Author：Mayuan
 * @Date 2024/12/1/星期日 22:46
 * @Description TODO
 * @Version 1.0
 **/
public class Permutation3 {
    private static boolean isPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int cnt = 0;
        for (char c : map.keySet()) {
            if (map.get(c) % 2 == 1) {
                cnt++;
            }
        }
        return cnt == 0 || (cnt % 2 == 1 && s.length() % 2 == 1);
    }

    public static void main(String[] args) {
        String str = "code";
        String str2 = "aab";
        String str3 = "aabb";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
    }
}
