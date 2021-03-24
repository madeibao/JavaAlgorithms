package com.string.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StringPartition
 * @Author：Mayuan
 * @Date 2020/3/17 16:25
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的分割算法
 * 给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
 * <p>
 * 返回 s 所有可能的分割方案。
 * <p>
 * 示例:
 * <p>
 * 输入: "aab"
 * 输出:
 * [
 * ["aa","b"],
 * ["a","a","b"]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-partitioning
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 经典的回溯算法
 **/
public class StringPartition {
    private static List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        dfs(s, 0, new ArrayList<String>(), list);
        return list;
    }

    private static void dfs(String s, int start, ArrayList<String> path, List<List<String>> list) {
        if (start == s.length()) {
            list.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            String s1 = s.substring(start, i + 1);
            if (!isPalindrome(s1)) {
                continue;
            }
            path.add(s1);
            dfs(s, i + 1, path, list);
            path.remove(path.size() - 1);
        }
    }

    private static boolean isPalindrome(String s) {

        if (s == null || s.length() <= 1) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<String>> res = partition("aab");
        for (List<String> r : res) {
            for (String s : r) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
