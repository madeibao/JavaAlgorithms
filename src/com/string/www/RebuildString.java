package com.string.www;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @ClassName RebuildString
 * @Author：Mayuan
 * @Date 2020/5/15 19:04
 * @Description TODO
 * @Version 1.0
 * <p>
 * 重新的构建字符串的结果值。
 * <p>
 * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 * 根据出现的频率来字符串中的字符串的出现的频率，降序的排序。
 * 示例 1:
 * <p>
 * 输入:
 * "tree"
 * <p>
 * 输出:
 * "eert"
 * <p>
 * 解释:
 * 'e'出现两次，'r'和't'都只出现一次。
 * 因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
 * 示例 2:
 * <p>
 * 输入:
 * "cccaaa"
 * <p>
 * 输出:
 * "cccaaa"
 * <p>
 * 解释:
 * 'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
 * 注意"cacaca"是不正确的，因为相同的字母必须放在一起。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-characters-by-frequency
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 重新构建字符串的结果值。
 **/
public class RebuildString {
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        PriorityQueue<Character> queue = new PriorityQueue<>((Character e1, Character e2) -> map.get(e2) - map.get(e1));

        // 把所有的字符集合都添加进去。
        // 首先是所有的字符的集合都添加进去来进行。
        queue.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();

        // 只要优先权队列不为空，那么就逐渐的弹出。
        while (!queue.isEmpty()) {
            Character c = queue.poll();
            int values = map.get(c);
            for (int i = 0; i < values; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
