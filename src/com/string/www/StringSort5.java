package com.string.www;

import java.util.*;

/**
 * @ClassName StringSort5
 * @Author：Mayuan
 * @Date 2020/7/3 21:57
 * @Description TODO
 * @Version 1.0
 * <p>
 * *  投票算法，最高的票数的结果值。
 * *  首先是按照票数来进行排序，然后票数相同的条件下，按照字母的顺序
 * *  leetcode692
 * *
 **/
public class StringSort5 {
    public static List<String> topKFrequent(String[] words, int k) {
        // 创建map,元素放入
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // 放到list中, 自定义比较器进行排序

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        //自定义的排序值来进行排序。
        Collections.sort(list, new Comparator<>() {
            //先比出现频率, 频率相同比较字符串, 注意用 compareTo()方法
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().intValue() == o1.getValue().intValue() ?
                        o1.getKey().compareTo(o2.getKey()) : o2.getValue() - o1.getValue();
            }
        });

        // 取出前k个放到res中， 将键放进去。
        List<String> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(list.get(i).getKey());
        }
        return res;
    }


    public static void main(String[] args) {
        String[] str2 = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> res = topKFrequent(str2, k);
        System.out.println(res);
    }
}
