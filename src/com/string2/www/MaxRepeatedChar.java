package com.string2.www;

import java.util.HashMap;

/**
 * @ClassName MaxRepeatedChar
 * @Author：Mayuan
 * @Date 2025/9/21/星期日 19:09
 * @Version 1.0
 **/
public class MaxRepeatedChar {
    public int maxRepOpt1(String text) {
        int n = text.length();
        int res = 1;
        char[] chs = text.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chs) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < chs.length;) {
            int j = i;
            while (j < n && chs[j] == chs[i]) {
                j++;
            }
            int current = j - i;
            res = Math.max(res, current);
            if (map.get(chs[i]) > current && (j < n || i > 0)) {
                res = Math.max(res, current + 1);
            }
            int k = j + 1;
            while (k < n && chs[i] == chs[k]) {
                k++;
            }
            res = Math.max(res, Math.min(k - i, map.get(chs[i])));
            i = j;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "aabaa";
        System.out.println(new MaxRepeatedChar().maxRepOpt1(str));
    }
}
