package com.string2.www;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName MaxCompareNum
 * @Author Mayuan
 * @Date 2025/12/7/星期日 23:08
 * @Version 1.0
 **/
public class MaxCompareNum {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<String, Integer> map = new HashMap<>();
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            Set<Character> set = new HashSet<>();
            for (int j = i; j < Math.min(n, j + maxSize); j++) {
                char c = s.charAt(j);
                set.add(c);
                if(set.size() > maxLetters) {
                    break;
                }
                sb.append(c);
                if(j-i+1>=minSize) {
                    String key = sb.toString();
                    if(!map.containsKey(key)) {
                        map.put(key, 1);
                    } else {
                        map.put(key, map.get(key) + 1);
                    }
                    ans = Math.max(ans, map.get(key));
                }
            }
        }
        return ans;
    }
}
