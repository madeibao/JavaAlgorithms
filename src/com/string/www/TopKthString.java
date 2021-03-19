package com.string.www;

import java.util.*;

/**
 * @ClassName TopKthString
 * @Author：Mayuan
 * @Date 2020/10/12 20:52
 * @Description TODO
 * @Version 1.0
 * 排序最高的k个单词内容.
 * 排序条件下最高的k个单词。
 **/
public class TopKthString {

    public static List<String> topKFrequent(String[] words, int k) {
        // 1. 构建词频
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        // 2. 构建最小堆

        // 如果是出现频率相同，那么按照频率来进行排序，频率相同按照字母的顺序来进行排序。
        PriorityQueue<String> minHeap = new PriorityQueue((o1, o2) ->
                (map.get(o1) - map.get(o2) == 0 ? ((String) o2).compareTo(((String) o1)) : map.get(o1) - map.get(o2)));


        for (String word : map.keySet()) {
            minHeap.add(word);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        // 3. 弹出答案
        List<String> ans = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            ans.add(minHeap.poll());
        }

        // 整个的由高到低端的顺序来进行排序。
        Collections.sort(ans, (o1, o2) -> (map.get(o2) - map.get(o1) == 0 ? o1.compareTo(o2) : map.get(o2) - map.get(o1)));
        return ans;
    }

    public static void main(String[] args) {
        String[] res = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> res2 = topKFrequent(res, k);
        res2.forEach(System.out::println);
    }
}
