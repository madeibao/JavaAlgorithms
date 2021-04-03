package com.string.www;

import java.util.*;

/**
 * @ClassName TopKthString2
 * @Author：Mayuan
 * @Date 2020/10/12 21:11
 * @Description TODO
 * @Version 1.0
 * <p>
 * 投票算法，如果票数相同，那么则按照字母的顺序来进行排序。
 **/
public class TopKthString2 {

    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // 存储的是map的entry 类型。
        List<Map.Entry<String, Integer>> list2 = new ArrayList<>(map.entrySet());
        // 下面是自定义的排序情况。
        Collections.sort(list2, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().intValue() == o1.getValue().intValue() ? o1.getKey().compareTo(o2.getKey()) :
                        o2.getValue() - o1.getValue();
            }
        });

        // 把这些内容给追加进去。
        List<String> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {

            // 获得键值对的键
            res.add(list2.get(i).getKey());
        }

        return res;
    }


    public static void main(String[] args) {
        String[] res = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> res2 = topKFrequent(res, k);
        res2.forEach(System.out::println);
    }
}
