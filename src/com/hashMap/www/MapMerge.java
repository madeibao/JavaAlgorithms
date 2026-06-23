package com.hashMap.www;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @ClassName MapMerge
 * @Author Mayuan
 * @Date 2026/1/11/星期日 18:18
 * @Version 1.0
 **/
public class MapMerge {
    public static void main(String[] args) {
        Map<String, Integer> wordCount = new HashMap<>();
        List<String> words = List.of("apple", "banana", "apple", "cherry", "banana", "apple");
        // 传统方式
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        HashMap<String, Integer> wordCount2 = new HashMap<>();
        for(var j: words) {
            wordCount2.put(j, wordCount2.getOrDefault(j, 0) + 1);
        }

        // lambda 表达式方式遍历
        wordCount2.forEach((k, v) -> System.out.println(k + " " + v));

        // 使用merge()简化
        wordCount.clear();
        for (String word : words) {
            wordCount.merge(word, 1, Integer::sum);
        }

        //V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
        // key：要操作的键
        //
        //value：与key关联的新值（如果key不存在，则使用此值）
        //
        // remappingFunction：重新映射函数，用于合并旧值和新值
        System.out.println(wordCount); // {banana=2, apple=3, cherry=1}
    }
}
