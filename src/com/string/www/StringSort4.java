package com.string.www;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @ClassName StringSort4
 * @Author：Mayuan
 * @Date 2020/7/3 21:50
 * @Description TODO
 * @Version 1.0
 * <p>
 * 投票算法，最高的票数的结果值。
 * 首先是按照票数来进行排序，然后票数相同的条件下，按照字母的顺序
 * leetcode692
 **/
public class StringSort4 {

    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Long> map = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        PriorityQueue<String> pQueue = new PriorityQueue<>(k, (a, b) -> (int) (map.get(a) == map.get(b) ? b.compareTo(a) : map.get(a) - map.get(b)));
        for (String str : map.keySet()) {
            pQueue.offer(str);
            if (pQueue.size() > k) {
                pQueue.poll();
            }
        }
        String[] res = new String[k];
        for (int i = k - 1; i > -1; --i) {
            res[i] = pQueue.poll();
        }
        return Arrays.asList(res);
    }

    public static void main(String[] args) {
        String[] str2 = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> res = topKFrequent(str2, k);
        System.out.println(res);
    }
}
