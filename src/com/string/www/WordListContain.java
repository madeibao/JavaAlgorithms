package com.string.www;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName WordListContain
 * @Author：Mayuan
 * @Date 2020/5/18 21:04
 * @Description TODO
 * @Version 1.0
 * <p>
 * 给你一个字符串数组 words ，数组中的每个字符串都可以看作是一个单词。请你按 任意 顺序返回 words 中是其他单词的子字符串的所有单词。
 * <p>
 * 如果你可以删除 words[j] 最左侧和/或最右侧的若干字符得到 word[i] ，那么字符串 words[i] 就是 words[j] 的一个子字符串。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：words = ["mass","as","hero","superhero"]
 * 输出：["as","hero"]
 * 解释："as" 是 "mass" 的子字符串，"hero" 是 "superhero" 的子字符串。
 * ["hero","as"] 也是有效的答案。
 * 示例 2：
 * <p>
 * 输入：words = ["leetcode","et","code"]
 * 输出：["et","code"]
 * 解释："et" 和 "code" 都是 "leetcode" 的子字符串。
 * 示例 3：
 * <p>
 * 输入：words = ["blue","green","bu"]
 * 输出：[]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/string-matching-in-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class WordListContain {

    public static List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            for (String w : words) {
                if (!word.equals(w) && w.contains(word)) {
                    set.add(word);
                }
            }
        }
        List<String> ans = new ArrayList<>(set);
        return ans;
    }

    public static void main(String[] args) {

        String[] strs = {"mass", "as", "hero", "superhero"};
        System.out.println(stringMatching(strs));
    }
}
